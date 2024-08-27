package com.example.udemy_planetsapp;
//This class is acting as Model Class for our ListView
public class Planet {
    //Attributes
    private String planetName;
    private String moonCount;
    private int planetImage;

    //Constructor

    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    //Getter and Setter

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
