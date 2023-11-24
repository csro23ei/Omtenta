package com.javatenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Avkommentera dessa rader och håll muspekaren över klasserna så får ni
        // dokumentation över hur de kan användas!
        // Glöm inte att kommentera eller radera dem efter igen så de inte krachar ditt
        // program.
        // Comparator
        // Collections
    }

    // FRÅGA 1:
    // Mindre än 15 kvm? Räkna ut area för en rektangel.
    // Du skall skapa en metod som tar in bred (b) och längd (l) i hela meter.
    // Metoden skall sedan returnera true om det är 15 kvm eller mindre annars
    // false.

    public static boolean calculateArea(int b, int l) {
        int area = b * l;

        return area <= 15;
    }

    // FRÅGA 2:
    // Antal tecken i ett ord.
    // Metoden tar in ett ord i ingående parameter, sedan skall du returnera antalet
    // tecken i detta ord.

    public static int letterCount(String world) {
        return world.length();

    }

    // Fråga 3:
    // Mellanskilland mellan första och andra plats.
    // Till metoden skickar vi in en lista med spelare samt deras poäng i ett spel.
    // Metoden skall returnera en text sträng enligt:
    // "Mellan Kalle och Anna är det 5 poängs mellanskillnad!"

    public static String printPointLeft(List<Point> points) {
        if (points.size() < 2) {
            return "Inte tillräckligt med spelare för att räkna skillnad";
        }

        // Sort the list of points in descending order based on points
        Collections.sort(points, Comparator.comparingInt(Point::getPoint).reversed());

        // Get the first and second players
        Point firstPlayer = points.get(0);
        Point secondPlayer = points.get(1);

        // Calculate the point difference
        int pointDifference = secondPlayer.getPoint() - firstPlayer.getPoint();

        // Construct and return the result string
        return String.format("Mellan %s och %s är det %d poängs mellanskillnad!",
                secondPlayer.getPlayer(), firstPlayer.getPlayer(), Math.abs(pointDifference));
    }
    // Fråga 4:
    // I ett projekt så finns en lista med städer och länder.
    // Du skall skapa en funktion som tar listan som ingående paramater, samt ett
    // land som sträng.
    // Du skall returnera antalet städer som hör till det landet.

    public static long countCitiesByCountry(List<City> cities, String country) {
        return cities.stream()
                .filter(city -> city.getCountry().equalsIgnoreCase(country))
                .count();
    }

}

class City {
    String city;
    String country;

    City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

class Point {
    String player;
    int point;

    Point(String player, int point) {
        this.player = player;
        this.point = point;
    }

    public String getPlayer() {
        return player;
    }

    public int getPoint() {
        return point;
    }
}
// Fråger jag har och om jag kan vill gjärna diskutera..

// 1 på upgift 2 jag fick code sugestion "return hello.length" efter att jag tog
// bort allt jag har försökt med i ca 20
// min och det stämmer enligt testet men är det rätt??

// 2 Skulle allt deta okså bort det funkar men änu en gång käns det inte rätt
/*
 * class City {
 * String city;
 * String country;
 * 
 * City (String city, String country) {
 * this.city = city;
 * this.country = country;
 * }
 * 
 * }
 * 
 * class Point {
 * String player;
 * int point;
 * 
 * Point (String player, int point) {
 * this.player = player;
 * this.point = point;
 * }
 * 
 * }
 */

// 3 Jag är inte äns säker på att koden skriver ut något aso en outputt