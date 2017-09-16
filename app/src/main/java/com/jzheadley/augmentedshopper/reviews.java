package com.jzheadley.augmentedshopper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class reviews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        RecyclerView review_card_rv = (RecyclerView)findViewById(R.id.review_card_rv);
        review_card_rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
