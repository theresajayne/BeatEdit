package com.github.theresajayne.beatedit.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.github.theresajayne.beatedit.entities.Mapping;
import com.github.theresajayne.beatedit.entities.MappingNotes;
import com.github.theresajayne.beatedit.entities.TrackInfo;
import com.github.theresajayne.managers.TrackManager;

import java.util.List;

public class TrackScreen extends ScreenAdapter {
    private static final int Z_MULTIPLIER = 10;

    private TrackManager manager;
    private List<MappingNotes> notes;

    public TrackScreen(TrackManager trackManager, Mapping mapToPlay)
    {
        manager = trackManager;
        notes = mapToPlay.get_notes();
        createTrack();
    }

    /**
     * Take the selected track and put the notes up
     */
    private void createTrack()
    {
        for(MappingNotes note: notes)
        {

        }
    }
}
