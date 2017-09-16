package com.jzheadley.augmentedshopper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jzheadley.augmentedshopper.services.FoodToForkService;
import com.jzheadley.augmentedshopper.services.api.FoodToForkApi;

public class MainActivity extends AppCompatActivity {
    private FoodToForkApi foodToForkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodToForkApi = new FoodToForkService().getFoodToForkApi();
    }

}
