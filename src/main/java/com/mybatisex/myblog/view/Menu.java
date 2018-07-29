package com.mybatisex.myblog.view;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "handler" })
public class Menu implements Comparable<Menu>,Serializable {
    @JSONField(name = "id")
    private String menuId;
    @JSONField(name="label")
    private String title;
    private Integer order;
    private String url;
    private String type;
    private String parent;
    
    private List<Menu> children;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public int compareTo(Menu o) {
        if(this.getOrder()>=o.getOrder()){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public int hashCode() {
        return this.getMenuId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Menu){
            Menu menu = (Menu) obj;
            if (menu.getMenuId().equals(this.getMenuId())){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
