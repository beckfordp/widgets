package com.interview;

import java.util.Arrays;
import java.util.List;

public class SteamEngine extends BaseEngine implements Engine {
    private static final List<FuelType> allowedFuel = Arrays.asList(FuelType.WOOD, FuelType.COAL);

    public SteamEngine(FuelType requiredFuelType) {
        super(requiredFuelType);
    }

    @Override
    List<FuelType> allowedFuel() {
        return allowedFuel;
    }
}
