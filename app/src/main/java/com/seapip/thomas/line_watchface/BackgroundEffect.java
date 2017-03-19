package com.seapip.thomas.line_watchface;

public enum  BackgroundEffect implements Preference {
    NONE(0),
    DARKEN(1),
    BLUR(2),
    DARKEN_BLUR(3);

    private int value;

    BackgroundEffect(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public BackgroundEffect fromValue(int value) {
        for (BackgroundEffect backgroundEffect : BackgroundEffect.values()) {
            if (backgroundEffect.getValue() == value) {
                return backgroundEffect;
            }
        }
        return NONE;
    }

    @Override
    public String toString() {
        switch (this){
            default:
            case NONE:
                return "None";
            case DARKEN:
                return "Darken";
            case BLUR:
                return "Blur";
            case DARKEN_BLUR:
                return "Darken & blur";
        }
    }
}
