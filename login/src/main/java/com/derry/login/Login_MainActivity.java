package com.derry.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiangxue.common.RecordPathManager;


public class Login_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity_main);
    }

    // login --> main(暂时这样显示，模拟module之间的跳转)
    public void jumpToMain(View view) {
        // todo 方式一 类加载
        // 类加载跳转，可以成功。维护成本较高且容易出现人为失误
        try {
            Class<?> targetClass = Class.forName("com.example.modularstudy.MainActivity.java");
            Intent intent = new Intent(this, targetClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // personal/Personal_MainActivity getMap
        // todo 方式二 全局Map
        Class<?> targetActivity =
                RecordPathManager.startTargetActivity("app", "MainActivity");
        startActivity(new Intent(this, targetActivity));
    }
}
