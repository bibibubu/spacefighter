package xyz.doubleb.spacefighter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton buttonPlay;
    private ImageButton buttonScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonPlay = (ImageButton) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);

        buttonScore = (ImageButton) findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == buttonPlay) {
            //the transition from MainActivity to GameActivity
            //startActivity(new Intent(MainActivity.this, GameActivity.class));
            startActivity(new Intent(MainActivity.this, FullscreenActivity.class));
        }
        if (v == buttonScore) {

            //the transition from MainActivity to HighScoreActivity activity
            startActivity(new Intent(MainActivity.this, HighScoreActivity.class));
        }
    }
}
