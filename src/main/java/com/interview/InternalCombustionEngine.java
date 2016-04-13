package com.interview;

import java.util.Arrays;
import java.util.List;

public class InternalCombustionEngine extends BaseEngine implements Engine {
    private static final List<FuelType> allowedFuel = Arrays.asList(FuelType.PETROL, FuelType.DIESEL);

    public InternalCombustionEngine(FuelType requiredFuelType) {
        super(requiredFuelType);
    }

    @Override
    protected List<FuelType> allowedFuel() {
        return allowedFuel;
    }
}
