package jianqiang.com.plugin1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jianqiang.mypluginlibrary.ZeusBaseActivity;

public class TestActivity1 extends ZeusBaseActivity {
    private final static String TAG = "TestActivity1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();

                    String activityName = "jianqiang.com.hostapp.ActivityA";
                    intent.setComponent(new ComponentName("jianqiang.com.hostapp", activityName));

                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
