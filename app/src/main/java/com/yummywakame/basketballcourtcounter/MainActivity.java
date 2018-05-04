package com.yummywakame.basketballcourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Basketball Counter
 * Created by Olivia Meiring on 5/1/2018.
 * Yummy Wakame
 * olivia@yummy-wakame.com
 */

public class MainActivity extends AppCompatActivity {
    // scores
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
    }

    /**
     * Keeps track of display variables on screen rotation
     */
    // Save the variables in Bundle savedInstanceState
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("saveScoreTeamA", scoreTeamA);
        savedInstanceState.putInt("saveScoreTeamB", scoreTeamB);
        savedInstanceState.putInt("saveFoulTeamA", foulTeamA);
        savedInstanceState.putInt("saveFoulTeamB", foulTeamB);

    }
    // Get variables from Bundle savedInstanceState and display them
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("saveScoreTeamA");
        scoreTeamB = savedInstanceState.getInt("saveScoreTeamB");
        foulTeamA = savedInstanceState.getInt("saveFoulTeamA");
        foulTeamB = savedInstanceState.getInt("saveFoulTeamB");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);

    }

    /**
     * Add 3 to score for Team A.
     */
    public void add3PointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 2 to score for Team A.
     */
    public void add2PointsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 1 to score for Team A.
     */
    public void add1PointForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 to score for Team B.
     */
    public void add3PointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 2 to score for Team B.
     */
    public void add2PointsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 1 to score for Team B.
     */
    public void add1PointForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 1 to fouls for Team A.
     */
    public void add1FoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 1 to fouls for Team B.
     */
    public void add1FoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset All scores when the 'RESET' button is clicked.
     */
    public void resetBothScores(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        foulTeamA = 0;
        displayFoulForTeamA(foulTeamA);
        foulTeamB = 0;
        displayFoulForTeamB(foulTeamB);
    }

}