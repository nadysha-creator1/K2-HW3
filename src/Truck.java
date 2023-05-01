public class Truck extends WheeledTransport implements Serviceable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service( Mechanic mechanic) {
     super.service(mechanic);
     checkEngine();
     checkTrailer();
    }

}
