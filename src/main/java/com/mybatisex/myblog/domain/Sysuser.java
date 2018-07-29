package com.mybatisex.myblog.domain;

import javax.persistence.*;
import java.util.Date;

public class Sysuser {
    @Id
    private String userid;

    private String passwd;

    private String operatorname;

    private String dept;

    private String description;

    private String isleader;

    private String iplist;

    private String checkip;

    private String operator;

    private Date operatetime;

    private String lockstate;

    private String unlocktime;

    private String phone;

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
     * @return passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return operatorname
     */
    public String getOperatorname() {
        return operatorname;
    }

    /**
     * @param operatorname
     */
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    /**
     * @return dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return isleader
     */
    public String getIsleader() {
        return isleader;
    }

    /**
     * @param isleader
     */
    public void setIsleader(String isleader) {
        this.isleader = isleader;
    }

    /**
     * @return iplist
     */
    public String getIplist() {
        return iplist;
    }

    /**
     * @param iplist
     */
    public void setIplist(String iplist) {
        this.iplist = iplist;
    }

    /**
     * @return checkip
     */
    public String getCheckip() {
        return checkip;
    }

    /**
     * @param checkip
     */
    public void setCheckip(String checkip) {
        this.checkip = checkip;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    /**
     * @return lockstate
     */
    public String getLockstate() {
        return lockstate;
    }

    /**
     * @param lockstate
     */
    public void setLockstate(String lockstate) {
        this.lockstate = lockstate;
    }

    /**
     * @return unlocktime
     */
    public String getUnlocktime() {
        return unlocktime;
    }

    /**
     * @param unlocktime
     */
    public void setUnlocktime(String unlocktime) {
        this.unlocktime = unlocktime;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}