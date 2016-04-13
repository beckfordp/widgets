package com.interview;

import java.util.HashMap;
import java.util.Map;

public class WidgetMachine {
    private Engine engine;

    private static final Map<FuelType, Integer> costPerBatch = new HashMap<FuelType, Integer>();
    {
        costPerBatch.put(FuelType.PETROL, 900);
        costPerBatch.put(FuelType.DIESEL, 1200);
        costPerBatch.put(FuelType.WOOD, 435);
        costPerBatch.put(FuelType.COAL, 565);
    }

    private static final Map<Class, Integer> batchSize = new HashMap<Class, Integer>();
    {
        batchSize.put(InternalCombustionEngine.class, 9);
        batchSize.put(SteamEngine.class, 2);
    }

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

        while (batch < quantity) {
            batch = batch + batchSize.get(engine.getClass());
            batchCount++;
        }

        return batchCount * costPerBatch.get(engine.getFuelType());
    }


}
