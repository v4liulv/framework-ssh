package com.sinobest.framework.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "B_YJTRZ_TSFHMB")
public class BYjtrzTsfhmb {
    private String systemid;
    private String tsJsfMethod;
    private String tsJsfzd;
    private String tsJsffhjgCode;
    private String tsJsffhjgValue;
    private Long tsJsffhjgIscuss;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "TS_JSF_METHOD")
    public String getTsJsfMethod() {
        return tsJsfMethod;
    }

    public void setTsJsfMethod(String tsJsfMethod) {
        this.tsJsfMethod = tsJsfMethod;
    }

    @Basic
    @Column(name = "TS_JSFZD")
    public String getTsJsfzd() {
        return tsJsfzd;
    }

    public void setTsJsfzd(String tsJsfzd) {
        this.tsJsfzd = tsJsfzd;
    }

    @Basic
    @Column(name = "TS_JSFFHJG_CODE")
    public String getTsJsffhjgCode() {
        return tsJsffhjgCode;
    }

    public void setTsJsffhjgCode(String tsJsffhjgCode) {
        this.tsJsffhjgCode = tsJsffhjgCode;
    }

    @Basic
    @Column(name = "TS_JSFFHJG_VALUE")
    public String getTsJsffhjgValue() {
        return tsJsffhjgValue;
    }

    public void setTsJsffhjgValue(String tsJsffhjgValue) {
        this.tsJsffhjgValue = tsJsffhjgValue;
    }

    @Basic
    @Column(name = "TS_JSFFHJG_ISCUSS")
    public Long getTsJsffhjgIscuss() {
        return tsJsffhjgIscuss;
    }

    public void setTsJsffhjgIscuss(Long tsJsffhjgIscuss) {
        this.tsJsffhjgIscuss = tsJsffhjgIscuss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BYjtrzTsfhmb that = (BYjtrzTsfhmb) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (tsJsfMethod != null ? !tsJsfMethod.equals(that.tsJsfMethod) : that.tsJsfMethod != null) return false;
        if (tsJsfzd != null ? !tsJsfzd.equals(that.tsJsfzd) : that.tsJsfzd != null) return false;
        if (tsJsffhjgCode != null ? !tsJsffhjgCode.equals(that.tsJsffhjgCode) : that.tsJsffhjgCode != null)
            return false;
        if (tsJsffhjgValue != null ? !tsJsffhjgValue.equals(that.tsJsffhjgValue) : that.tsJsffhjgValue != null)
            return false;
        if (tsJsffhjgIscuss != null ? !tsJsffhjgIscuss.equals(that.tsJsffhjgIscuss) : that.tsJsffhjgIscuss != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (tsJsfMethod != null ? tsJsfMethod.hashCode() : 0);
        result = 31 * result + (tsJsfzd != null ? tsJsfzd.hashCode() : 0);
        result = 31 * result + (tsJsffhjgCode != null ? tsJsffhjgCode.hashCode() : 0);
        result = 31 * result + (tsJsffhjgValue != null ? tsJsffhjgValue.hashCode() : 0);
        result = 31 * result + (tsJsffhjgIscuss != null ? tsJsffhjgIscuss.hashCode() : 0);
        return result;
    }
}
