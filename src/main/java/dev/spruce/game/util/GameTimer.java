package dev.spruce.game.util;

import dev.spruce.game.Game;

public class GameTimer {

    private float hours;
    private float minutes;
    private float seconds;

    public void update() {
        seconds += 1.0f / Game.FPS;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
            }
        }
    }

    public void reset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public float getHours() {
        return hours;
    }

    public float getMinutes() {
        return minutes;
    }

    public float getSeconds() {
        return seconds;
    }

    public String getFormattedTime() {
        return String.format("%02d:%02d:%02d", (int) hours, (int) minutes, (int) seconds);
    }
}
