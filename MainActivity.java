package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int blueRoundScore = 0;
    int blueOverallScore = 0;
    int redRoundScore = 0;
    int redOverallScore = 0;
    int roundNumber = 1;
    boolean KO=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add one point to Blue and display
     */
    public void bluePunch(View view) {
        if(!KO) {//if there was a KO, the fight is over
            blueRoundScore = blueRoundScore + 1;
            blueOverallScore += 1;
            displayOverallBlue(blueOverallScore);
            displayRoundBlue(blueRoundScore);
        }
    }

    /**
     * Add two points to Blue and display
     */
    public void blueKick(View view) {
        if(!KO) {//if there was a KO, the fight is over
            blueRoundScore = blueRoundScore + 2;
            blueOverallScore += 2;
            displayOverallBlue(blueOverallScore);
            displayRoundBlue(blueRoundScore);
        }
    }

    /**
     * Stop the fight
     */
    public void blueKO(View view) {
        KO=true;
        displayOverallBlue(-1);
        displayRoundBlue(-1);
    }

    /**
     * Add one point to Red and display
     */
    public void redPunch(View view) {
        if(!KO) {//if there was a KO, the fight is over
            redRoundScore = redRoundScore + 1;
            redOverallScore += 1;
            displayOverallRed(redOverallScore);
            displayRoundRed(redRoundScore);
        }
    }

    /**
     * Add two points to Red and display
     */
    public void redKick(View view) {
        if(!KO) {//if there was a KO, the fight is over
            redRoundScore = redRoundScore + 2;
            redOverallScore += 2;
            displayOverallRed(redOverallScore);
            displayRoundRed(redRoundScore);
        }
    }

    /**
     * Stop the fight
     */
    public void redKO(View view) {
        KO=true;
        displayOverallRed(-1);
        displayRoundRed(-1);
    }

    /**
     * increments the round, resets the in-round counter
     */
    public void nextRound(View view) {
        if(!KO) {  //if there was a KO, the fight is over
            roundNumber += 1;
            redRoundScore=0;
            blueRoundScore=0;
            displayRoundNumber(roundNumber);

            displayOverallBlue(blueOverallScore);
            displayRoundBlue(blueRoundScore);

            displayOverallRed(redOverallScore);
            displayRoundRed(redRoundScore);

        }
    }
    /**
     * Full reset
     */
    public void resetButton(View view) {
        blueRoundScore = 0;
        blueOverallScore = 0;
        redRoundScore = 0;
        redOverallScore = 0;
        roundNumber = 1;
        KO=false;
        displayRoundNumber(roundNumber);

        displayOverallBlue(blueOverallScore);
        displayRoundBlue(blueRoundScore);

        displayOverallRed(redOverallScore);
        displayRoundRed(redRoundScore);

    }

    /**
     * Displays the overall score for Blue.
     */
    public void displayOverallBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_overall_score);
        if(score==-1)
            scoreView.setText(String.valueOf("K.O."));
        else
            scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the overall score for Red.
     */
    public void displayOverallRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_overall_score);
        if(score==-1)
            scoreView.setText(String.valueOf("K.O."));
        else
            scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the overall score for Blue.
     */
    public void displayRoundBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_round_score);
        if(score==-1)
            scoreView.setText(String.valueOf("K.O."));
        else
            scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the overall score for Red.
     */
    public void displayRoundRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_round_score);
        if(score==-1)
            scoreView.setText(String.valueOf("K.O."));
        else
            scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the round number
     */
    public void displayRoundNumber(int roundN) {
        TextView scoreView = (TextView) findViewById(R.id.round_number);
        scoreView.setText(String.valueOf(roundN) + " Score");
    }

}
