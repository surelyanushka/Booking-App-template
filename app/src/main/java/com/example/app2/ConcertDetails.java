package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ConcertDetails extends AppCompatActivity {

    ImageView concimg;
    TextView conctitle, concdesc, concprice, concdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_details);

        concimg = findViewById(R.id.concert_img);
        conctitle = findViewById(R.id.concert_title);
        concdesc = findViewById(R.id.concert_loc);
        concprice = findViewById(R.id.concert_price);
        concdate = findViewById(R.id.concert_date);

        concimg.setImageResource(getIntent().getExtras().getInt("image"));
        conctitle.setText(getIntent().getExtras().getString("title"));
        concdesc.setText(getIntent().getExtras().getString("description"));
        concprice.setText(getIntent().getExtras().getString("price"));
        concdate.setText(getIntent().getExtras().getString("date"));


    }
}