package com.example.hfp.changhaowoer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hfp.changhaowoer.adapter.JoinAdapter;
import com.example.hfp.changhaowoer.object.Join;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private List<Join> joinList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        ImageView image = (ImageView)findViewById(R.id.activityImage);
        TextView sponser = (TextView)findViewById(R.id.sponser);
        TextView activityName = (TextView)findViewById(R.id.activityName);
        TextView introduction = (TextView)findViewById(R.id.introduction);
        TextView activityReleaseTime = (TextView)findViewById(R.id.activityReleaseTime);
        TextView activityDeadline = (TextView)findViewById(R.id.activityDeadline);
        TextView activityTime = (TextView)findViewById(R.id.activityTime);
        TextView activityAddress = (TextView)findViewById(R.id.activityAddress);
        TextView aNumOfPerson = (TextView)findViewById(R.id.aNumOfPerson);
        TextView aSurplusQuota = (TextView)findViewById(R.id.aSurplusQuota);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.join_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        JoinAdapter adapter = new JoinAdapter(joinList);
        recyclerView.setAdapter(adapter);
        initJoinActivity();

    }

    private  void initJoinActivity(){
        for(int i =0;i<6;i++){
            Join join = new Join("user", R.drawable.logo);
            joinList.add(join);
        }
    }
}
