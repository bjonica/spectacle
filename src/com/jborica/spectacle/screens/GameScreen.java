package com.jborica.spectacle.screens;

import com.badlogic.gdx.Screen;
import com.jborica.spectacle.PlayerManager;
import com.jborica.spectacle.Spectacle;
import com.jborica.spectacle.core.Entity;
import com.jborica.spectacle.systems.EntitySystem;
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
    Entity player;

    public GameScreen(Spectacle game) {
        this.game = game;
    }

    @Override
    public void render(float delta) {
        EntitySystem.getInstance().update(delta);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resize(int width, int height) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void show() {
        player = PlayerManager.getPlayer();
        MovementSystem.getInstance().activate();
        EntitySystem.addEntity(player);
    }

    @Override
    public void hide() {
        MovementSystem.getInstance().deactivate();
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
