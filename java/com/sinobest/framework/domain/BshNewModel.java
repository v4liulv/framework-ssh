package com.sinobest.framework.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Entity(name = "BSH_NEW_MODEL")
public class BshNewModel {
    private String bshNewTablename;
    private String bshNewLb;
    private long bshNewIsyx;
    private String systemid;

    @Basic
    @Column(name = "BSH_NEW_TABLENAME")
    public String getBshNewTablename() {
        return bshNewTablename;
    }

    public void setBshNewTablename(String bshNewTablename) {
        this.bshNewTablename = bshNewTablename;
    }

    @Basic
    @Column(name = "BSH_NEW_LB")
    public String getBshNewLb() {
        return bshNewLb;
    }

    public void setBshNewLb(String bshNewLb) {
        this.bshNewLb = bshNewLb;
    }

    @Basic
    @Column(name = "BSH_NEW_ISYX")
    public long getBshNewIsyx() {
        return bshNewIsyx;
    }

    public void setBshNewIsyx(long bshNewIsyx) {
        this.bshNewIsyx = bshNewIsyx;
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

        BshNewModel that = (BshNewModel) o;

        if (bshNewIsyx != that.bshNewIsyx) return false;
        if (bshNewTablename != null ? !bshNewTablename.equals(that.bshNewTablename) : that.bshNewTablename != null)
            return false;
        if (bshNewLb != null ? !bshNewLb.equals(that.bshNewLb) : that.bshNewLb != null) return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bshNewTablename != null ? bshNewTablename.hashCode() : 0;
        result = 31 * result + (bshNewLb != null ? bshNewLb.hashCode() : 0);
        result = 31 * result + (int) (bshNewIsyx ^ (bshNewIsyx >>> 32));
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        return result;
    }
}
