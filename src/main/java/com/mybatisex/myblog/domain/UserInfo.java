package com.mybatisex.myblog.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pw")
    private String userPw;

    private Date register;

    private Date lastlogin;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_pw
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * @param userPw
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    /**
     * @return register
     */
    public Date getRegister() {
        return register;
    }

    /**
     * @param register
     */
    public void setRegister(Date register) {
        this.register = register;
    }

    /**
     * @return lastlogin
     */
    public Date getLastlogin() {
        return lastlogin;
    }

    /**
     * @param lastlogin
     */
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPw='" + userPw + '\'' +
                ", register=" + register +
                ", lastlogin=" + lastlogin +
                '}';
    }
}