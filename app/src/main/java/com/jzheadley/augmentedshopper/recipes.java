package com.jzheadley.augmentedshopper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jzheadley.augmentedshopper.services.FoodToForkService;
import com.jzheadley.augmentedshopper.services.api.FoodToForkApi;
import com.jzheadley.augmentedshopper.services.api.Recipe;
import com.jzheadley.augmentedshopper.services.api.RecipeList;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class recipes extends AppCompatActivity {

    private FoodToForkApi foodToForkApi;
    private List<Recipe> recipes;
    private static final String TAG = "recipes";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        foodToForkApi = new FoodToForkService().getFoodToForkApi();
        foodToForkApi.searchRecipes("apiKey", "chicken")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecipeList>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.d(TAG, "onSubscribe: Subscribed");
                    }

                    @Override
                    public void onNext(@NonNull RecipeList recipeList) {
                        setRecipes(recipeList.getRecipes());
                        Log.d(TAG, "onNext: " + recipeList.getRecipes());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete: finished");
                    }
                });
    }

    public void setRecipes(List<Recipe> recipes) {
        Log.d(TAG, "setRecipes: Recipes Are" + recipes);
        this.recipes = recipes;
    }
}
