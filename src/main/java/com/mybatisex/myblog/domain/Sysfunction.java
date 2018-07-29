package com.mybatisex.myblog.domain;

import javax.persistence.*;
import java.io.Serializable;

public class Sysfunction implements Serializable{
    @Id
    @Column(name = "FUNCTIONID")
    private String functionid;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PARENT")
    private String parent;

    @Column(name = "ORDERNO")
    private Integer orderno;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LOG")
    private String log;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "SUBSYSTEM")
    private String subsystem;

    /**
     * @return FUNCTIONID
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
     * @return LOCATION
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return PARENT
     */
    public String getParent() {
        return parent;
    }

    /**
     * @param parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * @return ORDERNO
     */
    public Integer getOrderno() {
        return orderno;
    }

    /**
     * @param orderno
     */
    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return DESCRIPTION
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
     * @return LOG
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * @return OWNER
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return SUBSYSTEM
     */
    public String getSubsystem() {
        return subsystem;
    }

    /**
     * @param subsystem
     */
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }
}