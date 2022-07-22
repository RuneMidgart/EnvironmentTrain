package com.training.environment.po;

public class Zone {
    private Integer id;

    private String name;

    private String acCode;

    private Integer tempPreference;

    private Integer windSpeedPreference;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAcCode() {
        return acCode;
    }

    public void setAcCode(String acCode) {
        this.acCode = acCode == null ? null : acCode.trim();
    }

    public Integer getTempPreference() {
        return tempPreference;
    }

    public void setTempPreference(Integer tempPreference) {
        this.tempPreference = tempPreference;
    }

    public Integer getWindSpeedPreference() {
        return windSpeedPreference;
    }

    public void setWindSpeedPreference(Integer windSpeedPreference) {
        this.windSpeedPreference = windSpeedPreference;
    }
}