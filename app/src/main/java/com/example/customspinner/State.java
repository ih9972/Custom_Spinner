package com.example.customspinner;

public class State {
    private String stateName, stateCapital, statePopulation;
    private int stateImageId;

    public State(String stateName, String stateCapital, String statePopulation, int stateImageId) {
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.statePopulation = statePopulation;
        this.stateImageId = stateImageId;

    }

    public String getStateName() {
        return stateName;
    }

    public String getStateCapital() {
        return stateCapital;
    }

    public String getStatePopulation() {
        return statePopulation;
    }

    public int getStateImageId() {
        return stateImageId;
    }
}
