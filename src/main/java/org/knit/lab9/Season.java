package org.knit.lab9;

public enum Season {
    WINTER("Холодно", "Новый год"),
    SPRING("Тепло", "Пасха"),
    SUMMER("Жарко", "День Независимости"),
    AUTUMN("Дождливо", "День Мамы");

    private final String temperature;
    private final String holiday;

    Season(String temperature, String holiday) {
        this.temperature = temperature;
        this.holiday = holiday;
    }
    public String getTemperature() {
        return temperature;
    }
    public String getHoliday() {
        return holiday;
    }
}

