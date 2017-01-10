package lllazy.com.projectpatternstudy.mvp.model;


import lllazy.com.projectpatternstudy.mvp.bean.User;

/**
 * Created by jingbin on 2016/11/3.
 */

public interface OnLoginListener {

    void loginSuccess(User user);

    void loginFailed();
}
