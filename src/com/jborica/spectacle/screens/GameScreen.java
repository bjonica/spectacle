package com.jborica.spectacle.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.jborica.spectacle.Spectacle;
import com.jborica.spectacle.components.PositionComponent;
import com.jborica.spectacle.components.VelocityComponent;
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

        player = new Entity();
        player.addComponent(new PositionComponent(0f,0f,0.01f, 0.00f));
        player.addComponent(new VelocityComponent(1.001f, 0.0f));
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
        MovementSystem.getInstance().activate();
        EntitySystem.addEntity(player);
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
