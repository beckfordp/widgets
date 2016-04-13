package com.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InternalCombustionEngineTest {
    @Test
    public void canUsePetrolAsFuel() {
        Engine engine = new InternalCombustionEngine(FuelType.PETROL);
        engine.fill(FuelType.PETROL, 1);
        engine.start();
        assertThat(engine.isRunning(), is(true));
    }

    @Test
    public void canUseDieselAsFuel() {
        Engine engine = new InternalCombustionEngine(FuelType.DIESEL);
        engine.fill(FuelType.DIESEL, 1);
        engine.start();
        assertThat(engine.isRunning(), is(true));
    }

    @Test(expected=IllegalArgumentException.class)
    public void cannotUseWoodAsFuel() {
        Engine engine = new InternalCombustionEngine(FuelType.WOOD);
        engine.fill(FuelType.WOOD, 1);
        engine.start();
    }

    @Test(expected=IllegalArgumentException.class)
    public void cannotUseCoalAsFuel() {
        Engine engine = new InternalCombustionEngine(FuelType.COAL);
        engine.fill(FuelType.COAL, 1);
        engine.start();
    }

}