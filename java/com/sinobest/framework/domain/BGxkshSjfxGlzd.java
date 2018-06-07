package com.sinobest.framework.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2017/7/13 0013.
 */
@Entity
@Table(name = "B_GXKSH_SJFX_GLZD")
public class BGxkshSjfxGlzd {
    private String systemid;
    private String sjfxZj;
    private String glzdBzYwmc;
    private String glzdBzZwmc;
    private String glzdYbysYwmc;
    private String blzd1;
    private String blzd2;
    private String blzd3;
    private String blzd4;
    private String blzd5;
    private String createpersonName;
    private Time createdate;
    private Time modifydate;
    private Long isDate;

    @Id
    @Column(name = "SYSTEMID", nullable = false, length = 50)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "SJFX_ZJ", nullable = false, length = 50)
    public String getSjfxZj() {
        return sjfxZj;
    }

    public void setSjfxZj(String sjfxZj) {
        this.sjfxZj = sjfxZj;
    }

    @Basic
    @Column(name = "GLZD_BZ_YWMC", nullable = false, length = 30)
    public String getGlzdBzYwmc() {
        return glzdBzYwmc;
    }

    public void setGlzdBzYwmc(String glzdBzYwmc) {
        this.glzdBzYwmc = glzdBzYwmc;
    }

    @Basic
    @Column(name = "GLZD_BZ_ZWMC", nullable = false, length = 100)
    public String getGlzdBzZwmc() {
        return glzdBzZwmc;
    }

    public void setGlzdBzZwmc(String glzdBzZwmc) {
        this.glzdBzZwmc = glzdBzZwmc;
    }

    @Basic
    @Column(name = "GLZD_YBYS_YWMC", nullable = false, length = 30)
    public String getGlzdYbysYwmc() {
        return glzdYbysYwmc;
    }

    public void setGlzdYbysYwmc(String glzdYbysYwmc) {
        this.glzdYbysYwmc = glzdYbysYwmc;
    }

    @Basic
    @Column(name = "BLZD1", nullable = true, length = 1000)
    public String getBlzd1() {
        return blzd1;
    }

    public void setBlzd1(String blzd1) {
        this.blzd1 = blzd1;
    }

    @Basic
    @Column(name = "BLZD2", nullable = true, length = 1000)
    public String getBlzd2() {
        return blzd2;
    }

    public void setBlzd2(String blzd2) {
        this.blzd2 = blzd2;
    }

    @Basic
    @Column(name = "BLZD3", nullable = true, length = 1000)
    public String getBlzd3() {
        return blzd3;
    }

    public void setBlzd3(String blzd3) {
        this.blzd3 = blzd3;
    }

    @Basic
    @Column(name = "BLZD4", nullable = true, length = 1000)
    public String getBlzd4() {
        return blzd4;
    }

    public void setBlzd4(String blzd4) {
        this.blzd4 = blzd4;
    }

    @Basic
    @Column(name = "BLZD5", nullable = true, length = 1000)
    public String getBlzd5() {
        return blzd5;
    }

    public void setBlzd5(String blzd5) {
        this.blzd5 = blzd5;
    }

    @Basic
    @Column(name = "CREATEPERSON_NAME", nullable = true, length = 20)
    public String getCreatepersonName() {
        return createpersonName;
    }

    public void setCreatepersonName(String createpersonName) {
        this.createpersonName = createpersonName;
    }

    @Basic
    @Column(name = "CREATEDATE", nullable = true)
    public Time getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Time createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "MODIFYDATE", nullable = true)
    public Time getModifydate() {
        return modifydate;
    }

    public void setModifydate(Time modifydate) {
        this.modifydate = modifydate;
    }

    @Basic
    @Column(name = "IS_DATE", nullable = true, precision = 0)
    public Long getIsDate() {
        return isDate;
    }

    public void setIsDate(Long isDate) {
        this.isDate = isDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BGxkshSjfxGlzd that = (BGxkshSjfxGlzd) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (sjfxZj != null ? !sjfxZj.equals(that.sjfxZj) : that.sjfxZj != null) return false;
        if (glzdBzYwmc != null ? !glzdBzYwmc.equals(that.glzdBzYwmc) : that.glzdBzYwmc != null) return false;
        if (glzdBzZwmc != null ? !glzdBzZwmc.equals(that.glzdBzZwmc) : that.glzdBzZwmc != null) return false;
        if (glzdYbysYwmc != null ? !glzdYbysYwmc.equals(that.glzdYbysYwmc) : that.glzdYbysYwmc != null) return false;
        if (blzd1 != null ? !blzd1.equals(that.blzd1) : that.blzd1 != null) return false;
        if (blzd2 != null ? !blzd2.equals(that.blzd2) : that.blzd2 != null) return false;
        if (blzd3 != null ? !blzd3.equals(that.blzd3) : that.blzd3 != null) return false;
        if (blzd4 != null ? !blzd4.equals(that.blzd4) : that.blzd4 != null) return false;
        if (blzd5 != null ? !blzd5.equals(that.blzd5) : that.blzd5 != null) return false;
        if (createpersonName != null ? !createpersonName.equals(that.createpersonName) : that.createpersonName != null)
            return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (modifydate != null ? !modifydate.equals(that.modifydate) : that.modifydate != null) return false;
        if (isDate != null ? !isDate.equals(that.isDate) : that.isDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (sjfxZj != null ? sjfxZj.hashCode() : 0);
        result = 31 * result + (glzdBzYwmc != null ? glzdBzYwmc.hashCode() : 0);
        result = 31 * result + (glzdBzZwmc != null ? glzdBzZwmc.hashCode() : 0);
        result = 31 * result + (glzdYbysYwmc != null ? glzdYbysYwmc.hashCode() : 0);
        result = 31 * result + (blzd1 != null ? blzd1.hashCode() : 0);
        result = 31 * result + (blzd2 != null ? blzd2.hashCode() : 0);
        result = 31 * result + (blzd3 != null ? blzd3.hashCode() : 0);
        result = 31 * result + (blzd4 != null ? blzd4.hashCode() : 0);
        result = 31 * result + (blzd5 != null ? blzd5.hashCode() : 0);
        result = 31 * result + (createpersonName != null ? createpersonName.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (modifydate != null ? modifydate.hashCode() : 0);
        result = 31 * result + (isDate != null ? isDate.hashCode() : 0);
        return result;
    }
}
