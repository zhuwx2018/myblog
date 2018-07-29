package com.mybatisex.myblog.domain;

import javax.persistence.*;

public class Sysacl {
    @Id
    private Integer aclid;

    private Integer roleid;

    private String functionid;

    private String checktype;

    /**
     * @return aclid
     */
    public Integer getAclid() {
        return aclid;
    }

    /**
     * @param aclid
     */
    public void setAclid(Integer aclid) {
        this.aclid = aclid;
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

    /**
     * @return functionid
     */
    public String getFunctionid() {
        return functionid;
    }

    /**
     * @param functionid
     */
    public void setFunctionid(String functionid) {
        this.functionid = functionid;
    }

    /**
     * @return checktype
     */
    public String getChecktype() {
        return checktype;
    }

    /**
     * @param checktype
     */
    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }
}