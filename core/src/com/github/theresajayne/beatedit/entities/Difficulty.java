package com.github.theresajayne.beatedit.entities;

public enum Difficulty {
    Easy("Easy.json","Easy",1),
    Normal("Normal.json","Normal",2),
    Hard("Hard.json","Hard",3),
    Expert("Expert.json","Expert",4),
    ExpertPlus("ExpertPlus.json","ExpertPlus",5);

    private final String filename;
    private final String name;
    private final int difficulty;

    Difficulty(String filename,String name,int difficulty)
    {
        this.filename = filename;
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getFilename() {
        return filename;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
