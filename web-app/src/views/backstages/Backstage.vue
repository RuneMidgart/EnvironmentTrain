<script lang="ts">
import { Options, Vue } from "vue-class-component";
import { ExpandOutlined } from "@ant-design/icons-vue";

@Options({
  components: {
    ExpandOutlined,
  },
})
export default class Backstage extends Vue {
  routeTo(path: string) {
    this.$router.push(path);
  }
}
</script>

<template>
  <div class="home">
    <div class="menu">
      <div class="menu-header">后台管理</div>
      <div class="menu-subheader">测试练习用</div>
      <a-menu style="flex: 1">
        <a-menu-item key="1" @click="routeTo('/backstages/zones')">
          <template #icon>
            <expand-outlined />
          </template>
          空间区域
        </a-menu-item>
      </a-menu>
    </div>
    <router-view
      style="
        position: absolute;
        left: 200px;
        margin: 10px;
        border-radius: 5px;
        box-shadow: 0 0 10px 5px rgba(0, 0, 0, 0.1);
        padding: 10px;
      "
    ></router-view>
  </div>
</template>

<style scoped>
.home {
  position: absolute;
  inset: 0;
}

.menu {
  position: absolute;
  top: 0;
  left: 0;
  right: calc(100% - 200px);
  bottom: 0;
  display: flex;
  flex-direction: column;
}

.menu-header {
  text-align: left;
  padding-left: 10px;
  height: 40px;
  line-height: 50px;
  font-size: 20px;
  font-weight: bold;
  border-right: 1px solid #f0f0f0;
}

.menu-subheader {
  text-align: left;
  padding: 0 0 0 10px;
  height: 20px;
  border-right: 1px solid #f0f0f0;
  border-bottom: 1px solid #f0f0f0;
}
</style>
