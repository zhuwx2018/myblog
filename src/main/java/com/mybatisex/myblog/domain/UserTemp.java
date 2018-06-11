package com.mybatisex.myblog.domain;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/5
 */
public class UserTemp {
    private String userName;
    private String userPw;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "UserTemp{" +
                "userName='" + userName + '\'' +
                ", userPw='" + userPw + '\'' +
                '}';
    }
}
