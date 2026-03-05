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
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());
        cityList.delete(mockCity());
        assertEquals(0, cityList.countCities());
        assertFalse(cityList.hasCity(mockCity()));
    }
}