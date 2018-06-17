package com.mybatisex.myblog.view;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @Author: zhugf
 * @Description:
 * @Date created in 2018/6/13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu {
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
}
