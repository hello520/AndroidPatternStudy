package lllazy.com.projectpatternstudy.mvpdatabindind.Presenter;

import android.view.View;

import lllazy.com.projectpatternstudy.mvvm.bean.User;
import lllazy.com.projectpatternstudy.mvvm.model.UserModel;

/**
 * Created by jingbin on 2016/11/13.
 */

public class ChangeAgePresenter {

    /**
     * 在Activity使用
     */
    public void changeAge(User myUser) {
        UserModel userModel1 = new UserModel();
        userModel1.changeEssay(myUser, 2);
    }

    /**
     * 布局文件直接使用
     */
    public static void itemClick(View view, final User mUser) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserModel userModel1 = new UserModel();
                userModel1.changeEssay(mUser, 2);
            }
        });
    }
}
