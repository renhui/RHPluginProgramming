package jianqiang.com.hostapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jianqiang.mypluginlibrary.PluginManager;

import java.io.File;

import dalvik.system.DexClassLoader;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService1InPlugin1(View view) {
        try {
            Intent intent = new Intent();

            String serviceName = PluginManager.plugins.get(0).packageInfo.packageName + ".TestService1";
            intent.setClass(this, Class.forName(serviceName));

            startService(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void startActivityInPlugin1(View view) {
        try {
            Intent intent = new Intent();

            String activityName = PluginManager.plugins.get(0).packageInfo.packageName + ".TestActivity1";
            intent.setClass(this, Class.forName(activityName));

            startActivity(intent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}