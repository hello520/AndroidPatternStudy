package lllazy.com.projectpatternstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import lllazy.com.projectpatternstudy.mvc.LoadDataActivity;
import lllazy.com.projectpatternstudy.mvp.UserLoginActivity;
import lllazy.com.projectpatternstudy.mvpdatabindind.MvpDataBindingActivity;
import lllazy.com.projectpatternstudy.mvvm.ChangeAgeActivity;

/**
 * Created by LLLazy on 2017/1/10 0010.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.id_mvc)
    Button btn_mvc;
    @BindView(R.id.id_mvp)
    Button btn_mvp;
    @BindView(R.id.id_mvvm)
    Button btn_mvvm;
    @BindView(R.id.id_mvp_data)
    Button btn_mvp_data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn_mvc.setOnClickListener(this);
        btn_mvp.setOnClickListener(this);
        btn_mvvm.setOnClickListener(this);
        btn_mvp_data.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_mvc:// MVC 以更新数据为例
                startActivity(new Intent(MainActivity.this, LoadDataActivity.class));
                break;
            case R.id.id_mvp:// MVP 以用户登录为例
                startActivity(new Intent(MainActivity.this, UserLoginActivity.class));
                break;
            case R.id.id_mvvm:// MVVM + data-binding 以点击一下按钮然后年龄会+2 为例
                startActivity(new Intent(MainActivity.this, ChangeAgeActivity.class));
                break;
            case R.id.id_mvp_data:// MVP + data-binding 以点击一下按钮然后年龄会+2 为例
                startActivity(new Intent(MainActivity.this, MvpDataBindingActivity.class));
                break;
            default:
                break;
        }
    }
}
