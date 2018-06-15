package com.github.theresajayne.beatedit.entities;

import java.util.List;

public class TrackInfo {
    private String songName;
    private String songSubName;
    private String authorName;
    private int beatsPerMinute;
    private int previewStartTime;
    private int previewDuration;
    private String coverImagePath;
    private String environmentName;
    private List<MapDifficulty> difficultyLevels;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongSubName() {
        return songSubName;
    }

    public void setSongSubName(String songSubName) {
        this.songSubName = songSubName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    public int getPreviewStartTime() {
        return previewStartTime;
    }

    public void setPreviewStartTime(int previewStartTime) {
        this.previewStartTime = previewStartTime;
    }

    public int getPreviewDuration() {
        return previewDuration;
    }

    public void setPreviewDuration(int previewDuration) {
        this.previewDuration = previewDuration;
    }

    public String getCoverImagePath() {
        return coverImagePath;
    }

    public void setCoverImagePath(String coverImagePath) {
        this.coverImagePath = coverImagePath;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public List<MapDifficulty> getDifficultyLevels() {
        return difficultyLevels;
    }

    public void setDifficultyLevels(List<MapDifficulty> difficultyLevels) {
        this.difficultyLevels = difficultyLevels;
    }

    @Override
    public String toString() {
        return "TrackInfo{" +
                "songName='" + songName + '\'' +
                ", songSubName='" + songSubName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", beatsPerMinute=" + beatsPerMinute +
                ", previewStartTime=" + previewStartTime +
                ", previewDuration=" + previewDuration +
                ", coverImagePath='" + coverImagePath + '\'' +
                ", environmentName='" + environmentName + '\'' +
                ", difficultyLevels=" + difficultyLevels +
                '}';
    }
}
