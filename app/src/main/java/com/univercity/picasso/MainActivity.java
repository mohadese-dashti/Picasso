package com.univercity.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

ImageView image1;
ImageView image2;

String urlImage1 = "https://i.imgur.com/KTXh633.jpg";
String urlImage2 = "https://i.imgur.com/PjteAcu.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      image1 = findViewById(R.id.imageView1);
      image2 = findViewById(R.id.imageView2);

      Picasso(urlImage1,image1);
        Picasso(urlImage2,image2);
    }

    private void Picasso(String urlImage, ImageView image) {
        Picasso.get()
                .load(urlImage)
                .fit().centerCrop()
                .error(R.drawable.eror)
                .into(image);
    }
}
