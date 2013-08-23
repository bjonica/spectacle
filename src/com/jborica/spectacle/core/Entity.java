package com.jborica.spectacle.core;

import com.jborica.spectacle.util.ComponentMap;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Entity {
    public final UUID id;
    private final ComponentMap componentMap;

    public Entity() {
        id = UUID.randomUUID();
        componentMap = new ComponentMap();
    }

    public void addComponent(Component component) {
        componentMap.put(component.getClass(), component);
    }

    public void removeComponent(Component component) {
        componentMap.remove(component.getClass());
    }

    public boolean hasComponentOfType(Class<? extends Component> componentClass) {
        return componentMap.containsKey(componentClass);
    }
}
