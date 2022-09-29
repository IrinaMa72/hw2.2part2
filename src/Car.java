public class Car extends Transport {
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки велосипеда");
    }

    @Override
    public void checkTransport() {
        checkEngine();
        System.out.println("С автомобилем все в порядке");


    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


}
