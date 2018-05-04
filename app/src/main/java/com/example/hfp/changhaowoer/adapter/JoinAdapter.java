package com.example.hfp.changhaowoer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hfp.changhaowoer.R;
import com.example.hfp.changhaowoer.object.Join;

import java.util.List;

/**
 * Created by lenovo on 2018/5/4.
 */

public class JoinAdapter extends RecyclerView.Adapter<JoinAdapter.ViewHolder> {
    private List<Join> mJoin;

    static class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView JoinImage;
        TextView JoinName;

        public ViewHolder(View view){
            super(view);
            JoinImage = (ImageView) view.findViewById(R.id.userImage);
            JoinName = (TextView)view.findViewById(R.id.username);

        }
    }

    public JoinAdapter(List<Join> JoinList){
        mJoin = JoinList;
    }

    @Override
    public JoinAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_join_item,parent,false);
        JoinAdapter.ViewHolder holder = new JoinAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(JoinAdapter.ViewHolder holder, int position){
        Join join = mJoin.get(position);
        holder.JoinImage.setImageResource(join.getImageId());
        holder.JoinName.setText(join.getName());
    }
    @Override
    public int getItemCount(){
        return mJoin.size();
    }

}
