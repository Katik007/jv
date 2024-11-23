package org.knit.lab9;

enum TrafficLight {
    RED("GREEN"),
    YELLOW("RED"),
    GREEN("YELLOW");

    private String nextLight;
    TrafficLight(String light) {
        nextLight=light;
    }

    public TrafficLight getNext() {
        return TrafficLight.valueOf(nextLight);
    }

}
