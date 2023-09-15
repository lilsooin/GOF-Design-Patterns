package builder;

public class Car2 {

    private String name;
    private String number;
    private int price;
    private int builtDate;

    public Car2(CarParameters params) {
        this.name = params.name;
        this.number = params.number;
        this.price = params.price;
        this.builtDate = params.builtDate;
    }
}
