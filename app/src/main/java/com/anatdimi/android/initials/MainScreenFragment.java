package com.anatdimi.android.initials;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anat dimi on 3/15/2020.
 */

public class MainScreenFragment extends Fragment {

    Button btn_new_game;

    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);

        // Make link clickable
        TextView link = (TextView) view.findViewById(R.id.main_screen_credits);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        btn_new_game = (Button) view.findViewById(R.id.main_activity_new_game_button);
        btn_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(fragment_container, new MainScreenSelectGameFragment()).commit();*/
                Intent intent = new GameActivity().getIntent(getActivity());
                startActivity(intent);
            }
        });

        return view;
    }
}
