package com.GeekTech;

public class Main {


    public static void main(String[] args) {
        // write your code here
        createObject("warcraft");
        createObject("overwatch");
        createObject("starcraft");

    }

    public static Blizzard createObject(String className) {


        switch (className) {
            case "warcraft":
                Warcraft_3 warcraft_3 = new Warcraft_3("Варкрафт ", 500, " Стратегия ");
                warcraft_3.print();
                return warcraft_3;

            case "overwatch":
                Overwatch overwatch = new Overwatch("Овервотч ", 2999, " Шутер ");
                overwatch.print();
                return overwatch;

            case "starcraft":
                Starcraft_2 starcraft_2 = new Starcraft_2("Старкрафт ", 999, " Стратегия  ");
                starcraft_2.print();
                return starcraft_2;

            default:
                return null;


        }

    }


}

