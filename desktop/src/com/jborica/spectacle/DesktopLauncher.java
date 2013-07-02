package com.jborica.spectacle;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 7/1/13
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class DesktopLauncher {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Spectacle";
        cfg.useGL20 = true;
        cfg.width = 1280;
        cfg.height = 720;
        new LwjglApplication(new SpectacleGame(), cfg);
    }
}
