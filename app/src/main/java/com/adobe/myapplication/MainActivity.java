package com.adobe.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    FirebaseAnalytics mFirebaseInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseInstance = FirebaseAnalytics.getInstance(this);

        mFirebaseInstance.setUserProperty("Language","English");

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID,"1");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,"green tshirt");
                mFirebaseInstance.logEvent(FirebaseAnalytics.Event.ADD_TO_CART,bundle);
            }
        });


        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID,"2");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,"blue tshirt");
                mFirebaseInstance.logEvent(FirebaseAnalytics.Event.ADD_TO_CART,bundle);
            }
        });
    }
}
