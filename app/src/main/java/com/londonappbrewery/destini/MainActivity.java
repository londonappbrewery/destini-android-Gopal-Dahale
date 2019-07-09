package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mButtonTop, mButtonBottom;
    int mStoryIndex;

    StoryLine[] stories = new StoryLine[]{
            new StoryLine(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryLine(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryLine(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryLine(R.string.T4_End,-1,-1),
            new StoryLine(R.string.T5_End,-1,-1),
            new StoryLine(R.string.T6_End,-1,-1)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        mStory.setText(stories[mStoryIndex].getStoryID());
        mButtonTop.setText(stories[mStoryIndex].getButtonUpID());
        mButtonBottom.setText(stories[mStoryIndex].getButtonBottomID());
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStory(1);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStory(0);
            }
        });

    }
    public void  updateStory(int x){
        if(x == 1){
            if(mStoryIndex == 0){
                mStoryIndex = 2;
                mStory.setText(stories[mStoryIndex].getStoryID());
                mButtonTop.setText(stories[mStoryIndex].getButtonUpID());
                mButtonBottom.setText(stories[mStoryIndex].getButtonBottomID());
            }
            else if(mStoryIndex == 2){
                mStoryIndex = 5;
                mStory.setText(stories[mStoryIndex].getStoryID());
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
            else if(mStoryIndex == 1){
                mStoryIndex = 2;
                mStory.setText(stories[mStoryIndex].getStoryID());
                mButtonTop.setText(stories[mStoryIndex].getButtonUpID());
                mButtonBottom.setText(stories[mStoryIndex].getButtonBottomID());
            }
        }
        else if(x == 0){
            if(mStoryIndex == 0){
                mStoryIndex = 1;
                mStory.setText(stories[mStoryIndex].getStoryID());
                mButtonTop.setText(stories[mStoryIndex].getButtonUpID());
                mButtonBottom.setText(stories[mStoryIndex].getButtonBottomID());
            }
            else if(mStoryIndex == 1){
                mStoryIndex = 3;
                mStory.setText(stories[mStoryIndex].getStoryID());
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
            else if(mStoryIndex == 2){
                mStoryIndex = 4;
                mStory.setText(stories[mStoryIndex].getStoryID());
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }

        }

    }

}
