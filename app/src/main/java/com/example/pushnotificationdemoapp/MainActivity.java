package com.example.pushnotificationdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView moutputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moutputText = (TextView) findViewById(R.id.outputTextview);

        Bundle bundle= new Bundle();

        bundle.keySet().toString();

//        moutputText.setText(bundle.keySet().toString());
//        moutputText.setText(getIntent().getExtras().getString(bundle.getString("One")));

        if (getIntent() != null){
            for (String key: getIntent().getExtras().keySet()
                 ) {
                moutputText.append(getIntent().getExtras().get(key).toString() + "\n");
                Log.d("Key",key + ":- "+ getIntent().getExtras().get(key).toString() + "\n" );

            }
        }

//        moutputText.append(getIntent().getExtras().get("Two").toString());

//        moutputText.append(getIntent().getData().toString());



        }
    }
