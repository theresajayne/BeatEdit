package com.github.theresajayne.beatedit.audioprocessing;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

import java.nio.ByteBuffer;

public class Audio {

    Music track;
    byte[] audioTrack;

    public void loadAudioTrack(String filename)
    {
        track = Gdx.audio.newMusic(Gdx.files.internal(filename));

        byte[] data = new byte[(int)Gdx.files.internal(filename).file().length()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data);
        byte[] rawAudio = byteBuffer.array();
    }

    public Music getTrack()
    {
        return track;
    }

    public void playAudioTrack() {
        track.play();
    }
}