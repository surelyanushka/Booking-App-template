package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.app2.models.Concerts;
import com.example.app2.recyclerview.Concertadapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvconcerts;
    private Concertadapter concertadapter;
    private List<Concerts> data;
    ImageButton quit;


    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.slider);

        ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(this);

        viewPager.setAdapter(viewpagerAdapter);

        initviews();
        initdataConcerts();
        setupconcertadapter();


    }

    private void setupconcertadapter() {
        concertadapter = new Concertadapter(this, data);
        rvconcerts.setAdapter(concertadapter);
    }

    private void initdataConcerts() {
        data = new ArrayList<>();
        data.add(new Concerts(
                "BTS Concert, Seoul","Sejong Center","100 USD","24 July", R.drawable.artist1
        ));
        data.add(new Concerts(
                "Ariana Grande Concert","Coachella","105 USD","26 July", R.drawable.artist2
        ));
        data.add(new Concerts(
                "Taylor Swift Tour","Los Angeles","95 USD","30 July", R.drawable.artist3
        ));
        data.add(new Concerts(
                "Katy Perry Tour","Inglewood, CA","98 USD","12 Aug", R.drawable.artist4
        ));
        data.add(new Concerts(
                "Ed Sheeran Tour","Los Angeles","100 USD","13 Aug", R.drawable.artis5
        ));
        data.add(new Concerts(
                "Rihanna Tour","San Fransisco","95 USD","20 Aug", R.drawable.artist6
        ));

    }

    private void initviews() {
        rvconcerts  = (RecyclerView) findViewById(R.id.concert_list);
        rvconcerts.setLayoutManager(new LinearLayoutManager(this));
        rvconcerts.setHasFixedSize(true);
    }




}
