package com.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WidgetMachineTest {
    @Test
    public void costPerBatchUsingPetrol() {
        Engine engine = new InternalCombustionEngine(FuelType.PETROL);
        engine.fill(FuelType.PETROL, 1);
        WidgetMachine machine = new WidgetMachine(engine);
        assertThat(machine.produceWidgets(1), is(900));
    }

    @Test
    public void costPerBatchUsingDiesel() {
        Engine engine = new InternalCombustionEngine(FuelType.DIESEL);
        engine.fill(FuelType.DIESEL, 1);
        WidgetMachine machine = new WidgetMachine(engine);
        assertThat(machine.produceWidgets(1), is(1200));
    }

    @Test
    public void costPerBatchUsingWood() {
        Engine engine = new SteamEngine(FuelType.WOOD);
        engine.fill(FuelType.WOOD, 1);
        WidgetMachine machine = new WidgetMachine(engine);
        assertThat(machine.produceWidgets(1), is(435));
    }

    @Test
    public void costPerBatchUsingCoal() {
        Engine engine = new SteamEngine(FuelType.COAL);
        engine.fill(FuelType.COAL, 1);
        WidgetMachine machine = new WidgetMachine(engine);
        assertThat(machine.produceWidgets(1), is(565));
    }
}