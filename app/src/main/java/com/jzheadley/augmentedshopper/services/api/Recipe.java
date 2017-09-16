package com.jzheadley.augmentedshopper.services.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sean on 9/16/17.
 */

public class Recipe {
    @SerializedName("publisher")
    @Expose
    public String publisher;
    @SerializedName("social_rank")
    @Expose
    public Double socialRank;
    @SerializedName("f2f_url")
    @Expose
    public String f2fUrl;
    @SerializedName("publisher_url")
    @Expose
    public String publisherUrl;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("source_url")
    @Expose
    public String sourceUrl;
    @SerializedName("page")
    @Expose
    public Integer page;

    @Override
    public String toString() {
        return "Recipe{" +
                "publisher='" + publisher + '\'' +
                ", socialRank=" + socialRank +
                ", f2fUrl='" + f2fUrl + '\'' +
                ", publisherUrl='" + publisherUrl + '\'' +
                ", title='" + title + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", page=" + page +
                '}';
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getSocialRank() {
        return socialRank;
    }

    public void setSocialRank(Double socialRank) {
        this.socialRank = socialRank;
    }

    public String getF2fUrl() {
        return f2fUrl;
    }

    public void setF2fUrl(String f2fUrl) {
        this.f2fUrl = f2fUrl;
    }

    public String getPublisherUrl() {
        return publisherUrl;
    }

    public void setPublisherUrl(String publisherUrl) {
        this.publisherUrl = publisherUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Recipe() {

    }
}
