package com.jborica.spectacle;

import com.jborica.spectacle.components.PositionComponent;
import com.jborica.spectacle.components.VelocityComponent;
import com.jborica.spectacle.core.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/28/13
 * Time: 12:12 AM
 * To change this template use File | Settings | File Templates.
 *
 * A PlayerManager is essentially a class containing utility functions performed on the Components and Systems
 * associated with the player Entity. Unlike a System (which more closely resembles an asychronous, continually-running
 * background process), the PlayerManger is expected to be called infrequently, and primarily during context switching.
 * Systems are stateless, Managers are stateful.
 */
public class PlayerManager {
    private static Entity player = null;
    private static final PositionComponent playerPosition = new PositionComponent(0f, 0f, 0f);
    private static final VelocityComponent playerVelocity = new VelocityComponent(1f, 0f);

    /**
     * return the instance of a player entity. Initialize it and set default components if it has not yet been initialized
     * @return the internal player Entity
     */
    public static Entity getPlayer() {
        if (player == null) {
            player = new Entity();
            player.addComponent(playerPosition);
            player.addComponent(playerVelocity);
        }
        return player;
    }
}
