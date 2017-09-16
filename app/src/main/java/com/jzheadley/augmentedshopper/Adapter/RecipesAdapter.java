package com.jzheadley.augmentedshopper.Adapter;

import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jzheadley.augmentedshopper.R;
import com.jzheadley.augmentedshopper.services.api.Recipe;

import java.util.List;

/**
 * Created by Courtney on 9/16/2017.
 */

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.RecipeViewHolder> {

    private List<Recipe> recipes;

    public RecipesAdapter(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recipes_card, parent, false);
        return new RecipesAdapter.RecipeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int position) {
        Recipe recipe = recipes.get(position);
        holder.recipeTitle.setText(recipe.getTitle());
        holder.ratingBar.setRating(Float.parseFloat(recipe.getSocialRank() + ""));


    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }


    static class RecipeViewHolder extends RecyclerView.ViewHolder {
        AppCompatRatingBar ratingBar;
        ImageView imageView;
        TextView recipeTitle;

        public RecipeViewHolder(View itemView) {
            super(itemView);
            ratingBar = (AppCompatRatingBar) itemView.findViewById(R.id.recipe_ratingBar);
            imageView = (ImageView) itemView.findViewById(R.id.recipe_image);
            recipeTitle = (TextView) itemView.findViewById(R.id.recipe_title);
        }
    }

}
