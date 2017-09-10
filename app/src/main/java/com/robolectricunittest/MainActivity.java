package com.robolectricunittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mBtnClick;
    private TextView mTxtView;

    @ Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mBtnClick =(Button)findViewById(R.id.btn_click);
        mTxtView =(TextView)findViewById(R.id.text_view);

        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              mTxtView.setText(getResources().getString(R.string.app_name));
            }
        });
    }
}
