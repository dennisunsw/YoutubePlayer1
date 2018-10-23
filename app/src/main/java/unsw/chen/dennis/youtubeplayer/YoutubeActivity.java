package unsw.chen.dennis.youtubeplayer;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends YouTubeBaseActivity
implements YouTubePlayer.OnInitializedListener {

static final String GOOGLE_API_KEY = "AIzaSyAsWkRZuVHwVO7HkN6SjOmzHqrLdN-2Hos";
static final String YOUTUBE_VIDEO_ID = "ElpitAfkRS4";

static final String YOUTUBE_PLAYLIST1 = "PLXtTjtWmQhg1SsviTmKkWO5n0a_-T0bnD";
static final String YOUTUBE_PLAYLIST2 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
static final String YOUTUBE_PLAYLIST3 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST4 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST5 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST6 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST7 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST8 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST9 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST10 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST11 = "LL_60a_QZvzgnRo8Z4P3GoOQ";
    static final String YOUTUBE_PLAYLIST12 = "LL_60a_QZvzgnRo8Z4P3GoOQ";

    private static final String TAG = "YoutubeActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_youtube);
       // ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.activity_youtube);

        ConstraintLayout layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_youtube, null);
        setContentView(layout);


        YouTubePlayerView playerView = new YouTubePlayerView(this);
        playerView.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.addView(playerView);
        playerView.initialize(GOOGLE_API_KEY, this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        Log.d(TAG, "onInitializationSuccess: provider is " + provider.getClass().toString());
        Toast.makeText(this, "Initialised Youtube Player Successfully", Toast.LENGTH_LONG).show();

        if(!wasRestored) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        final int REQUEST_CODE = 1;

        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE).show();
        } else {
            String errorMessage=String.format("There was an error initialising the YoutubePlayer (%1$s)", youTubeInitializationResult.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();

        }
    }
}
