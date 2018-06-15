package com.github.theresajayne.beatedit;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.theresajayne.beatedit.audioprocessing.Audio;
import com.github.theresajayne.beatedit.entities.Difficulty;
import com.github.theresajayne.beatedit.entities.Mapping;
import com.github.theresajayne.managers.TrackManager;

public class BeatEdit extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Audio audioManager;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		audioManager = new Audio();
		System.out.println("Loading Mapping");
		TrackManager track = new TrackManager();
		track.loadTrack("");
		System.out.println(track.getInfo().toString());
		for(Mapping maps:track.getMaps())
		{
			System.out.println(maps.toString());
		}
		img = new Texture(track.getTrackInfo().getCoverImagePath());
		//audioManager.loadAudioTrack();
		//audioManager.playAudioTrack();
	}

	@Override
	public void render () {
		Music track = audioManager.getTrack();
		//System.out.println("Position="+track.getPosition());
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
