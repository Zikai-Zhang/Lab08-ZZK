package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary)); // this
    }

    @Test
    void testDelete() {
        CustomList cityList = new CustomList();
        City calgary = new City("Calgary", "AB");
        cityList.addCity(calgary);

        assertDoesNotThrow(() -> cityList.delete(calgary));
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(calgary));
    }

    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();

        assertEquals(0, cityList.countCities());

        City calgary = new City("Calgary", "AB");
        cityList.addCity(calgary);
        assertEquals(1, cityList.countCities());

        City halifax = new City("Halifax", "Nova Scotia");
        cityList.addCity(halifax);
        assertEquals(2, cityList.countCities());
    }
}