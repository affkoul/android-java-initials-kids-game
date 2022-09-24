package com.anatdimi.android.initials;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


import static com.anatdimi.android.initials.R.id.fragment_container;

/**
 * Created by anat dimi on 3/15/2020.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity{

    //Classes must implement these method(s):
    protected abstract Fragment createFragment();

    private FragmentManager fm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);

        fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        Fragment fragment = fm.findFragmentById(fragment_container);

        if (fragment == null)
            fragment = createFragment();

        transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out,R.anim.fade_in, R.anim.fade_out).add(fragment_container, fragment).commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override
    public void onBackPressed() {
/*        if (this.getClass().equals(MainScreenActivity.class))
            super.onBackPressed();*/

        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }

}
