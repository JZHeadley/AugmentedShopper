package com.jzheadley.augmentedshopper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class reviews extends AppCompatActivity {

    class Review {
        int stars;
        String content;

        Review(int stars, String content) {
            this.stars = stars;
            this.content = content;
        }
    }
    private List<Review> reviews;

    private void initializeReviews(){
        reviews = new ArrayList<>();
        reviews.add(new Review(5, "This is a review"));
        reviews.add(new Review(4, "This is a review"));
        reviews.add(new Review(3, "This is a review"));
        reviews.add(new Review(2, "This is a review"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        RecyclerView review_card_rv = (RecyclerView)findViewById(R.id.review_card_rv);
        review_card_rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
