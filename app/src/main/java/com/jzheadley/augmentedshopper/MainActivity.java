package com.jzheadley.augmentedshopper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jzheadley.augmentedshopper.services.FoodToForkService;
import com.jzheadley.augmentedshopper.services.api.FoodToForkApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToReviews(View view) {
        Intent intent = new Intent(MainActivity.this, reviews.class);
        startActivity(intent);
    }

    public void goToRecipes(View view) {
        Intent intent = new Intent(MainActivity.this, recipes.class);
        startActivity(intent);
    }

}
