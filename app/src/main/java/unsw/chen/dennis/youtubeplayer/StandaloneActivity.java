package unsw.chen.dennis.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);


        Button Week1 = (Button) findViewById(R.id.Week1);
        Button Week2 = (Button) findViewById(R.id.Week2);
        Button Week3 = (Button) findViewById(R.id.Week3);
        Button Week4 = (Button) findViewById(R.id.Week4);
        Button Week5 = (Button) findViewById(R.id.Week5);
        Button Week6 = (Button) findViewById(R.id.Week6);
        Button Week7 = (Button) findViewById(R.id.Week7);
        Button Week8 = (Button) findViewById(R.id.Week8);
        Button Week9 = (Button) findViewById(R.id.Week9);
        Button Week10 = (Button) findViewById(R.id.Week10);
        Button Week11 = (Button) findViewById(R.id.Week11);
        Button Week12 = (Button) findViewById(R.id.Week12);


        Week1.setOnClickListener(this);
        Week2.setOnClickListener(this);
        Week3.setOnClickListener(this);
        Week4.setOnClickListener(this);
        Week5.setOnClickListener(this);
        Week6.setOnClickListener(this);
        Week7.setOnClickListener(this);
        Week8.setOnClickListener(this);
        Week9.setOnClickListener(this);
        Week10.setOnClickListener(this);
        Week11.setOnClickListener(this);
        Week12.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        Intent intent = null;
        switch(view.getId()) {

            case R.id.Week1:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST1);
                break;

            case R.id.Week2:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST2);
                break;

            case R.id.Week3:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST3);
                break;

            case R.id.Week4:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST4);
                break;

            case R.id.Week5:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST5);
                break;

            case R.id.Week6:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST6);
                break;

            case R.id.Week7:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST7);
                break;

            case R.id.Week8:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST8);
                break;

            case R.id.Week9:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST9);
                break;

            case R.id.Week10:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST10);
                break;

            case R.id.Week11:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST11);
                break;

            case R.id.Week12:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST12);
                break;



        }
        if(intent != null) {
            startActivity(intent);
        }
    }
}
