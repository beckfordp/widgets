package com.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WidgetMachineTest {
    @Test
    public void costPerBatchUsingPetrol() {
        WidgetMachine machine = new WidgetMachine();
        assertThat(machine.produceWidgets(1), is(9));
    }
}