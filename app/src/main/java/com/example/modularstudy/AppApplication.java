package com.example.modularstudy;

import com.derry.login.Login_MainActivity;
import com.xiangxue.common.RecordPathManager;
import com.xiangxue.common.base.BaseApplication;

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        // 如果项目有100个Activity，这种加法会不会太那个？  缺点   全局Map添加工程 以及对应的类 达到子module之间通信
        RecordPathManager.addGroupInfo("app", "MainActivity", MainActivity.class);
        RecordPathManager.addGroupInfo("login", "Login_MainActivity", Login_MainActivity.class);
    }
}
