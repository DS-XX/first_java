package com.dingding.entity;

/**
 * Created by xpwu on 2019/6/18.
 */
public class User {
    public String username;
    public String password;
    public String getName(){
        return  username;
    }
    public void setName(String username){
        this.username = username;
    }
    public String getPassword(){
        return  password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    @Override
    public String toString(){
        return "user{username = '"+username+"\'"+","+"password = "+ password +"}";
    }
}