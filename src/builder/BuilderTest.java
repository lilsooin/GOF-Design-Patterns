package builder;

public class BuilderTest {

    public static void main(String[] args) {
       /* Car car1 = new Car("K5", "12가1234", 1000, 20230101);
        Car car2 = new Car("12나1234", "K7", 2000, 20230102);
        Car car3 = new Car("K3", "12다1234", 20230103, 1500);*/

        Car car = new Car.CarBuilder()
                .addName("K5")
                .addNumber("12가1234")
                .addPrice(1000)
                .addBuiltDate(20230101)
                .build();


        CarParameters params = new CarParameters();
        params.name = "K5";
        params.number = "12가1234";
        params.price = 1000;
        params.builtDate = 20230101;

        Car2 car2 = new Car2(params);

    }


}
