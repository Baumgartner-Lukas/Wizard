package com.baumgartner.webtree.wizard.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.baumgartner.webtree.wizard.R;

/**
 * Created by lbaum on 27.02.2017.
 */

public class GameSettingsFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gamesettings, container,false);

        Spinner playerCountSpinner = (Spinner)view.findViewById(R.id.playerCountSpinner);
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                                                                            R.array.player_count,
                                                                            R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        playerCountSpinner.setAdapter(adapter);

        return view;
    }
}
