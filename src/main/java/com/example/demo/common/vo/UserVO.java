package com.example.demo.common.vo;

import java.io.Serializable;

public abstract class UserVO implements Serializable {

    public abstract String toString();

    public abstract String getUserId();
    public abstract String getUserName();
    public abstract String getUserRole();
    public abstract String getPasswd();

}
