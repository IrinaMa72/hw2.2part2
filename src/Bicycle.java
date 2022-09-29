public class Bicycle extends Transport {
   @Override
    public void updateTyre() {
       System.out.println("Меняем покрышки велосипеда");
    }

    @Override
    public void checkTransport() {
        System.out.println("С велосипедом все в порядке");

    }

}
