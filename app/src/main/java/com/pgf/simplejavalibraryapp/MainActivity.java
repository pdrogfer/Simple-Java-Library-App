package com.pgf.simplejavalibraryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pgf.libraries.JokeSmith;

public class MainActivity extends AppCompatActivity {
    TextView joke;
    JokeSmith myJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joke = (TextView) findViewById(R.id.tvJoke);

        setText(joke);
    }

    private void setText(TextView joke) {

        myJoke = new JokeSmith();
        String jokeBody = myJoke.getJoke();
        joke.setText(jokeBody);
    }
}
