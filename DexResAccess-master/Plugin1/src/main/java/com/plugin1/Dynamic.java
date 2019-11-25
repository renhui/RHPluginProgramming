package com.plugin1;

import android.content.Context;

import com.example.jianqiang.mypluginlibrary.IDynamic;

public class Dynamic implements IDynamic {
    @Override
    public String getStringForResId(Context context) {
        return context.getResources().getString(R.string.myplugin1_hello_world);
    }
}
