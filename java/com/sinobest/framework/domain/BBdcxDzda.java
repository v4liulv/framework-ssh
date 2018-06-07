package com.sinobest.framework.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by liulv on 2017/4/25.
 *
 * 实体类对象B_BDCX_DZDA
 */
/*@Table(name = "B_BDCX_DZDA", schema = "base", catalog = "")*/
@Entity(name = "B_BDCX_DZDA")
public class BBdcxDzda
{
    private String systemid;
    private String dalb;
    private String dhmc;
    private String fjdh;
    private String lx;
    private String zsxs;
    private String zyBh;
    private String zyYwmc;
    private String zyZwmc;
    private String sjly;
    private String sjyBh;
    private String tjzd;
    private String cxlx;
    private String gxbh;
    private String gnmc;
    private String gnlj;
    private Byte xshs;
    private Long px;
    private Long pls;
    private String ssqy;
    private String dabh;
    private String qqfwzy;
    private String qqfwtjzd;
    private String sfqy;
    private String sfqydc;
    private String reserver1;
    private String reserver2;
    private String reserver3;
    private String reserver4;
    private String reserver5;
    private String glgxmc;
    private String glgxdz;
    private String gltj;
    private String xbsjly;
    private String sortname;
    private String sfqycz;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "SYSTEMID", nullable = false, length = 50)
    public String getSystemid()
    {
        return systemid;
    }

    public void setSystemid(String systemid)
    {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "DALB", nullable = true, length = 1)
    public String getDalb()
    {
        return dalb;
    }

    public void setDalb(String dalb)
    {
        this.dalb = dalb;
    }

    @Basic
    @Column(name = "DHMC", nullable = true, length = 50)
    public String getDhmc()
    {
        return dhmc;
    }

    public void setDhmc(String dhmc)
    {
        this.dhmc = dhmc;
    }

    @Basic
    @Column(name = "FJDH", nullable = true, length = 50)
    public String getFjdh()
    {
        return fjdh;
    }

    public void setFjdh(String fjdh)
    {
        this.fjdh = fjdh;
    }

    @Basic
    @Column(name = "LX", nullable = true, length = 1)
    public String getLx()
    {
        return lx;
    }

    public void setLx(String lx)
    {
        this.lx = lx;
    }

    @Basic
    @Column(name = "ZSXS", nullable = true, length = 1)
    public String getZsxs()
    {
        return zsxs;
    }

    public void setZsxs(String zsxs)
    {
        this.zsxs = zsxs;
    }

    @Basic
    @Column(name = "ZY_BH", nullable = true, length = 50)
    public String getZyBh()
    {
        return zyBh;
    }

    public void setZyBh(String zyBh)
    {
        this.zyBh = zyBh;
    }

    @Basic
    @Column(name = "ZY_YWMC", nullable = true, length = 50)
    public String getZyYwmc()
    {
        return zyYwmc;
    }

    public void setZyYwmc(String zyYwmc)
    {
        this.zyYwmc = zyYwmc;
    }

    @Basic
    @Column(name = "ZY_ZWMC", nullable = true, length = 50)
    public String getZyZwmc()
    {
        return zyZwmc;
    }

    public void setZyZwmc(String zyZwmc)
    {
        this.zyZwmc = zyZwmc;
    }

    @Basic
    @Column(name = "SJLY", nullable = true, length = 1)
    public String getSjly()
    {
        return sjly;
    }

    public void setSjly(String sjly)
    {
        this.sjly = sjly;
    }

    @Basic
    @Column(name = "SJY_BH", nullable = true, length = 50)
    public String getSjyBh()
    {
        return sjyBh;
    }

    public void setSjyBh(String sjyBh)
    {
        this.sjyBh = sjyBh;
    }

    @Basic
    @Column(name = "TJZD", nullable = true, length = 50)
    public String getTjzd()
    {
        return tjzd;
    }

    public void setTjzd(String tjzd)
    {
        this.tjzd = tjzd;
    }

    @Basic
    @Column(name = "CXLX", nullable = true, length = 1)
    public String getCxlx()
    {
        return cxlx;
    }

    public void setCxlx(String cxlx)
    {
        this.cxlx = cxlx;
    }

    @Basic
    @Column(name = "GXBH", nullable = true, length = 50)
    public String getGxbh()
    {
        return gxbh;
    }

    public void setGxbh(String gxbh)
    {
        this.gxbh = gxbh;
    }

    @Basic
    @Column(name = "GNMC", nullable = true, length = 50)
    public String getGnmc()
    {
        return gnmc;
    }

    public void setGnmc(String gnmc)
    {
        this.gnmc = gnmc;
    }

    @Basic
    @Column(name = "GNLJ", nullable = true, length = 1000)
    public String getGnlj()
    {
        return gnlj;
    }

    public void setGnlj(String gnlj)
    {
        this.gnlj = gnlj;
    }

    @Basic
    @Column(name = "XSHS", nullable = true, precision = 0)
    public Byte getXshs()
    {
        return xshs;
    }

    public void setXshs(Byte xshs)
    {
        this.xshs = xshs;
    }

    @Basic
    @Column(name = "PX", nullable = true, precision = 0)
    public Long getPx()
    {
        return px;
    }

    public void setPx(Long px)
    {
        this.px = px;
    }

    @Basic
    @Column(name = "PLS", nullable = true, precision = 0)
    public Long getPls()
    {
        return pls;
    }

    public void setPls(Long pls)
    {
        this.pls = pls;
    }

    @Basic
    @Column(name = "SSQY", nullable = true, length = 50)
    public String getSsqy()
    {
        return ssqy;
    }

    public void setSsqy(String ssqy)
    {
        this.ssqy = ssqy;
    }

    @Basic
    @Column(name = "DABH", nullable = true, length = 50)
    public String getDabh()
    {
        return dabh;
    }

    public void setDabh(String dabh)
    {
        this.dabh = dabh;
    }

    @Basic
    @Column(name = "QQFWZY", nullable = true, length = 50)
    public String getQqfwzy()
    {
        return qqfwzy;
    }

    public void setQqfwzy(String qqfwzy)
    {
        this.qqfwzy = qqfwzy;
    }

    @Basic
    @Column(name = "QQFWTJZD", nullable = true, length = 50)
    public String getQqfwtjzd()
    {
        return qqfwtjzd;
    }

    public void setQqfwtjzd(String qqfwtjzd)
    {
        this.qqfwtjzd = qqfwtjzd;
    }

    @Basic
    @Column(name = "SFQY", nullable = true, length = 1)
    public String getSfqy()
    {
        return sfqy;
    }

    public void setSfqy(String sfqy)
    {
        this.sfqy = sfqy;
    }

    @Basic
    @Column(name = "SFQYDC", nullable = true, length = 50)
    public String getSfqydc()
    {
        return sfqydc;
    }

    public void setSfqydc(String sfqydc)
    {
        this.sfqydc = sfqydc;
    }

    @Basic
    @Column(name = "RESERVER1", nullable = true, length = 2000)
    public String getReserver1()
    {
        return reserver1;
    }

    public void setReserver1(String reserver1)
    {
        this.reserver1 = reserver1;
    }

    @Basic
    @Column(name = "RESERVER2", nullable = true, length = 2000)
    public String getReserver2()
    {
        return reserver2;
    }

    public void setReserver2(String reserver2)
    {
        this.reserver2 = reserver2;
    }

    @Basic
    @Column(name = "RESERVER3", nullable = true, length = 2000)
    public String getReserver3()
    {
        return reserver3;
    }

    public void setReserver3(String reserver3)
    {
        this.reserver3 = reserver3;
    }

    @Basic
    @Column(name = "RESERVER4", nullable = true, length = 2000)
    public String getReserver4()
    {
        return reserver4;
    }

    public void setReserver4(String reserver4)
    {
        this.reserver4 = reserver4;
    }

    @Basic
    @Column(name = "RESERVER5", nullable = true, length = 2000)
    public String getReserver5()
    {
        return reserver5;
    }

    public void setReserver5(String reserver5)
    {
        this.reserver5 = reserver5;
    }

    @Basic
    @Column(name = "GLGXMC", nullable = true, length = 25)
    public String getGlgxmc()
    {
        return glgxmc;
    }

    public void setGlgxmc(String glgxmc)
    {
        this.glgxmc = glgxmc;
    }

    @Basic
    @Column(name = "GLGXDZ", nullable = true, length = 200)
    public String getGlgxdz()
    {
        return glgxdz;
    }

    public void setGlgxdz(String glgxdz)
    {
        this.glgxdz = glgxdz;
    }

    @Basic
    @Column(name = "GLTJ", nullable = true, length = 2000)
    public String getGltj()
    {
        return gltj;
    }

    public void setGltj(String gltj)
    {
        this.gltj = gltj;
    }

    @Basic
    @Column(name = "XBSJLY", nullable = true, length = 10)
    public String getXbsjly()
    {
        return xbsjly;
    }

    public void setXbsjly(String xbsjly)
    {
        this.xbsjly = xbsjly;
    }

    @Basic
    @Column(name = "SORTNAME", nullable = true, length = 50)
    public String getSortname()
    {
        return sortname;
    }

    public void setSortname(String sortname)
    {
        this.sortname = sortname;
    }

    @Basic
    @Column(name = "SFQYCZ", nullable = true, length = 1)
    public String getSfqycz()
    {
        return sfqycz;
    }

    public void setSfqycz(String sfqycz)
    {
        this.sfqycz = sfqycz;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BBdcxDzda bBdcxDzda = (BBdcxDzda) o;

        if (systemid != null ? !systemid.equals(bBdcxDzda.systemid) : bBdcxDzda.systemid != null) return false;
        if (dalb != null ? !dalb.equals(bBdcxDzda.dalb) : bBdcxDzda.dalb != null) return false;
        if (dhmc != null ? !dhmc.equals(bBdcxDzda.dhmc) : bBdcxDzda.dhmc != null) return false;
        if (fjdh != null ? !fjdh.equals(bBdcxDzda.fjdh) : bBdcxDzda.fjdh != null) return false;
        if (lx != null ? !lx.equals(bBdcxDzda.lx) : bBdcxDzda.lx != null) return false;
        if (zsxs != null ? !zsxs.equals(bBdcxDzda.zsxs) : bBdcxDzda.zsxs != null) return false;
        if (zyBh != null ? !zyBh.equals(bBdcxDzda.zyBh) : bBdcxDzda.zyBh != null) return false;
        if (zyYwmc != null ? !zyYwmc.equals(bBdcxDzda.zyYwmc) : bBdcxDzda.zyYwmc != null) return false;
        if (zyZwmc != null ? !zyZwmc.equals(bBdcxDzda.zyZwmc) : bBdcxDzda.zyZwmc != null) return false;
        if (sjly != null ? !sjly.equals(bBdcxDzda.sjly) : bBdcxDzda.sjly != null) return false;
        if (sjyBh != null ? !sjyBh.equals(bBdcxDzda.sjyBh) : bBdcxDzda.sjyBh != null) return false;
        if (tjzd != null ? !tjzd.equals(bBdcxDzda.tjzd) : bBdcxDzda.tjzd != null) return false;
        if (cxlx != null ? !cxlx.equals(bBdcxDzda.cxlx) : bBdcxDzda.cxlx != null) return false;
        if (gxbh != null ? !gxbh.equals(bBdcxDzda.gxbh) : bBdcxDzda.gxbh != null) return false;
        if (gnmc != null ? !gnmc.equals(bBdcxDzda.gnmc) : bBdcxDzda.gnmc != null) return false;
        if (gnlj != null ? !gnlj.equals(bBdcxDzda.gnlj) : bBdcxDzda.gnlj != null) return false;
        if (xshs != null ? !xshs.equals(bBdcxDzda.xshs) : bBdcxDzda.xshs != null) return false;
        if (px != null ? !px.equals(bBdcxDzda.px) : bBdcxDzda.px != null) return false;
        if (pls != null ? !pls.equals(bBdcxDzda.pls) : bBdcxDzda.pls != null) return false;
        if (ssqy != null ? !ssqy.equals(bBdcxDzda.ssqy) : bBdcxDzda.ssqy != null) return false;
        if (dabh != null ? !dabh.equals(bBdcxDzda.dabh) : bBdcxDzda.dabh != null) return false;
        if (qqfwzy != null ? !qqfwzy.equals(bBdcxDzda.qqfwzy) : bBdcxDzda.qqfwzy != null) return false;
        if (qqfwtjzd != null ? !qqfwtjzd.equals(bBdcxDzda.qqfwtjzd) : bBdcxDzda.qqfwtjzd != null) return false;
        if (sfqy != null ? !sfqy.equals(bBdcxDzda.sfqy) : bBdcxDzda.sfqy != null) return false;
        if (sfqydc != null ? !sfqydc.equals(bBdcxDzda.sfqydc) : bBdcxDzda.sfqydc != null) return false;
        if (reserver1 != null ? !reserver1.equals(bBdcxDzda.reserver1) : bBdcxDzda.reserver1 != null) return false;
        if (reserver2 != null ? !reserver2.equals(bBdcxDzda.reserver2) : bBdcxDzda.reserver2 != null) return false;
        if (reserver3 != null ? !reserver3.equals(bBdcxDzda.reserver3) : bBdcxDzda.reserver3 != null) return false;
        if (reserver4 != null ? !reserver4.equals(bBdcxDzda.reserver4) : bBdcxDzda.reserver4 != null) return false;
        if (reserver5 != null ? !reserver5.equals(bBdcxDzda.reserver5) : bBdcxDzda.reserver5 != null) return false;
        if (glgxmc != null ? !glgxmc.equals(bBdcxDzda.glgxmc) : bBdcxDzda.glgxmc != null) return false;
        if (glgxdz != null ? !glgxdz.equals(bBdcxDzda.glgxdz) : bBdcxDzda.glgxdz != null) return false;
        if (gltj != null ? !gltj.equals(bBdcxDzda.gltj) : bBdcxDzda.gltj != null) return false;
        if (xbsjly != null ? !xbsjly.equals(bBdcxDzda.xbsjly) : bBdcxDzda.xbsjly != null) return false;
        if (sortname != null ? !sortname.equals(bBdcxDzda.sortname) : bBdcxDzda.sortname != null) return false;
        if (sfqycz != null ? !sfqycz.equals(bBdcxDzda.sfqycz) : bBdcxDzda.sfqycz != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (dalb != null ? dalb.hashCode() : 0);
        result = 31 * result + (dhmc != null ? dhmc.hashCode() : 0);
        result = 31 * result + (fjdh != null ? fjdh.hashCode() : 0);
        result = 31 * result + (lx != null ? lx.hashCode() : 0);
        result = 31 * result + (zsxs != null ? zsxs.hashCode() : 0);
        result = 31 * result + (zyBh != null ? zyBh.hashCode() : 0);
        result = 31 * result + (zyYwmc != null ? zyYwmc.hashCode() : 0);
        result = 31 * result + (zyZwmc != null ? zyZwmc.hashCode() : 0);
        result = 31 * result + (sjly != null ? sjly.hashCode() : 0);
        result = 31 * result + (sjyBh != null ? sjyBh.hashCode() : 0);
        result = 31 * result + (tjzd != null ? tjzd.hashCode() : 0);
        result = 31 * result + (cxlx != null ? cxlx.hashCode() : 0);
        result = 31 * result + (gxbh != null ? gxbh.hashCode() : 0);
        result = 31 * result + (gnmc != null ? gnmc.hashCode() : 0);
        result = 31 * result + (gnlj != null ? gnlj.hashCode() : 0);
        result = 31 * result + (xshs != null ? xshs.hashCode() : 0);
        result = 31 * result + (px != null ? px.hashCode() : 0);
        result = 31 * result + (pls != null ? pls.hashCode() : 0);
        result = 31 * result + (ssqy != null ? ssqy.hashCode() : 0);
        result = 31 * result + (dabh != null ? dabh.hashCode() : 0);
        result = 31 * result + (qqfwzy != null ? qqfwzy.hashCode() : 0);
        result = 31 * result + (qqfwtjzd != null ? qqfwtjzd.hashCode() : 0);
        result = 31 * result + (sfqy != null ? sfqy.hashCode() : 0);
        result = 31 * result + (sfqydc != null ? sfqydc.hashCode() : 0);
        result = 31 * result + (reserver1 != null ? reserver1.hashCode() : 0);
        result = 31 * result + (reserver2 != null ? reserver2.hashCode() : 0);
        result = 31 * result + (reserver3 != null ? reserver3.hashCode() : 0);
        result = 31 * result + (reserver4 != null ? reserver4.hashCode() : 0);
        result = 31 * result + (reserver5 != null ? reserver5.hashCode() : 0);
        result = 31 * result + (glgxmc != null ? glgxmc.hashCode() : 0);
        result = 31 * result + (glgxdz != null ? glgxdz.hashCode() : 0);
        result = 31 * result + (gltj != null ? gltj.hashCode() : 0);
        result = 31 * result + (xbsjly != null ? xbsjly.hashCode() : 0);
        result = 31 * result + (sortname != null ? sortname.hashCode() : 0);
        result = 31 * result + (sfqycz != null ? sfqycz.hashCode() : 0);
        return result;
    }
}
