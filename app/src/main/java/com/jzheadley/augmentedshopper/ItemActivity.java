package com.jzheadley.augmentedshopper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);
    }

    public void storeSwitcher(View view){
        Intent intent = new Intent(this, PriceComparisonActivity.class);
        startActivity(intent);
    }
    public void recipeSwitcher(View view){
        Intent intent = new Intent(this, RecipesActivity.class);
        startActivity(intent);
    }
    public void similarSwitcher(View view){
        Intent intent = new Intent(this, SimilarItemsActivity.class);
        startActivity(intent);
    }
}
