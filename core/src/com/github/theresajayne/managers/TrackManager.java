package com.github.theresajayne.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.theresajayne.beatedit.entities.Difficulty;
import com.github.theresajayne.beatedit.entities.MapDifficulty;
import com.github.theresajayne.beatedit.entities.Mapping;
import com.github.theresajayne.beatedit.entities.TrackInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrackManager {

    Music audioTrack;
    TrackInfo trackInfo;
    List<Mapping> mapping = new ArrayList<>();

    public void loadTrack(String folderName)
    {
        //foldername unused at the moment as we are using internal files.
        ObjectMapper mapper = new ObjectMapper();
        try {
            trackInfo = mapper.readValue(Gdx.files.internal("info.json").file(),TrackInfo.class);
        } catch(IOException jme)
        {
            jme.printStackTrace();
        }
        for (MapDifficulty difficulty:trackInfo.getDifficultyLevels())
        {
            loadMapping(Difficulty.valueOf(difficulty.getDifficulty()));
        }
    }

    public boolean loadMapping(Difficulty difficulty)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Mapping level =mapper.readValue(Gdx.files.internal(difficulty.getFilename()).file(),Mapping.class);
            level.setName(difficulty.getName());
            mapping.add(level);
            //System.out.println(mapping.toString());
        }
        catch(IOException jme)
        {
            jme.printStackTrace();
            return false;
        }
        return true;
    }


    public List<Mapping> getMaps() {
        return this.mapping;
    }

    public String getInfo() {
        return trackInfo.toString();
    }

    public TrackInfo getTrackInfo() {
        return this.trackInfo;
    }
}
