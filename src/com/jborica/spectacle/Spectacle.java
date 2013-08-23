package com.jborica.spectacle;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.jborica.spectacle.screens.GameScreen;
import com.jborica.spectacle.screens.LoadingScreen;
import com.jborica.spectacle.screens.MainMenuScreen;

/**
 * Created with IntelliJ IDEA.
 * User: jborica
 * Date: 8/22/13
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */

public class Spectacle extends Game{
    private final LoadingScreen loadingScreen;
    private final MainMenuScreen mainMenuScreen;
    private final GameScreen gameScreen;

    public Spectacle() {
        loadingScreen = new LoadingScreen(this);
        mainMenuScreen = new MainMenuScreen(this);
        gameScreen = new GameScreen(this);
    }

    @Override
    public void create() {
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        enterLoadingScreen();
        enterMainMenuScreen();
    }

    public void enterLoadingScreen() {
        debug("Entering LoadingScreen");
        setScreen(loadingScreen);
    }

    public void enterMainMenuScreen() {
        debug("Entering MainMenuScreen");
        setScreen(mainMenuScreen);
    }

    public void enterGameScreen() {
        debug("Entering GameScreen");
        Screen previousScreen = getScreen();
        setScreen(gameScreen);
        previousScreen.dispose();
    }

    public void debug(String message) {
        Gdx.app.debug("DEBUG", message);
    }

    public void info(String message) {
        Gdx.app.debug("INFO", message);
    }

    public void error(String message) {
        Gdx.app.error("ERROR", message);
    }
}
