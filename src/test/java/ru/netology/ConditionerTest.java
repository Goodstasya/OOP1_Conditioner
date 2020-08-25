package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncrease() {
        Conditioner conditioner = new Conditioner();

        int currentTemp = 18;
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(currentTemp);

        conditioner.increaseCurrentTemperature();

        int actual = conditioner.getCurrentTemperature();

        int expected = 19;

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseHigherThenMax() {
        Conditioner conditioner = new Conditioner();

        int currentTemp = 35;
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(currentTemp);

        conditioner.increaseCurrentTemperature();

        int actual = conditioner.getCurrentTemperature();

        int expected = 35;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecrease() {
        Conditioner conditioner = new Conditioner();

        int currentTemp = 18;
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(currentTemp);

        conditioner.decreaseCurrentTemperature();

        int actual = conditioner.getCurrentTemperature();

        int expected = 17;

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseLowerThanMin() {
        Conditioner conditioner = new Conditioner();

        int currentTemp = 16;
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(currentTemp);

        conditioner.decreaseCurrentTemperature();

        int actual = conditioner.getCurrentTemperature();

        int expected = 16;

        assertEquals(expected, actual);
    }
}
