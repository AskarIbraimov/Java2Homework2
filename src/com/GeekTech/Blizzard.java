package com.GeekTech;

public abstract class Blizzard {
private String projectName;
private int budget;

    public Blizzard(String projectName, int budget) {
        this.projectName = projectName;
        this.budget = budget;
    }

    public Blizzard(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
