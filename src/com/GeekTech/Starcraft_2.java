package com.GeekTech;

public class Starcraft_2 extends Blizzard implements Printable {
    private String Classification;

    public Starcraft_2(String projectName, int budget, String classification) {
        super(projectName, budget);
        Classification = classification;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String classification) {
        Classification = classification;
    }

    @Override
    public void print() {
        System.out.println("Название проекта " + getProjectName() + "Бюджет  игры: " + getBudget() +
                " Жанр " + getClassification());
    }
}
