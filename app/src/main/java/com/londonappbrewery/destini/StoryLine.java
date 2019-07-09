package com.londonappbrewery.destini;

public class StoryLine {
    private int mStoryID;
    private int mButtonUpID,mButtonBottomID;

    public StoryLine(int storyResourceID,int ButtonUpResourceID,int ButtonBottomResouuceID){
        mStoryID = storyResourceID;
        mButtonUpID = ButtonUpResourceID;
        mButtonBottomID = ButtonBottomResouuceID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getButtonUpID() {
        return mButtonUpID;
    }

    public void setButtonUpID(int buttonUpID) {
        mButtonUpID = buttonUpID;
    }

    public int getButtonBottomID() {
        return mButtonBottomID;
    }

    public void setButtonBottomID(int buttonBottomID) {
        mButtonBottomID = buttonBottomID;
    }
}
