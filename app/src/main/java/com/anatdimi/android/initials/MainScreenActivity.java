package com.anatdimi.android.initials;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.os.Bundle;

/**
 * Created by anat dimi on 3/15/2020.
 */

public class MainScreenActivity extends SingleFragmentActivity {

    private MediaPlayer ourSong;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);

        ourSong = MediaPlayer.create(this, R.raw.intro_music);
        ourSong.setLooping(true);
        ourSong.setVolume(0.2f,0.2f);
        ourSong.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        ourSong.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        ourSong.start();
    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, MainScreenActivity.class);
        return intent;
    }

    @Override
    public Fragment createFragment() {
        return new MainScreenFragment();
    }

}
