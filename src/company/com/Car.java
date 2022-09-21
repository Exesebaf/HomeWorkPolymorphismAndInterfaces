package company.com;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i <= getWheelsCount(); i++) {
            System.out.printf("Меняем %s покрышку автомобиля  \n", i);
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();

    }
}
