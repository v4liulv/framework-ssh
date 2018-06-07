package com.sinobest.framework.domain;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity
public class Config {
    private String systemid;
    private String name;
    private String code;
    private String colum;
    private String value;
    private Boolean sfqy;
    private String createperson;
    private Time createtime;
    private Timestamp updatetime;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "COLUM")
    public String getColum() {
        return colum;
    }

    public void setColum(String colum) {
        this.colum = colum;
    }

    @Basic
    @Column(name = "VALUE")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "SFQY")
    public Boolean getSfqy() {
        return sfqy;
    }

    public void setSfqy(Boolean sfqy) {
        this.sfqy = sfqy;
    }

    @Basic
    @Column(name = "CREATEPERSON")
    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson;
    }

    @Basic
    @Column(name = "CREATETIME")
    public Time getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Time createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "UPDATETIME")
    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Config config = (Config) o;

        if (systemid != null ? !systemid.equals(config.systemid) : config.systemid != null) return false;
        if (name != null ? !name.equals(config.name) : config.name != null) return false;
        if (code != null ? !code.equals(config.code) : config.code != null) return false;
        if (colum != null ? !colum.equals(config.colum) : config.colum != null) return false;
        if (value != null ? !value.equals(config.value) : config.value != null) return false;
        if (sfqy != null ? !sfqy.equals(config.sfqy) : config.sfqy != null) return false;
        if (createperson != null ? !createperson.equals(config.createperson) : config.createperson != null)
            return false;
        if (createtime != null ? !createtime.equals(config.createtime) : config.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(config.updatetime) : config.updatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (colum != null ? colum.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (sfqy != null ? sfqy.hashCode() : 0);
        result = 31 * result + (createperson != null ? createperson.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        return result;
    }
}
