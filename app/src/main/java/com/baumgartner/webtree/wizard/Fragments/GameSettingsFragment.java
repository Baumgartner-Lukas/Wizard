package com.baumgartner.webtree.wizard.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.baumgartner.webtree.wizard.Adapters.ListAdapter;
import com.baumgartner.webtree.wizard.Game;
import com.baumgartner.webtree.wizard.R;

/**
 * Created by lbaum on 27.02.2017.
 */

public class GameSettingsFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private String[] playerCount = {"3", "4", "5" ,"6"};
    private RecyclerView mRecyclerView;
    private ListAdapter mListAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gamesettings, container,false);



        Spinner playerCountSpinner = (Spinner)view.findViewById(R.id.playerCountSpinner);
        playerCountSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(),
                                                            R.layout.item_spinner,
                                                            R.id.spinnerTextView,
                                                            playerCount);
        playerCountSpinner.setAdapter(adapter);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.playerNameRecyclerView);
        mListAdapter = new ListAdapter();
        mRecyclerView.setAdapter(mListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);


        return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        Game.playerCount.clear();
        int i = Integer.parseInt((String) adapterView.getItemAtPosition(pos));
        for (int counter = 1; counter <= i; counter++){
            Game.playerCount.add("");
        }
        mListAdapter.notifyDataSetChanged();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
