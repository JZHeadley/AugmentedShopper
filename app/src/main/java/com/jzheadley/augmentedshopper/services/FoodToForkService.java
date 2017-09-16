package com.jzheadley.augmentedshopper.services;

import com.jzheadley.augmentedshopper.services.api.FoodToForkApi;

public class FoodToForkService {
    private FoodToForkApi foodToForkApi;

    public FoodToForkService() {
        foodToForkApi = ServiceFactory.createRetrofitDebugService(FoodToForkApi.class, "http://food2fork.com/api/search");
    }

    public FoodToForkApi getFoodToForkApi() {
        return foodToForkApi;
    }
}
