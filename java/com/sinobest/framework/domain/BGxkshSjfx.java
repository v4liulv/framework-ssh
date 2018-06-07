package com.sinobest.framework.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2017/7/13 0013.
 *
 */
@Entity
@Table(name = "B_GXKSH_SJFX")
public class BGxkshSjfx {
    private String systemid;
    private String gxfxLx;
    private String gxfxName;
    private String gxfxXxsm;
    private String gxfxZyZwmc;
    private String gxfxZyYwmc;
    private Long sfqy;
    private String blzd1;
    private String blzd2;
    private String blzd3;
    private String blzd4;
    private String blzd5;
    private String createpersonName;
    private Time createdate;
    private Time modifydate;

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
    @Column(name = "GXFX_LX", nullable = false, length = 10)
    public String getGxfxLx() {
        return gxfxLx;
    }

    public void setGxfxLx(String gxfxLx) {
        this.gxfxLx = gxfxLx;
    }

    @Basic
    @Column(name = "GXFX_NAME", nullable = false, length = 100)
    public String getGxfxName() {
        return gxfxName;
    }

    public void setGxfxName(String gxfxName) {
        this.gxfxName = gxfxName;
    }

    @Basic
    @Column(name = "GXFX_XXSM", nullable = true, length = 4000)
    public String getGxfxXxsm() {
        return gxfxXxsm;
    }

    public void setGxfxXxsm(String gxfxXxsm) {
        this.gxfxXxsm = gxfxXxsm;
    }

    @Basic
    @Column(name = "GXFX_ZY_ZWMC", nullable = true, length = 200)
    public String getGxfxZyZwmc() {
        return gxfxZyZwmc;
    }

    public void setGxfxZyZwmc(String gxfxZyZwmc) {
        this.gxfxZyZwmc = gxfxZyZwmc;
    }

    @Basic
    @Column(name = "GXFX_ZY_YWMC", nullable = false, length = 200)
    public String getGxfxZyYwmc() {
        return gxfxZyYwmc;
    }

    public void setGxfxZyYwmc(String gxfxZyYwmc) {
        this.gxfxZyYwmc = gxfxZyYwmc;
    }

    @Basic
    @Column(name = "SFQY", nullable = true, precision = 0)
    public Long getSfqy() {
        return sfqy;
    }

    public void setSfqy(Long sfqy) {
        this.sfqy = sfqy;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BGxkshSjfx that = (BGxkshSjfx) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (gxfxLx != null ? !gxfxLx.equals(that.gxfxLx) : that.gxfxLx != null) return false;
        if (gxfxName != null ? !gxfxName.equals(that.gxfxName) : that.gxfxName != null) return false;
        if (gxfxXxsm != null ? !gxfxXxsm.equals(that.gxfxXxsm) : that.gxfxXxsm != null) return false;
        if (gxfxZyZwmc != null ? !gxfxZyZwmc.equals(that.gxfxZyZwmc) : that.gxfxZyZwmc != null) return false;
        if (gxfxZyYwmc != null ? !gxfxZyYwmc.equals(that.gxfxZyYwmc) : that.gxfxZyYwmc != null) return false;
        if (sfqy != null ? !sfqy.equals(that.sfqy) : that.sfqy != null) return false;
        if (blzd1 != null ? !blzd1.equals(that.blzd1) : that.blzd1 != null) return false;
        if (blzd2 != null ? !blzd2.equals(that.blzd2) : that.blzd2 != null) return false;
        if (blzd3 != null ? !blzd3.equals(that.blzd3) : that.blzd3 != null) return false;
        if (blzd4 != null ? !blzd4.equals(that.blzd4) : that.blzd4 != null) return false;
        if (blzd5 != null ? !blzd5.equals(that.blzd5) : that.blzd5 != null) return false;
        if (createpersonName != null ? !createpersonName.equals(that.createpersonName) : that.createpersonName != null)
            return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (modifydate != null ? !modifydate.equals(that.modifydate) : that.modifydate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (gxfxLx != null ? gxfxLx.hashCode() : 0);
        result = 31 * result + (gxfxName != null ? gxfxName.hashCode() : 0);
        result = 31 * result + (gxfxXxsm != null ? gxfxXxsm.hashCode() : 0);
        result = 31 * result + (gxfxZyZwmc != null ? gxfxZyZwmc.hashCode() : 0);
        result = 31 * result + (gxfxZyYwmc != null ? gxfxZyYwmc.hashCode() : 0);
        result = 31 * result + (sfqy != null ? sfqy.hashCode() : 0);
        result = 31 * result + (blzd1 != null ? blzd1.hashCode() : 0);
        result = 31 * result + (blzd2 != null ? blzd2.hashCode() : 0);
        result = 31 * result + (blzd3 != null ? blzd3.hashCode() : 0);
        result = 31 * result + (blzd4 != null ? blzd4.hashCode() : 0);
        result = 31 * result + (blzd5 != null ? blzd5.hashCode() : 0);
        result = 31 * result + (createpersonName != null ? createpersonName.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (modifydate != null ? modifydate.hashCode() : 0);
        return result;
    }
}
