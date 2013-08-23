package com.jborica.spectacle.util;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;
import com.jborica.spectacle.core.Component;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 9:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComponentMap extends ObjectMap<Class<? extends Component>, Component> {


    public ComponentMap() {
        super(5, 1.00f);
    }
}
