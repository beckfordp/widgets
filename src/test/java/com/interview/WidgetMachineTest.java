package com.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WidgetMachineTest {
    @Test
    public void costPerBatchUsingPetrol() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        engine.fill(FuelType.PETROL, 1);
        WidgetMachine machine = new WidgetMachine(engine);
        assertThat(machine.produceWidgets(1), is(9));
    }

    @Test
    public void costPerBatchUsingDiesel() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.DIESEL);
        engine.fill(FuelType.DIESEL, 1);
        WidgetMachine machine = new WidgetMachine(engine);
        assertThat(machine.produceWidgets(1), is(12));
    }
}