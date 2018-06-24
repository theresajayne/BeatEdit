package com.github.theresajayne.beatedit.entities;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Text extends Actor {
    private String text;
    BitmapFont bitmapFont;
    GlyphLayout glyphLayout;
    //that you use to access score.
    //Remember to pass this in!
    public Text(String text){
        super();
        this.text = text;
//        bitmapFont = new BitmapFont(Gdx.files.internal("Forte.fnt"));
        bitmapFont = new BitmapFont();
        bitmapFont.getData().setScale(0.9f);
        glyphLayout = new GlyphLayout();
    }

    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        glyphLayout.setText(bitmapFont,this.text );
        bitmapFont.draw(batch, this.text , this.getX(),this.getY());
        //Also remember that an actor uses local coordinates for drawing within
        //itself!
    }
}