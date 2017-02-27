package com.baumgartner.webtree.wizard.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baumgartner.webtree.wizard.R;

/**
 * Created by lbaum on 27.02.2017.
 */

public class RulesetFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ruleset, container, false);
        return view;
    }
}
