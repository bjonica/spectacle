package com.jborica.spectacle.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.ObjectMap;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class System {
    private boolean active = false;

    public void activate() {
        Gdx.app.debug("DEBUG", "Activating " + this.getClass().getSimpleName().toString());

        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public boolean isActive() {
        return active;
    }

    public abstract void update(float delta);
    public abstract ObjectMap<UUID, Entity> getEntityMap();
}
