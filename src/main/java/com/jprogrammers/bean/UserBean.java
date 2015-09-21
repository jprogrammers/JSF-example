package com.jprogrammers.bean;

import javax.faces.bean.ManagedBean;

/**
 * Created by jprogrammers.
 */
@ManagedBean
public class UserBean {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
