package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int barcelonaScore = 0;
    int realMadridScore = 0;
    SeekBar barcaAttempts;
    SeekBar realAttempts;
    SeekBar barcaOnTarget;
    SeekBar realOnTarget;
    SeekBar barcaCorners;
    SeekBar realCorners;
    SeekBar barcaFouls;
    SeekBar realFouls;
    SeekBar barcaYellow;
    SeekBar realYellow;
    SeekBar barcaPasses;
    SeekBar realPasses;
    SeekBar barcaPossession;
    SeekBar realPossession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barcaAttempts=(SeekBar)findViewById(R.id.barca_attempts);
        barcaAttempts.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona Attempts are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        realAttempts = (SeekBar) findViewById(R.id.real_attempts);
        realAttempts.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid Attempts are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        barcaOnTarget = (SeekBar) findViewById(R.id.barca_onTarget);
        barcaOnTarget.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona On Target are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        realOnTarget = (SeekBar) findViewById(R.id.real_onTarget);
        realOnTarget.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid On Target are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        barcaCorners = (SeekBar) findViewById(R.id.barca_corners);
        barcaCorners.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona Corners are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        realCorners = (SeekBar) findViewById(R.id.real_corners);
        realCorners.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid Corners are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        barcaFouls = (SeekBar) findViewById(R.id.barca_fouls);
        barcaFouls.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona Fouls are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        realFouls = (SeekBar) findViewById(R.id.real_fouls);
        realFouls.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid Fouls are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        barcaYellow = (SeekBar) findViewById(R.id.barca_yellow);
        barcaYellow.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona Yellow Cards are :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        realYellow = (SeekBar) findViewById(R.id.real_yellow);
        realYellow.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid Yellow cards sre :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        barcaPasses = (SeekBar) findViewById(R.id.barca_passes);
        barcaPasses.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona Total Passes sre :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        realPasses = (SeekBar) findViewById(R.id.real_passes);
        realPasses.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid Total Passes sre :" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });

        barcaPossession = (SeekBar) findViewById(R.id.barca_possession);
        barcaPossession.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Barcelona Possession% is :" + progressChangedValue*10 + "%",
                        Toast.LENGTH_SHORT).show();
            }
        });

        realPossession = (SeekBar) findViewById(R.id.real_possession);
        realPossession.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Real Madrid Possession% is :" + progressChangedValue*10 + "%",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Display the given score for barcelona team
    public void displayForBarcelona (int score){
        TextView scoreView = (TextView) findViewById(R.id.barcelona_score);
        scoreView.setText(String.valueOf(score));
    }

    // Display the given score for real madrid team
    public void displayForRealMadridScore (int score){
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_score);
        scoreView.setText(String.valueOf(score));
    }

    // Increase the score for barcelona by 1
    public void addGoalForBarcelona (View v){
        barcelonaScore = barcelonaScore + 1;
        displayForBarcelona(barcelonaScore);
    }

    // Increase the score for real madrid by 1
    public void addGoalForRealMadrid (View v){
        realMadridScore = realMadridScore+ 1;
        displayForRealMadridScore(realMadridScore);
    }



    // Reset the score to 0 for both teams
    public void reset (View v){
        barcaAttempts.setProgress(0);
        realAttempts.setProgress(0);
        barcaOnTarget.setProgress(0);
        realOnTarget.setProgress(0);
        barcaCorners.setProgress(0);
        realCorners.setProgress(0);
        barcaFouls.setProgress(0);
        realFouls.setProgress(0);
        barcaYellow.setProgress(0);
        realYellow.setProgress(0);
        barcaPasses.setProgress(0);
        realPasses.setProgress(0);
        barcaPossession.setProgress(0);
        realPossession.setProgress(0);
        barcelonaScore = 0;
        realMadridScore = 0;
        displayForBarcelona(barcelonaScore);
        displayForRealMadridScore(realMadridScore);
    }
}
