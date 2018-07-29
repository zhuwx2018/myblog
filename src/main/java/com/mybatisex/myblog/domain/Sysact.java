package com.mybatisex.myblog.domain;

import javax.persistence.*;

public class Sysact {
    @Id
    private Integer actid;

    private String userid;

    private Integer roleid;

    /**
     * @return actid
     */
    public Integer getActid() {
        return actid;
    }

    /**
     * @param actid
     */
    public void setActid(Integer actid) {
        this.actid = actid;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return roleid
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}