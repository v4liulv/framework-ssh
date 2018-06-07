package com.sinobest.framework.domain;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "B_YJTRZ_TSJL_LOG")
public class BYjtrzTsjlLog {
    private String systemid;
    private String tsPc;
    private String tsZj;
    private Time tsSj;
    private String tsTab;
    private String errorInfo;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "TS_PC")
    public String getTsPc() {
        return tsPc;
    }

    public void setTsPc(String tsPc) {
        this.tsPc = tsPc;
    }

    @Basic
    @Column(name = "TS_ZJ")
    public String getTsZj() {
        return tsZj;
    }

    public void setTsZj(String tsZj) {
        this.tsZj = tsZj;
    }

    @Basic
    @Column(name = "TS_SJ")
    public Time getTsSj() {
        return tsSj;
    }

    public void setTsSj(Time tsSj) {
        this.tsSj = tsSj;
    }

    @Basic
    @Column(name = "TS_TAB")
    public String getTsTab() {
        return tsTab;
    }

    public void setTsTab(String tsTab) {
        this.tsTab = tsTab;
    }

    @Basic
    @Column(name = "ERROR_INFO")
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BYjtrzTsjlLog that = (BYjtrzTsjlLog) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (tsPc != null ? !tsPc.equals(that.tsPc) : that.tsPc != null) return false;
        if (tsZj != null ? !tsZj.equals(that.tsZj) : that.tsZj != null) return false;
        if (tsSj != null ? !tsSj.equals(that.tsSj) : that.tsSj != null) return false;
        if (tsTab != null ? !tsTab.equals(that.tsTab) : that.tsTab != null) return false;
        if (errorInfo != null ? !errorInfo.equals(that.errorInfo) : that.errorInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (tsPc != null ? tsPc.hashCode() : 0);
        result = 31 * result + (tsZj != null ? tsZj.hashCode() : 0);
        result = 31 * result + (tsSj != null ? tsSj.hashCode() : 0);
        result = 31 * result + (tsTab != null ? tsTab.hashCode() : 0);
        result = 31 * result + (errorInfo != null ? errorInfo.hashCode() : 0);
        return result;
    }
}
