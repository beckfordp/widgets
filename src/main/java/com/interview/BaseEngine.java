package com.interview;

import java.util.List;

abstract public class BaseEngine {
    protected boolean running;
    protected int fuelLevel;
    protected FuelType requiredFuelType;
    private FuelType fuelType;

    public BaseEngine(FuelType requiredFuelType) {
        guardAgainstWrongFuel(requiredFuelType);
        fuelLevel = 0;
        running = false;
    }

    public void start() {
        if (fuelLevel > 0 && requiredFuelType.equals(fuelType)) {
            running = true;
        } else {
            throw new IllegalStateException("Not able to start engine.");
        }
    }

    public void stop() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public void fill(FuelType fuelType, int fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        } else if (fuelLevel > 100) {
            this.fuelLevel = 100;
        } else {
            this.fuelLevel = 0;
        }

        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return requiredFuelType;
    }


    protected void guardAgainstWrongFuel(FuelType requiredFuelType) {
        if(allowedFuel().contains(requiredFuelType)) {
            this.requiredFuelType = requiredFuelType;
        }  else {
            throw new IllegalArgumentException(requiredFuelType + " fuel is not allowed");
        }
    }

    abstract List<FuelType> allowedFuel() ;
}
