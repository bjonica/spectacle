package com.jborica.spectacle.systems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.ObjectMap;
import com.jborica.spectacle.components.PositionComponent;
import com.jborica.spectacle.components.VelocityComponent;
import com.jborica.spectacle.core.Entity;
import com.jborica.spectacle.core.System;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class EntitySystem extends com.jborica.spectacle.core.System {
    private final static EntitySystem ENTITY_SYSTEM = new EntitySystem();

    private EntitySystem() {};

    public static EntitySystem getInstance() {
        return ENTITY_SYSTEM;
    }

    private static final System[] systems = new System[]{
            MovementSystem.getInstance(),
    };

    public static void addEntity(Entity entity) {
        if (hasMovement(entity)) {
            addEntityToSystem(entity, MovementSystem.getInstance());
        }
    }

    private static void addEntityToSystem(Entity entity, System system) {
        Gdx.app.debug("DEBUG", "Adding entity " + entity.id.toString() + " to " + system.getClass().getSimpleName().toString());
        system.getEntityMap().put(entity.id, entity);
    }

    public static void removeEntity(Entity entity) {
        for (System s: systems) {
            s.getEntityMap().remove(entity.id);
        }
    }

    private static final boolean hasMovement(Entity entity) {
        return (entity.hasComponentOfType(PositionComponent.class) &&
                entity.hasComponentOfType(VelocityComponent.class));
    }

    @Override
    public void update(float delta) {
        for (System s: systems) {
            if (s.isActive())
                s.update(delta);
        }
    }

    @Override
    public ObjectMap<UUID, Entity> getEntityMap() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
