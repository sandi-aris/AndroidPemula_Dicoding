package com.example.tugasaris;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataMakanan extends AppCompatActivity {

    ImageView imageView;
    TextView title, description;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_makanan);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null){
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowHomeEnabled(true);
        }
        imageView = findViewById(R.id.another_ImageView);
        title = findViewById(R.id.titleText);
        description = findViewById(R.id.descriptionText);

        if (position == 0){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 1){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 2){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 3){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 4){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 5){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 6){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 7){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 8){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 9){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 10){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 11){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 12){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }
        if (position == 13){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("Images");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("Description");


            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

    }
}
