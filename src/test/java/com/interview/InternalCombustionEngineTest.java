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
         new InternalCombustionEngine(FuelType.WOOD);
    }

    @Test(expected=IllegalArgumentException.class)
    public void cannotUseCoalAsFuel() {
        new InternalCombustionEngine(FuelType.COAL);
    }

    @Test(expected=IllegalStateException.class)
    public void cannotStartIfFuelIsEmpty() {
        Engine engine = new InternalCombustionEngine(FuelType.PETROL);
        engine.start();
    }
}