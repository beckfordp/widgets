package com.interview;

import java.util.Arrays;
import java.util.List;

public class InternalCombustionEngine extends BaseEngine implements Engine {
    List<FuelType> allowedFuel = Arrays.asList(FuelType.PETROL, FuelType.DIESEL);

    public InternalCombustionEngine(FuelType requiredFuelType) {
        if(allowedFuel.contains(requiredFuelType)) {
            this.requiredFuelType = requiredFuelType;
        }  else {
            throw new IllegalArgumentException(requiredFuelType + " fuel is not allowed");
        }
    }
}
