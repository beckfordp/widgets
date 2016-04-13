package com.interview;

public class WidgetMachine {
    private Engine engine;

    WidgetMachine(Engine engine)   {
        this.engine = engine;
    }

    public int produceWidgets(int quantity) {
        engine.start();
        int cost = 0;

        if (engine.isRunning()) {
            cost = produce(quantity);
        }

        engine.stop();

        return cost;
    }

    private int produce(int quantity) {
        int batch = 0;
        int batchCount = 0;
        int costPerBatch = 0;

        if (engine.getFuelType() == FuelType.PETROL) {
            costPerBatch = 900;
        } else if (engine.getFuelType() == FuelType.DIESEL) {
            costPerBatch = 1200;
        } else if (engine.getFuelType() == FuelType.WOOD) {
            costPerBatch = 435;
        } else if (engine.getFuelType() == FuelType.COAL) {
            costPerBatch = 565;
        }

        while (batch < quantity) {
            batch = batch + 8;
            batchCount++;
        }

        return batchCount * costPerBatch;
    }


}
