class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public void constructCar() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildBody();
    }
}