package com.jborica.spectacle.core;

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
    private static boolean active = false;

    public static void activate() {
        active = true;
    }

    public static void deactivate() {
        active = false;
    }

    public static boolean isActive() {
        return active;
    }

    public abstract void update(float delta);
    public abstract ObjectMap<UUID, Entity> getEntityMap();
}
