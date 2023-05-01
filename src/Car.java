public class Car extends WheeledTransport implements Serviceable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }

    @Override
    public void service(Mechanic mechanic) {
        super.service(mechanic);
        checkEngine();
    }
}