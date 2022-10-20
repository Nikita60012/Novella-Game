package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

import sun.font.TrueTypeFont;

public class GameNovella extends Game {

	SpriteBatch batch;
	BitmapFont font;
	final String madeInProgress = "MADE IN PROGRESS";
	final int WIDTH = 1280;
	final int HEIGHT = 720;
	boolean fullScreenMode = false;

	@Override
	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));

		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {super.render();}

	@Override
	public void dispose () {
		super.dispose();
		batch.dispose();
		font.dispose();
	}
}
