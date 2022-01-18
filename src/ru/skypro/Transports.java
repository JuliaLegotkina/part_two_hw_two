package ru.skypro;

public class Transports {
    private final String modelName;
    private final int wheelsCount;

    public Transports(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Ошибка: двигателя нету");
    }

    public void checkTrailer() {
        System.out.println("Ошибка: прицепа нету");

    }
}
