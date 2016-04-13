package com.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SteamEngineTest {
    @Test
    public void canUseWoodAsFuel() {
        Engine engine = new SteamEngine(FuelType.WOOD);
        engine.fill(FuelType.WOOD, 1);
        engine.start();
        assertThat(engine.isRunning(), is(true));
    }

    @Test
    public void canUseCoalAsFuel() {
        Engine engine = new SteamEngine(FuelType.COAL);
        engine.fill(FuelType.COAL, 1);
        engine.start();
        assertThat(engine.isRunning(), is(true));
    }

    @Test(expected=IllegalArgumentException.class)
    public void cannotUsePetrolAsFuel() {
        new SteamEngine(FuelType.PETROL);
    }

    @Test(expected=IllegalArgumentException.class)
    public void cannotUseDieselAsFuel() {
        new SteamEngine(FuelType.DIESEL);

    }

    @Test(expected=IllegalStateException.class)
    public void cannotStartIfFuelIsEmpty() {
        Engine engine = new SteamEngine(FuelType.WOOD);
        engine.start();
    }


}