package jianqiang.com.hostapp;

import android.app.Application;
import android.content.Context;

import com.example.jianqiang.mypluginlibrary.PluginManager;

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        PluginManager.init(this);
    }
}
