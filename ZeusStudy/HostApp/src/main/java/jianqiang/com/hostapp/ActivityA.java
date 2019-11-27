package jianqiang.com.hostapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jianqiang.mypluginlibrary.PluginManager;

import dalvik.system.DexClassLoader;

public class ActivityA extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }
}