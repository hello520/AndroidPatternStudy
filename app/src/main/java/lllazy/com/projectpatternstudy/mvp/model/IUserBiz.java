package lllazy.com.projectpatternstudy.mvp.model;

/**
 * Created by jingbin on 2016/11/3.
 */

public interface IUserBiz {

    public void login(String username, String password, OnLoginListener loginListener);
}
