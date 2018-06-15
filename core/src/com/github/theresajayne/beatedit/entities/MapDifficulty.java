package com.github.theresajayne.beatedit.entities;

public class MapDifficulty {
    private String difficulty;
    private int difficultyRank;
    private String audioPath;
    private String jsonPath;
    private int offset;
    private int oldOffset;

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficultyRank() {
        return difficultyRank;
    }

    public void setDifficultyRank(int difficultyRank) {
        this.difficultyRank = difficultyRank;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOldOffset() {
        return oldOffset;
    }

    public void setOldOffset(int oldOffset) {
        this.oldOffset = oldOffset;
    }

    @Override
    public String toString() {
        return "MapDifficulty{" +
                "difficulty='" + difficulty + '\'' +
                ", difficultyRank=" + difficultyRank +
                ", audioPath='" + audioPath + '\'' +
                ", jsonPath='" + jsonPath + '\'' +
                ", offset=" + offset +
                ", oldOffset=" + oldOffset +
                '}';
    }
}
