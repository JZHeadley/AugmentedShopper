package com.jzheadley.augmentedshopper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jzheadley.augmentedshopper.services.GoogleSearchService;
import com.jzheadley.augmentedshopper.services.api.GoogleSearchApi;

public class SimilarItemsActivity extends AppCompatActivity {

    private GoogleSearchApi googleSearchApi;
    public final String cx = "009610786516065341765:eeyebvizksq";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similar_items);
        googleSearchApi = new GoogleSearchService().getGoogleSearchApi();
        googleSearchApi.searchGoogle("AIzaSyDwSYJNpsaPKOhlATRt_2jEAhwufGEBVW4", cx, "butter");

    }
}
