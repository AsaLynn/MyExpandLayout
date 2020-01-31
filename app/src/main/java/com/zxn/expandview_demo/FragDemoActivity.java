package com.zxn.expandview_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class FragDemoActivity extends AppCompatActivity {

    public static void jumpTo(Context context) {
        Intent intent = new Intent(context, FragDemoActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_demo);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fl_content,ExpandLayoutFragment.newInstance()).commitAllowingStateLoss();
    }
}
