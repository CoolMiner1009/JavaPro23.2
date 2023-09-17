class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("Sport Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Sport Wheels");
    }

    @Override
    public void buildBody() {
        car.setBody("Sport Body");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
