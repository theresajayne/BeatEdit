package com.github.theresajayne.beatedit.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.github.theresajayne.beatedit.audioprocessing.Audio;
import com.github.theresajayne.beatedit.entities.Difficulty;
import com.github.theresajayne.beatedit.entities.Mapping;
import com.github.theresajayne.beatedit.entities.Text;
import com.github.theresajayne.managers.TrackManager;

public class MainScreen extends ScreenAdapter {
    private Stage stage;
    private Texture coverPhoto;
    private BitmapFont bitmapFont;
    private GlyphLayout glyphLayout;
    private Music audioTrack;
    private TrackManager track;
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
        track = new TrackManager();
        track.loadTrack("");

        for(Mapping maps:track.getMaps())
        {
            System.out.println(maps.toString());
        }
        Image coverImg = new Image(new Texture(track.getTrackInfo().getCoverImagePath()));
        coverImg.setPosition(0,WORLD_HEIGHT - coverImg.getHeight());
        stage.addActor(coverImg);
        float posX = coverImg.getWidth()+20;
        float posY = WORLD_HEIGHT - 10;
        Text trackName = renderInfoText(posX,posY,"Name:"+track.getTrackInfo().getSongName());
        Text songsubname = renderInfoText(posX,posY-20,"Song:"+track.getTrackInfo().getSongSubName());
        Text author = renderInfoText(posX,posY-40,"Author:"+track.getTrackInfo().getAuthorName());
        stage.addActor(trackName);
        stage.addActor(songsubname);
        stage.addActor(author);
        audioTrack = audioManager.getTrack(track.getTrackInfo().getDifficultyLevels().get(0).getAudioPath());
        audioTrack.setPosition(track.getTrackInfo().getPreviewStartTime());
        audioTrack.play();
        //audioManager.loadAudioTrack();
        //audioManager.playAudioTrack();
    }

    private Text renderInfoText(float posX,float posY,String text) {
        Text displayText = new Text(text);
        displayText.setX(posX);
        displayText.setY(posY);
        displayText.setColor(Color.WHITE);
        return displayText;
    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void render (float delta) {
        if(audioTrack.getPosition()>= track.getTrackInfo().getPreviewStartTime()+track.getTrackInfo().getPreviewDuration()) audioTrack.setPosition(track.getTrackInfo().getPreviewStartTime());
        stage.act(delta);
        stage.draw();
        //System.out.println("Position="+track.getPosition());

    }
}
