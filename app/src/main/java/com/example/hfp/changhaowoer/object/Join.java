package com.example.hfp.changhaowoer.object;

/**
 * Created by lenovo on 2018/5/4.
 */

public class Join {
    private String JoinName;
    private  int imageId;

    public Join(String JoinName ,int imageId){
        this.JoinName = JoinName;
        this.imageId = imageId;
    }

    public String getName(){
        return JoinName;
    }

    public int getImageId(){
        return  imageId;
    }

    public void setJoinName(String JoinName){
        this.JoinName = JoinName;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }
}
