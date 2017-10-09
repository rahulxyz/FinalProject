package com.rahulxyz.jokesandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.*;

public class JokeAndActivity extends AppCompatActivity {

    public static String JOKE="Jokes";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_and);

        Intent intent= getIntent();
        if(intent.hasExtra(JOKE)){
            Jokes joke= new Jokes();
            Toast.makeText(this, joke.getJoke(), Toast.LENGTH_LONG).show();
        }
    }
}
