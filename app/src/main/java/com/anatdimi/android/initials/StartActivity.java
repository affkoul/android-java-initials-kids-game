package com.anatdimi.android.initials;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by anat dimi on 3/15/2020.
 */

public class StartActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        Intent intent = new Intent(this, MainScreenActivity.class);
        MobileAds.initialize(this, "ca-app-pub-3809225966364213~5159502075");
        startActivity(intent);









    }
}
