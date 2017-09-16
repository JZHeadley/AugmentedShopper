package com.jzheadley.augmentedshopper.Adapter;

import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.jzheadley.augmentedshopper.R;

public class review_adapter extends RecyclerView.Adapter<review_adapter.ReviewViewHolder> {

    public static class ReviewViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        AppCompatRatingBar rating;
        TextView content;

        ReviewViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            rating = itemView.findViewById(R.id.review_rating);
            content = itemView.findViewById(R.id.review_content);
        }

    }

}
