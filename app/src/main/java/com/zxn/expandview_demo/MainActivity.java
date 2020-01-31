package com.zxn.expandview_demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zxn.expand.ExpandLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        findViewById(R.id.btn_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragDemoActivity.jumpTo(v.getContext());
            }
        });
        initExpandView();
    }

    private ExpandLayout mExpandLayout;

    public void initExpandView() {
        mExpandLayout = (ExpandLayout) findViewById(R.id.expandLayout);
        mExpandLayout.initExpand(false);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mExpandLayout.toggleExpand();
            }
        });
        findViewById(R.id.tv1).setOnClickListener(this);
        findViewById(R.id.tv2).setOnClickListener(this);
        findViewById(R.id.tv2).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv1) {
            Toast.makeText(this, "tv1", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.tv2) {
            Toast.makeText(this, "tv2", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.tv3) {
            Toast.makeText(this, "tv3", Toast.LENGTH_SHORT).show();
        }
    }
}
