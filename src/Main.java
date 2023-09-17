public class Main {
    public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        CarDirector director = new CarDirector(sportsCarBuilder);

        director.constructCar();
        Car sportsCar = sportsCarBuilder.getResult();

        System.out.println("Sports Car: " + sportsCar);
    }
}