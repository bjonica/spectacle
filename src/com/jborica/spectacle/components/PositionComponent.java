package com.jborica.spectacle.components;

import com.jborica.spectacle.core.Component;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class PositionComponent extends Component {
    private float x;
    private float y;
    private float z;

    public PositionComponent(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public final float getX() {
        return x;
    }

    public final void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
