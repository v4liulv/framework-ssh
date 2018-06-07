package com.sinobest.framework.domain;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "B_YJTRZ_DJPZB")
public class BYjtrzDjpzb {
    private String systemid;
    private Long logtype;
    private String tsurl;
    private String wsdl;
    private String method;
    private Time dstskssj;
    private Time dstsjssj;
    private Long sfqy;
    private Long czlx;
    private Long czjg;
    private String tspl;
    private String code;
    private String regid;
    private String method1;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "LOGTYPE")
    public Long getLogtype() {
        return logtype;
    }

    public void setLogtype(Long logtype) {
        this.logtype = logtype;
    }

    @Basic
    @Column(name = "TSURL")
    public String getTsurl() {
        return tsurl;
    }

    public void setTsurl(String tsurl) {
        this.tsurl = tsurl;
    }

    @Basic
    @Column(name = "WSDL")
    public String getWsdl() {
        return wsdl;
    }

    public void setWsdl(String wsdl) {
        this.wsdl = wsdl;
    }

    @Basic
    @Column(name = "METHOD")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "DSTSKSSJ")
    public Time getDstskssj() {
        return dstskssj;
    }

    public void setDstskssj(Time dstskssj) {
        this.dstskssj = dstskssj;
    }

    @Basic
    @Column(name = "DSTSJSSJ")
    public Time getDstsjssj() {
        return dstsjssj;
    }

    public void setDstsjssj(Time dstsjssj) {
        this.dstsjssj = dstsjssj;
    }

    @Basic
    @Column(name = "SFQY")
    public Long getSfqy() {
        return sfqy;
    }

    public void setSfqy(Long sfqy) {
        this.sfqy = sfqy;
    }

    @Basic
    @Column(name = "CZLX")
    public Long getCzlx() {
        return czlx;
    }

    public void setCzlx(Long czlx) {
        this.czlx = czlx;
    }

    @Basic
    @Column(name = "CZJG")
    public Long getCzjg() {
        return czjg;
    }

    public void setCzjg(Long czjg) {
        this.czjg = czjg;
    }

    @Basic
    @Column(name = "TSPL")
    public String getTspl() {
        return tspl;
    }

    public void setTspl(String tspl) {
        this.tspl = tspl;
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
    @Column(name = "REGID")
    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
    }

    @Basic
    @Column(name = "METHOD1")
    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BYjtrzDjpzb that = (BYjtrzDjpzb) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (logtype != null ? !logtype.equals(that.logtype) : that.logtype != null) return false;
        if (tsurl != null ? !tsurl.equals(that.tsurl) : that.tsurl != null) return false;
        if (wsdl != null ? !wsdl.equals(that.wsdl) : that.wsdl != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (dstskssj != null ? !dstskssj.equals(that.dstskssj) : that.dstskssj != null) return false;
        if (dstsjssj != null ? !dstsjssj.equals(that.dstsjssj) : that.dstsjssj != null) return false;
        if (sfqy != null ? !sfqy.equals(that.sfqy) : that.sfqy != null) return false;
        if (czlx != null ? !czlx.equals(that.czlx) : that.czlx != null) return false;
        if (czjg != null ? !czjg.equals(that.czjg) : that.czjg != null) return false;
        if (tspl != null ? !tspl.equals(that.tspl) : that.tspl != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (regid != null ? !regid.equals(that.regid) : that.regid != null) return false;
        if (method1 != null ? !method1.equals(that.method1) : that.method1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (logtype != null ? logtype.hashCode() : 0);
        result = 31 * result + (tsurl != null ? tsurl.hashCode() : 0);
        result = 31 * result + (wsdl != null ? wsdl.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (dstskssj != null ? dstskssj.hashCode() : 0);
        result = 31 * result + (dstsjssj != null ? dstsjssj.hashCode() : 0);
        result = 31 * result + (sfqy != null ? sfqy.hashCode() : 0);
        result = 31 * result + (czlx != null ? czlx.hashCode() : 0);
        result = 31 * result + (czjg != null ? czjg.hashCode() : 0);
        result = 31 * result + (tspl != null ? tspl.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (regid != null ? regid.hashCode() : 0);
        result = 31 * result + (method1 != null ? method1.hashCode() : 0);
        return result;
    }
}
