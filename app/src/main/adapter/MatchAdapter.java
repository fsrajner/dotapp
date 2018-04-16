package com.dotapp.h3ng3.dotapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.ViewHolder> {
    private Context context;

    private List<Item> matchList;



    public MatchAdapter(Context context, List<Item> matchList) {

        this.context = context;

        this.matchList = matchList;

    }



    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())

                .inflate(R.layout., viewGroup, false);

        return new ViewHolder(itemView);

    }



    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {

    }



    @Override

    public int getItemCount() {

        return matchList.size();

    }



    protected static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView matchId;

        public ViewHolder(View itemView) {
            super(itemView);


        }

    }
}
