package com.jborica.spectacle;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 7/1/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpectacleActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useAccelerometer = false;
        cfg.useCompass = false;
        cfg.useWakelock = true;
        cfg.useGL20 = true;
        initialize(new SpectacleGame(), cfg);
    }
}
