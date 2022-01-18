package ru.skypro;

public class Car extends Transports {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}
