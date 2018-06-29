package com.example.administrator.likebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.like.LikeButton;
import com.like.OnLikeListener;

public class MainActivity extends AppCompatActivity {

    LikeButton  likeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeButton=(LikeButton) findViewById(R.id.btnone);
        likeButton.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                Toast.makeText(getApplicationContext(),"Liked",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                Toast.makeText(getApplicationContext(),"Un-Liked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
