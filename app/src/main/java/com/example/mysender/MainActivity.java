package com.example.mysender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    EditText Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(sender);
        Name=(EditText)findViewById(R.id.input_Name);
    }
    private OnClickListener sender=new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setAction("burning.say");
            String iname=Name.getEditableText().toString();
            intent.putExtra("OName",iname);
            sendBroadcast(intent);
        }
    };
}
