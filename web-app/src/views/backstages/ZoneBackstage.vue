<template>
  <div class="home">
    <div class="table-actions">
      <div>空间区域管理</div>
      <div style="flex: 1" />
      <a-button
        type="primary"
        shape="round"
        class="btn"
        @click="importDialog = true"
      >
        <template #icon><import-outlined /></template>
        导入
      </a-button>
      <a-button type="primary" shape="round" class="btn" @click="exportData">
        <template #icon><export-outlined /></template>
        导出
      </a-button>
    </div>
    <a-table :dataSource="zones" :columns="headers" />
    <a-modal
      :visible="importDialog"
      title="导入数据"
      @ok="submitImport"
      @cancel="importDialog = false"
    >
      <a-upload
        :file-list="files"
        :before-upload="readFile"
        @remove="handleRemove"
      >
        <a-button>选择文件</a-button></a-upload
      >
      <a-table
        v-if="importData.length > 0"
        :dataSource="importData"
        :columns="headers"
      />
    </a-modal>
  </div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";
import { ExportOutlined, ImportOutlined } from "@ant-design/icons-vue";
import { message } from "ant-design-vue";
import FileSaver from "file-saver";
import moment from "moment";
import * as XLSX from "xlsx";
import * as api from "@/api";

@Options({
  components: {
    ExportOutlined,
    ImportOutlined,
  },
})
export default class Zone extends Vue {
  importDialog = false;
  files: File[] = [];
  importData = new Array<api.ZoneDto>();
  zones: api.ZoneDto[] = new Array<api.ZoneDto>();
  headers = [
    {
      title: "区域名称",
      dataIndex: "name",
      key: "name",
    },
    {
      title: "空调设备编号",
      dataIndex: "acCode",
      key: "acCode",
    },
    {
      title: "温度偏好",
      dataIndex: "tempPreference",
      key: "tempPreference",
    },
    {
      title: "风速偏好",
      dataIndex: "windSpeedPreference",
      key: "windSpeedPreference",
    },
  ];

  async created(): Promise<void> {
    await this.refresh();
  }

  async refresh(): Promise<void> {
    this.zones = (await api.空间区域接口Service.getUsingGet({})).data;
  }

  async readFile(file: File) {
    if (!file) return;
    this.files.push(file);

    this.importData = await this.readExcel(file);

    return false;
  }

  handleRemove(): void {
    this.files = [];
    this.importData = [];
  }

  async submitImport(): Promise<void> {
    this.importDialog = false;
    await api.空间区域接口Service.postManyUsingPost({
      body: this.importData,
    });
    await this.refresh();
  }

  async readExcel(file: File) {
    let data = await new Promise<any>((resolve, reject) => {
      let reader = new FileReader();
      reader.onload = (e) => resolve(e.target!.result);
      reader.onerror = (e) => reject(e);
      reader.readAsBinaryString(file);
    });
    let workbook = XLSX.read(data, { type: "binary" });
    let sheet = workbook.Sheets[workbook.SheetNames[0]];
    const cells = Object.keys(sheet).filter((x) => x[0] != "!");
    let rows = Array.from(
      new Set(cells.map((x) => parseInt(x.replace(/[^\d.]/g, ""))))
    ).sort((x, y) => x - y);
    let cols = Array.from(
      new Set(cells.map((x) => x.replace(/[^\D.]/g, "")))
    ).sort((x, y) => (x > y ? 1 : -1));
    let d: any[] = [];
    for (let row of rows) {
      if (row <= 1) continue;
      let obj: any = {};
      for (let col of cols) {
        obj[sheet[`${col}1`].w] = sheet[`${col}${row}`].v;
      }
      d.push(obj);
    }
    return d;
  }

  async exportData() {
    if (this.zones.length == 0) {
      message.info("当前没有数据可以导出");
    }
    const data: any[][] = [];
    let header = Object.keys(this.zones[0]);
    data.push(header);

    for (let zone of this.zones) {
      let row: any = [];
      for (let col of header) {
        row.push((zone as any)[col]);
      }
      data.push(row);
    }

    this.writeDataToExcel(
      data,
      `Zone-${moment().format("YYYY-MM-DD HH:mm:ss")}`
    );
  }

  writeDataToExcel(data: any[][], name: string) {
    const workbook = XLSX.utils.book_new();
    const sheet = XLSX.utils.aoa_to_sheet(data);

    XLSX.utils.book_append_sheet(workbook, sheet);
    const out = XLSX.write(workbook, { bookType: "xlsx", type: "binary" });
    const blob = new Blob([this.s2ab(out)], {
      type: "application/octet-stream",
    });
    FileSaver.saveAs(blob, `${name}.xlsx`);
  }

  s2ab(s: string) {
    const buf = new ArrayBuffer(s.length);
    const view = new Uint8Array(buf);
    for (let i = 0; i !== s.length; ++i) view[i] = s.charCodeAt(i) & 0xff;
    return buf;
  }
}
</script>

<style scoped>
.home {
  position: absolute;
  inset: 0;
}

.table-actions {
  display: flex;
  height: 40px;
}

.btn {
  margin: 0 10px;
}

.upload_file {
  font-size: 20px;
  opacity: 0;
  position: absolute;
  left: 0px;
  top: 0px;
  filter: alpha(opacity=0);
  width: 84px;
  height: 32px;
}
</style>