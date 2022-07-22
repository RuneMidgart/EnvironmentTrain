package com.training.environment.dto;

import com.training.environment.po.Zone;
import lombok.Data;

/**
 * 空间区域的传输模型
 */
@Data
public class ZoneDto {
    private String name;
    private String acCode;
    private Integer tempPreference;
    private Integer windSpeedPreference;

    /**
     * 将数据库中查出的PO的各属性赋值给新建的DTO
     * (仅适用于简单对象)
     * @param po 持久化对象
     */
    public void importPo(Zone po){
        this.setName(po.getName());
        this.setAcCode(po.getAcCode());
        this.setTempPreference(po.getTempPreference());
        this.setWindSpeedPreference(po.getWindSpeedPreference());
    }

    /**
     * 根据DTO生成新的PO
     * @return 持久化对象
     */
    public Zone generatePo(){
        Zone po = new Zone();
        po.setId(null);
        po.setName(this.getName());
        po.setAcCode(this.getAcCode());
        po.setTempPreference(this.getTempPreference());
        po.setWindSpeedPreference(this.getWindSpeedPreference());
        return  po;
    }
}
