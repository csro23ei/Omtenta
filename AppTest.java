package com.javatenta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

class AppTest {

    @Test
    void testCalculateArea() {
        assertFalse(App.calculateArea(4, 6));
        assertTrue(App.calculateArea(3, 5));
    }

    @Test
    void testCountCitiesByCountry() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Borås", "Sverige"));
        cities.add(new City("Turku", "Finland"));
        cities.add(new City("Oslo", "Norge"));
        cities.add(new City("Stockholm", "Sverige"));
        cities.add(new City("Malmö", "Sverige"));
        cities.add(new City("Trondheim", "Norge"));
        cities.add(new City("New York", "USA"));
        cities.add(new City("Turku", "Helsinki"));
        cities.add(new City("Malmö", "Sverige"));
        cities.add(new City("Los Angeles", "USA"));

        assertEquals(4, App.countCitiesByCountry(cities, "Sverige"));
        assertEquals(2, App.countCitiesByCountry(cities, "USA"));

    }

    @Test
    void testLetterCount() {
        assertEquals(5, App.letterCount("Hello"));
        assertEquals(8, App.letterCount("Mountain"));
    }

    @Test
    void testPrintPointLeft() {

        List<Point> points = new ArrayList<>();
        points.add(new Point("Kalle", 5));
        points.add(new Point("Bengt", 9));
        points.add(new Point("Linda", 7));
        points.add(new Point("Helen", 12));

        assertEquals("Mellan Bengt och Helen är det 3 poängs mellanskillnad!", App.printPointLeft(points));

        points.add(new Point("XYZ", 20));

        assertEquals("Mellan Helen och XYZ är det 8 poängs mellanskillnad!", App.printPointLeft(points));

        assertEquals(5, App.letterCount("Hello"));

    }

}
