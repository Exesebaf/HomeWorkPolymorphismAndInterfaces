package company.com;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        for (int i = 1; i <= getWheelsCount(); i++) {
            System.out.printf("Меняем %s покрышку грузовика \n", i);
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}
