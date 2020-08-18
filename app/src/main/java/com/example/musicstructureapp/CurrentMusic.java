package com.example.musicstructureapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class CurrentMusic extends AppCompatActivity {
    ImageView buttonDown;
    Toolbar toolbar;
    ImageView musicPlay;
    ImageButton musicPrev, musicNext, musicShuffle, musicRepeat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_music);

        //Referring ID's
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        musicShuffle = findViewById(R.id.shuffleMusic);
        musicPrev = findViewById(R.id.prevPlay);
        musicNext = findViewById(R.id.nextPlay);
        musicRepeat = findViewById(R.id.repeat);
        musicPlay = findViewById(R.id.play);

        //On pressing back button, move to parent
        buttonDown = findViewById(R.id.button_down);
        buttonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrentMusic.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        //When click on shuffle icon..
        musicShuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CurrentMusic.this, getString(R.string.shuffling), Toast.LENGTH_SHORT).show();
            }
        });

        //When click on play button, change button background to pause.
        musicPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicPlay.setImageResource(R.drawable.ic_baseline_pause_circle_filled_24);
                Toast.makeText(CurrentMusic.this, getString(R.string.playing), Toast.LENGTH_SHORT).show();
            }
        });

        musicNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CurrentMusic.this, R.string.playing_next, Toast.LENGTH_SHORT).show();
            }
        });

        musicRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicRepeat.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_repeat_one_24));
                Toast.makeText(CurrentMusic.this, R.string.done, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.current_music_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.song_visit) {
            Toast.makeText(this, R.string.album_err, Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}