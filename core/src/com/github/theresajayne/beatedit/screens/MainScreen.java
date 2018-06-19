package com.github.theresajayne.beatedit.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.github.theresajayne.beatedit.audioprocessing.Audio;
import com.github.theresajayne.beatedit.entities.Mapping;
import com.github.theresajayne.managers.TrackManager;

public class MainScreen extends ScreenAdapter {
    private Stage stage;
    private Texture coverPhoto;
    private BitmapFont bitmapFont;
    private GlyphLayout glyphLayout;

    private static final float WORLD_WIDTH = Gdx.graphics.getWidth();
    private static final float WORLD_HEIGHT = Gdx.graphics.getHeight();

    Texture img;
    Audio audioManager;

    private final Game game;

    public MainScreen(Game game)
    {
        this.game = game;
    }

    @Override
    public void show()
    {
        stage = new Stage(new FitViewport(WORLD_WIDTH, WORLD_HEIGHT));
        audioManager = new Audio();
        TrackManager track = new TrackManager();
        track.loadTrack("");

        for(Mapping maps:track.getMaps())
        {
            System.out.println(maps.toString());
        }
        img = new Texture(track.getTrackInfo().getCoverImagePath());
        //audioManager.loadAudioTrack();
        //audioManager.playAudioTrack();
    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void render (float delta) {
        Music track = audioManager.getTrack();
        //System.out.println("Position="+track.getPosition());
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }
}
