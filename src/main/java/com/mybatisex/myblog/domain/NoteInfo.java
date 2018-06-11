package com.mybatisex.myblog.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "note_info")
public class NoteInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 隶属的子版块的ID同son_module_info中的id
     */
    @Column(name = "module_id")
    private Integer moduleId;

    /**
     * 回复帖子的id（同本表id)
     */
    @Column(name = "up_id")
    private Integer upId;

    /**
     * 帖子标题
     */
    private String title;

    /**
     * 发帖时间
     */
    private Date time;

    /**
     * 发帖人（同user_info中的user_name）
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 浏览次数
     */
    private Integer times;

    /**
     * 帖子的内容
     */
    private String cont;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取隶属的子版块的ID同son_module_info中的id
     *
     * @return module_id - 隶属的子版块的ID同son_module_info中的id
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 设置隶属的子版块的ID同son_module_info中的id
     *
     * @param moduleId 隶属的子版块的ID同son_module_info中的id
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 获取回复帖子的id（同本表id)
     *
     * @return up_id - 回复帖子的id（同本表id)
     */
    public Integer getUpId() {
        return upId;
    }

    /**
     * 设置回复帖子的id（同本表id)
     *
     * @param upId 回复帖子的id（同本表id)
     */
    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    /**
     * 获取帖子标题
     *
     * @return title - 帖子标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置帖子标题
     *
     * @param title 帖子标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取发帖时间
     *
     * @return time - 发帖时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置发帖时间
     *
     * @param time 发帖时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取发帖人（同user_info中的user_name）
     *
     * @return user_name - 发帖人（同user_info中的user_name）
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置发帖人（同user_info中的user_name）
     *
     * @param userName 发帖人（同user_info中的user_name）
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取浏览次数
     *
     * @return times - 浏览次数
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * 设置浏览次数
     *
     * @param times 浏览次数
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * 获取帖子的内容
     *
     * @return cont - 帖子的内容
     */
    public String getCont() {
        return cont;
    }

    /**
     * 设置帖子的内容
     *
     * @param cont 帖子的内容
     */
    public void setCont(String cont) {
        this.cont = cont;
    }
}