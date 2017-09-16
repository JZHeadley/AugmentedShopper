package com.jzheadley.augmentedshopper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jzheadley.augmentedshopper.Adapter.RecipesAdapter;
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

public class RecipesActivity extends AppCompatActivity {

    private static final String TAG = "RecipesActivity";
    private FoodToForkApi foodToForkApi;
    private List<Recipe> recipes;
    private RecipesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        foodToForkApi = new FoodToForkService().getFoodToForkApi();
        foodToForkApi.searchRecipes("e3f92a5ea15f514626145a35d622d350", "beef")
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
                        Log.e(TAG, "onError: ", e);
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
        adapter = new RecipesAdapter(recipes);
    }

    public List<Recipe> getTopRecipes(int count) {
        List<Recipe> topResults = null;
        for (int i = 0; i < count; i++) {
            topResults.add(recipes.get(i));
        }
        return topResults;
    }
}
