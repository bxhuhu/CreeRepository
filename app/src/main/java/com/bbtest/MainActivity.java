package com.bbtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvAnim;
    //测试提交
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        checkBoxView = (ImageView) findViewById(R.id.checkbox);
//        checkBoxView.setOnClickListener(this);
    }

    private boolean isChecked;
    ImageView checkBoxView;

    void onClick() {
        isChecked = !isChecked;
        final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
//        radioButtonView.setImageState(stateSet, true);
        checkBoxView.setImageState(stateSet, true);
//        expandCollapseView.setImageState(stateSet, true);
    }

    @Override
    public void onClick(View v) {
        onClick();
    }
}
