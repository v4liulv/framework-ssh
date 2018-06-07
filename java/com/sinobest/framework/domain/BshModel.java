package com.sinobest.framework.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/10 0010.
 *
 */
@Entity(name = "BSH_MODEL")
public class BshModel {
    private String bshTablename;
    private String bshLb;
    private long bshIsyx;
    private String systemid;

    @Basic
    @Column(name = "BSH_TABLENAME")
    public String getBshTablename() {
        return bshTablename;
    }

    public void setBshTablename(String bshTablename) {
        this.bshTablename = bshTablename;
    }

    @Basic
    @Column(name = "BSH_LB")
    public String getBshLb() {
        return bshLb;
    }

    public void setBshLb(String bshLb) {
        this.bshLb = bshLb;
    }

    @Basic
    @Column(name = "BSH_ISYX")
    public long getBshIsyx() {
        return bshIsyx;
    }

    public void setBshIsyx(long bshIsyx) {
        this.bshIsyx = bshIsyx;
    }

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BshModel bshModel = (BshModel) o;

        if (bshIsyx != bshModel.bshIsyx) return false;
        if (bshTablename != null ? !bshTablename.equals(bshModel.bshTablename) : bshModel.bshTablename != null)
            return false;
        if (bshLb != null ? !bshLb.equals(bshModel.bshLb) : bshModel.bshLb != null) return false;
        if (systemid != null ? !systemid.equals(bshModel.systemid) : bshModel.systemid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bshTablename != null ? bshTablename.hashCode() : 0;
        result = 31 * result + (bshLb != null ? bshLb.hashCode() : 0);
        result = 31 * result + (int) (bshIsyx ^ (bshIsyx >>> 32));
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        return result;
    }
}
