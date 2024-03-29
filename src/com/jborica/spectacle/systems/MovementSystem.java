package com.jborica.spectacle.systems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.ObjectMap;
import com.jborica.spectacle.components.PositionComponent;
import com.jborica.spectacle.components.VelocityComponent;
import com.jborica.spectacle.core.Entity;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 10:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovementSystem extends com.jborica.spectacle.core.System {
    private static final ObjectMap<UUID, Entity> entities = new ObjectMap<>();
    private static final MovementSystem MOVEMENT_SYSTEM = new MovementSystem();

    private MovementSystem() {

    }

    public static MovementSystem getInstance() {
        return MOVEMENT_SYSTEM;
    }

    @Override
    public final void update(float delta) {
        PositionComponent position;
        VelocityComponent velocity;

        for (Entity entity: entities.values()) {
            position = (PositionComponent) entity.getComponentOfType(PositionComponent.class);
            velocity = (VelocityComponent) entity.getComponentOfType(VelocityComponent.class);

            position.setX(position.getX() * velocity.getSpeed());
            position.setY(position.getY() * velocity.getSpeed());
            position.setZ(position.getZ() * velocity.getSpeed());
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public final ObjectMap<UUID, Entity> getEntityMap() {
        return entities;
    }
}
