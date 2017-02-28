package com.baumgartner.webtree.wizard.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baumgartner.webtree.wizard.Fragments.GameSettingsFragment;
import com.baumgartner.webtree.wizard.Game;
import com.baumgartner.webtree.wizard.R;

/**
 * Created by lbaum on 28.02.2017.
 */

public class ListAdapter extends RecyclerView.Adapter {



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return  Game.playerCount.size() == 0 ? 3 : Game.playerCount.size();
    }

    private class ListViewHolder extends RecyclerView.ViewHolder {
        public ListViewHolder(View itemView) {
            super(itemView);
        }
    }
}
