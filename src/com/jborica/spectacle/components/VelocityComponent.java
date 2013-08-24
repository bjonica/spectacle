package com.jborica.spectacle.components;

import com.jborica.spectacle.core.Component;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class VelocityComponent extends Component {
    private float speed;
    private float radianDirection;

    public VelocityComponent(float speed, float direction) {
        this.speed = speed;
        this.radianDirection = direction;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getRadianDirection() {
        return radianDirection;
    }

    public void setRadianDirection(float radianDirection) {
        this.radianDirection = radianDirection;
    }
}
