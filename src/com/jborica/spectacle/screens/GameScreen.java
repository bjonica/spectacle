package com.jborica.spectacle.screens;

import com.badlogic.gdx.Screen;
import com.jborica.spectacle.Spectacle;
import com.jborica.spectacle.systems.MovementSystem;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameScreen implements Screen {
    private final Spectacle game;

    public GameScreen(Spectacle game) {
        this.game = game;
        MovementSystem.activate();
    }

    @Override
    public void render(float delta) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resize(int width, int height) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void dispose() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
