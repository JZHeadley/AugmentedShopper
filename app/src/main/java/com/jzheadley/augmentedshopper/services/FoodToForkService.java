package com.jzheadley.augmentedshopper.services;

import com.jzheadley.augmentedshopper.services.api.FoodToForkApi;

public class FoodToForkService {
    private FoodToForkApi foodToForkApi;

    public FoodToForkService() {
        foodToForkApi = ServiceFactory.createRetrofitDebugService(FoodToForkApi.class, "");
    }

    public FoodToForkApi getFoodToForkApi() {
        return foodToForkApi;
    }
}
