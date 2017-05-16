package bawei.com.mvpdemo.m;

import bawei.com.mvpdemo.p.OnLoginFinishedListener;

/**
 * date:2017/5/16
 * author:周道(leovo)
 * funcation:
 */

public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}
