package com.github.theresajayne.beatedit;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.theresajayne.beatedit.audioprocessing.Audio;
import com.github.theresajayne.beatedit.entities.Difficulty;
import com.github.theresajayne.beatedit.entities.Mapping;
import com.github.theresajayne.beatedit.screens.MainScreen;
import com.github.theresajayne.managers.TrackManager;

public class BeatEdit extends Game {
	SpriteBatch batch;
	Texture img;
	Audio audioManager;
	
	@Override
	public void create () {
		setScreen(new MainScreen(this));
	}


}
