package com.sinobest.framework.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "B_YJTRZ_DYSJCJPZB")
public class BYjtrzDysjcjpzb {
    private String systemid;
    private String yjtlogtab;
    private String yjtlogfield;
    private String rzxtjsfield;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "YJTLOGTAB")
    public String getYjtlogtab() {
        return yjtlogtab;
    }

    public void setYjtlogtab(String yjtlogtab) {
        this.yjtlogtab = yjtlogtab;
    }

    @Basic
    @Column(name = "YJTLOGFIELD")
    public String getYjtlogfield() {
        return yjtlogfield;
    }

    public void setYjtlogfield(String yjtlogfield) {
        this.yjtlogfield = yjtlogfield;
    }

    @Basic
    @Column(name = "RZXTJSFIELD")
    public String getRzxtjsfield() {
        return rzxtjsfield;
    }

    public void setRzxtjsfield(String rzxtjsfield) {
        this.rzxtjsfield = rzxtjsfield;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BYjtrzDysjcjpzb that = (BYjtrzDysjcjpzb) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (yjtlogtab != null ? !yjtlogtab.equals(that.yjtlogtab) : that.yjtlogtab != null) return false;
        if (yjtlogfield != null ? !yjtlogfield.equals(that.yjtlogfield) : that.yjtlogfield != null) return false;
        if (rzxtjsfield != null ? !rzxtjsfield.equals(that.rzxtjsfield) : that.rzxtjsfield != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (yjtlogtab != null ? yjtlogtab.hashCode() : 0);
        result = 31 * result + (yjtlogfield != null ? yjtlogfield.hashCode() : 0);
        result = 31 * result + (rzxtjsfield != null ? rzxtjsfield.hashCode() : 0);
        return result;
    }
}
