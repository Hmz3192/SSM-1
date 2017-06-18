package com.ssm.util;

/**
 * Created by ThinKPad on 2017/6/18.
 */
public class SeeRecord {
    /*当前登录的用户名*/
    private String loginName;
    /*分页对象*/
    private Page page;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
