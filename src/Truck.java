public class Truck extends Transport {
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки грузовика");
    }

    @Override
    public void checkTransport() {
        checkEngine();
        checkTrailer();
        System.out.println("С грузовиком все в порядке");

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


}
