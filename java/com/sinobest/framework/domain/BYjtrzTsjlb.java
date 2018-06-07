package com.sinobest.framework.domain;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "B_YJTRZ_TSJLB")
public class BYjtrzTsjlb {
    private String systemid;
    private String tspc;
    private Time tskssj;
    private Long tsjg;
    private Long tssbbs;
    private String tssjl;
    private String jsfdz;
    private Time tsjssj;
    private String tshs;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "TSPC")
    public String getTspc() {
        return tspc;
    }

    public void setTspc(String tspc) {
        this.tspc = tspc;
    }

    @Basic
    @Column(name = "TSKSSJ")
    public Time getTskssj() {
        return tskssj;
    }

    public void setTskssj(Time tskssj) {
        this.tskssj = tskssj;
    }

    @Basic
    @Column(name = "TSJG")
    public Long getTsjg() {
        return tsjg;
    }

    public void setTsjg(Long tsjg) {
        this.tsjg = tsjg;
    }

    @Basic
    @Column(name = "TSSBBS")
    public Long getTssbbs() {
        return tssbbs;
    }

    public void setTssbbs(Long tssbbs) {
        this.tssbbs = tssbbs;
    }

    @Basic
    @Column(name = "TSSJL")
    public String getTssjl() {
        return tssjl;
    }

    public void setTssjl(String tssjl) {
        this.tssjl = tssjl;
    }

    @Basic
    @Column(name = "JSFDZ")
    public String getJsfdz() {
        return jsfdz;
    }

    public void setJsfdz(String jsfdz) {
        this.jsfdz = jsfdz;
    }

    @Basic
    @Column(name = "TSJSSJ")
    public Time getTsjssj() {
        return tsjssj;
    }

    public void setTsjssj(Time tsjssj) {
        this.tsjssj = tsjssj;
    }

    @Basic
    @Column(name = "TSHS")
    public String getTshs() {
        return tshs;
    }

    public void setTshs(String tshs) {
        this.tshs = tshs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BYjtrzTsjlb that = (BYjtrzTsjlb) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (tspc != null ? !tspc.equals(that.tspc) : that.tspc != null) return false;
        if (tskssj != null ? !tskssj.equals(that.tskssj) : that.tskssj != null) return false;
        if (tsjg != null ? !tsjg.equals(that.tsjg) : that.tsjg != null) return false;
        if (tssbbs != null ? !tssbbs.equals(that.tssbbs) : that.tssbbs != null) return false;
        if (tssjl != null ? !tssjl.equals(that.tssjl) : that.tssjl != null) return false;
        if (jsfdz != null ? !jsfdz.equals(that.jsfdz) : that.jsfdz != null) return false;
        if (tsjssj != null ? !tsjssj.equals(that.tsjssj) : that.tsjssj != null) return false;
        if (tshs != null ? !tshs.equals(that.tshs) : that.tshs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (tspc != null ? tspc.hashCode() : 0);
        result = 31 * result + (tskssj != null ? tskssj.hashCode() : 0);
        result = 31 * result + (tsjg != null ? tsjg.hashCode() : 0);
        result = 31 * result + (tssbbs != null ? tssbbs.hashCode() : 0);
        result = 31 * result + (tssjl != null ? tssjl.hashCode() : 0);
        result = 31 * result + (jsfdz != null ? jsfdz.hashCode() : 0);
        result = 31 * result + (tsjssj != null ? tsjssj.hashCode() : 0);
        result = 31 * result + (tshs != null ? tshs.hashCode() : 0);
        return result;
    }
}
