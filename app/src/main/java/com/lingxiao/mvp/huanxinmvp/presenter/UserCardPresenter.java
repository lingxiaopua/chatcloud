package com.lingxiao.mvp.huanxinmvp.presenter;

/**
 * Created by lingxiao on 17-7-16.
 */

public interface UserCardPresenter {
    void logOut();
    void getUserInfo();
    void changeUserInfo(int type,String path,String name,int integers);
}
