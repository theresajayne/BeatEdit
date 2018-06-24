package com.github.theresajayne.beatedit.audioprocessing;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

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

    public Music getTrack(String name)
    {
        track = Gdx.audio.newMusic(Gdx.files.internal(name));
        return track;
    }

    public void playAudioTrack() {
        track.play();
    }
}
