package com.example.wallpapersandbackgroundclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.wallpapersandbackgroundclone.Adapters.UserClass;
import com.example.wallpapersandbackgroundclone.R;

import java.io.IOException;

public class ViewWallpaperActivity extends AppCompatActivity {
    public static final String EXTR_IMAGE = "images";
    private ImageView viewImage;
    private Button setWallpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_wallpaper);
        viewImage = findViewById(R.id.viewImageTv);
        setWallpaper = findViewById(R.id.setWallpaper);
        UserClass userClass = (UserClass) getIntent().getSerializableExtra(EXTR_IMAGE);
        Glide.with(this).load(userClass.getImages()).into(viewImage);

        setWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundImage();
            }
        });
    }

    private void setBackgroundImage() {
        Bitmap bitmap = ((BitmapDrawable)viewImage.getDrawable()).getBitmap();
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "set wallpaper successfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}