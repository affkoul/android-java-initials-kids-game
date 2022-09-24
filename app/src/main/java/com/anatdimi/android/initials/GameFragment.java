package com.anatdimi.android.initials;


import android.content.Intent;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.DragEvent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


/**
 * Created by anat dimi on 3/15/2020.
 */

public class GameFragment extends Fragment {

    //Make reference to main image
    private ImageView gameImage;

    //Make reference to bank for this Game
    private Game mGame;

    //Make reference to the bank for this Game
    private GameImageBank mGameImageBank;

    //Make reference to the letters on screen.
    private TextView word;
    private TextView letter1;
    private TextView letter2;
    private TextView letter3;
    private TextView letter4;
    private Button homeButton;
    private TextView firstLetter;
    private Button nextButton;

    private int letterIndex = 0;

    private Boolean booleanCorrectAnswer1 = false;
    private Boolean booleanCorrectAnswer2 = false;
    private Boolean booleanCorrectAnswer3 = false;
    private Boolean booleanCorrectAnswer4 = false;

    private SoundPool soundPool;
    private SoundPool.Builder soundPoolBuilder;

    private AudioAttributes attributes;
    private AudioAttributes.Builder attributesBuilder;

    private int soundCorrect;
    private int soundHarp;
    private int soundHarpStream;
    private int soundWrong;

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);

        //loadSounds() runs on a separate thread
        loadSounds();

        mGameImageBank = new GameImageBank();
        mGame = mGameImageBank.getGameImageBank(letterIndex);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle){
        super.onCreateView(inflater, container, savedInstanceBundle);
        View view = inflater.inflate(R.layout.fragment_game_fragment, container, false);

        gameImage = (ImageView) view.findViewById(R.id.game_screen_question_image);
        word = (TextView) view.findViewById(R.id.game_word);

        //If home button pressed, go to main activity
        homeButton = (Button) view.findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainScreenActivity.class);
                startActivity(intent);
            }
        });

        nextButton = (Button) view.findViewById(R.id.game_screen_next_button);
        firstLetter = (TextView) view.findViewById(R.id.game_word_first_letter);
        letter1 = (TextView) view.findViewById(R.id.letter1);
        letter2 = (TextView) view.findViewById(R.id.letter2);
        letter3 = (TextView) view.findViewById(R.id.letter3);
        letter4 = (TextView) view.findViewById(R.id.letter4);

        word.setOnDragListener(dragListener);
        letter1.setOnTouchListener(TouchListener);
        letter2.setOnTouchListener(TouchListener);
        letter3.setOnTouchListener(TouchListener);
        letter4.setOnTouchListener(TouchListener);

        displayImages();

        mAdView = (AdView) view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return view;
    }

    private void loadSounds() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                attributesBuilder = new AudioAttributes.Builder();
                attributesBuilder.setUsage(AudioAttributes.USAGE_GAME);
                attributesBuilder.setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION);
                attributes = attributesBuilder.build();

                soundPoolBuilder = new SoundPool.Builder();
                soundPoolBuilder.setAudioAttributes(attributes);
                soundPool = soundPoolBuilder.build();

                soundCorrect = soundPool.load(getActivity(), R.raw.correct, 1);
                soundHarp = soundPool.load(getActivity(), R.raw.harp, 1);
                soundWrong = soundPool.load(getActivity(), R.raw.wrong, 1);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /*
        This method will display images in alphabetical order for now
        In the future, I plan to have the option to randomize the letters.
    */
    private void displayImages() {

        gameImage.setOnDragListener(dragListener);
        firstLetter.setOnDragListener(dragListener);

        //Set the main image
        gameImage.setImageResource(getContext().getResources().getIdentifier(mGame.getGameImage(), "drawable", getContext().getPackageName()));

        //Set the letters
        word.setText(mGame.getWordList().get(0));

        firstLetter.setText(R.string.underscore);
        letter1.setText(mGame.getAnswerList().get(0));
        letter2.setText(mGame.getAnswerList().get(1));
        letter3.setText(mGame.getAnswerList().get(2));
        letter4.setText(mGame.getAnswerList().get(3));


                String correctAnswer = mGame.getAnswerList().get(4);
                String answer0 = mGame.getAnswerList().get(0);
                String answer1 = mGame.getAnswerList().get(1);
                String answer2 = mGame.getAnswerList().get(2);
                String answer3 = mGame.getAnswerList().get(3);

                if (correctAnswer.equals(answer0))
                    booleanCorrectAnswer1 = true;
                else if (correctAnswer.equals(answer1))
                    booleanCorrectAnswer2 = true;
                else if (correctAnswer.equals(answer2))
                    booleanCorrectAnswer3 = true;
                else if (correctAnswer.equals(answer3))
                    booleanCorrectAnswer4 = true;

    }

    private View.OnTouchListener TouchListener = new View.OnTouchListener() {
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
//            v.startDragAndDrop(null, myShadowBuilder, v, 0);
            v.startDrag(null, myShadowBuilder, v, 0);
            return false;
        }
    };

    private View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    soundHarpStream = soundPool.play(soundHarp,1,1,1,0,1);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    View exitView = (View) event.getLocalState();
                    exitView.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DROP:
                    final View view = (View) event.getLocalState();
                    soundPool.stop(soundHarpStream);
                    if (view.getId() == R.id.letter1) {
                        letter1.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer1) {
                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);
                    }
                    else if (view.getId() == R.id.letter2) {
                        letter2.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer2) {
                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);

                    }
                    else if (view.getId() == R.id.letter3) {
                        letter3.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer3) {
                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);
                    }
                    else if (view.getId() == R.id.letter4) {
                        letter4.setVisibility(View.INVISIBLE);
                        if (booleanCorrectAnswer4) {

                            waitHelper();
                            break;
                        }
                        soundPool.play(soundWrong,1,1,1,0,1);
                    }
                    break;
            }
            return true;
        }
    };

    private void resetGameFragment() {
        letter1.setVisibility(View.VISIBLE);
        letter2.setVisibility(View.VISIBLE);
        letter3.setVisibility(View.VISIBLE);
        letter4.setVisibility(View.VISIBLE);

        nextButton.clearAnimation();
        firstLetter.clearAnimation();

        booleanCorrectAnswer1 = false;
        booleanCorrectAnswer2 = false;
        booleanCorrectAnswer3 = false;
        booleanCorrectAnswer4 = false;
    }

    private void waitHelper() {
        letter1.setVisibility(View.INVISIBLE);
        letter2.setVisibility(View.INVISIBLE);
        letter3.setVisibility(View.INVISIBLE);
        letter4.setVisibility(View.INVISIBLE);

        gameImage.setImageResource(R.drawable.correct);
        soundPool.play(soundCorrect,1,1,0,0,1);

        firstLetter.setText(mGame.getAnswerList().get(4));
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        fadeIn.setDuration(1200);
        fadeIn.setFillAfter(true);

        letterIndex++;
        mGame = mGameImageBank.getGameImageBank(letterIndex);


        firstLetter.startAnimation(fadeIn);
        nextButton.startAnimation(fadeIn);

        if (letterIndex > 25){
            nextButton.setTextSize(50f);
            nextButton.setText(R.string.game_end);
        }

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (letterIndex > 25)
                    checkForEnd();
                else {
                    resetGameFragment();
                    displayImages();
                }
            }
        });
    }

    private void checkForEnd() {
        Intent intent = new Intent(getContext(), CongratsActivity.class);
        startActivity(intent);
    }
}
