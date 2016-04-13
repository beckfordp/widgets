package com.interview;

import java.util.Arrays;
import java.util.List;

public class SteamEngine extends BaseEngine implements Engine {
    List<FuelType> allowedFuel = Arrays.asList(FuelType.WOOD, FuelType.COAL);

    public SteamEngine(FuelType requiredFuelType) {
        if(allowedFuel.contains(requiredFuelType)) {
            this.requiredFuelType = requiredFuelType;
        }  else {
            throw new IllegalArgumentException(requiredFuelType + " fuel is not allowed");
        }
    }

}
