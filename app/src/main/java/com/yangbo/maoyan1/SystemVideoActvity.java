package com.yangbo.maoyan1;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class SystemVideoActvity extends Activity {
    private VideoView video_daiying;
    private String videoUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_system_video_actvity);
        video_daiying = (VideoView)findViewById(R.id.video_daiying);

        videoUrl = getIntent().getStringExtra("videoUrl");
        //播放路径
        video_daiying.setVideoURI(Uri.parse(videoUrl));
        //准备好了
        video_daiying.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                video_daiying.start();
            }
        });
        //出错回调
        video_daiying.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(SystemVideoActvity.this, "播放出错了", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        //播放完成回调
        video_daiying.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
                Toast.makeText(SystemVideoActvity.this, "播放完成", Toast.LENGTH_SHORT).show();
            }
        });
        //设置控制面板
        video_daiying.setMediaController(new MediaController(this));
    }
}
