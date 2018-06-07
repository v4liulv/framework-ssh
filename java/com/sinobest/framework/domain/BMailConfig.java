package com.sinobest.framework.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "B_MAIL_CONFIG")
public class BMailConfig {
    private String systemid;
    private String mailaddress;
    private String mailusername;
    private String mainpassword;
    private Long maillogo;
    private Long isenable;
    private String maildescribe;
    private Long mailusertype;
    private Long mailuse;

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "MAILADDRESS")
    public String getMailaddress() {
        return mailaddress;
    }

    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress;
    }

    @Basic
    @Column(name = "MAILUSERNAME")
    public String getMailusername() {
        return mailusername;
    }

    public void setMailusername(String mailusername) {
        this.mailusername = mailusername;
    }

    @Basic
    @Column(name = "MAINPASSWORD")
    public String getMainpassword() {
        return mainpassword;
    }

    public void setMainpassword(String mainpassword) {
        this.mainpassword = mainpassword;
    }

    @Basic
    @Column(name = "MAILLOGO")
    public Long getMaillogo() {
        return maillogo;
    }

    public void setMaillogo(Long maillogo) {
        this.maillogo = maillogo;
    }

    @Basic
    @Column(name = "ISENABLE")
    public Long getIsenable() {
        return isenable;
    }

    public void setIsenable(Long isenable) {
        this.isenable = isenable;
    }

    @Basic
    @Column(name = "MAILDESCRIBE")
    public String getMaildescribe() {
        return maildescribe;
    }

    public void setMaildescribe(String maildescribe) {
        this.maildescribe = maildescribe;
    }

    @Basic
    @Column(name = "MAILUSERTYPE")
    public Long getMailusertype() {
        return mailusertype;
    }

    public void setMailusertype(Long mailusertype) {
        this.mailusertype = mailusertype;
    }

    @Basic
    @Column(name = "MAILUSE")
    public Long getMailuse() {
        return mailuse;
    }

    public void setMailuse(Long mailuse) {
        this.mailuse = mailuse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BMailConfig that = (BMailConfig) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (mailaddress != null ? !mailaddress.equals(that.mailaddress) : that.mailaddress != null) return false;
        if (mailusername != null ? !mailusername.equals(that.mailusername) : that.mailusername != null) return false;
        if (mainpassword != null ? !mainpassword.equals(that.mainpassword) : that.mainpassword != null) return false;
        if (maillogo != null ? !maillogo.equals(that.maillogo) : that.maillogo != null) return false;
        if (isenable != null ? !isenable.equals(that.isenable) : that.isenable != null) return false;
        if (maildescribe != null ? !maildescribe.equals(that.maildescribe) : that.maildescribe != null) return false;
        if (mailusertype != null ? !mailusertype.equals(that.mailusertype) : that.mailusertype != null) return false;
        if (mailuse != null ? !mailuse.equals(that.mailuse) : that.mailuse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (mailaddress != null ? mailaddress.hashCode() : 0);
        result = 31 * result + (mailusername != null ? mailusername.hashCode() : 0);
        result = 31 * result + (mainpassword != null ? mainpassword.hashCode() : 0);
        result = 31 * result + (maillogo != null ? maillogo.hashCode() : 0);
        result = 31 * result + (isenable != null ? isenable.hashCode() : 0);
        result = 31 * result + (maildescribe != null ? maildescribe.hashCode() : 0);
        result = 31 * result + (mailusertype != null ? mailusertype.hashCode() : 0);
        result = 31 * result + (mailuse != null ? mailuse.hashCode() : 0);
        return result;
    }
}
