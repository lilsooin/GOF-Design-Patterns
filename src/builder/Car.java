package builder;

public class Car {

    private String name;
    private String number;
    private int price;
    private int builtDate;

    private Car(CarBuilder builder) {
        this.name = builder.name;
        this.number = builder.number;
        this.price = builder.price;
        this.builtDate = builder.builtDate;
    }

    public static class CarBuilder {

        private String name;
        private String number;
        private int price;
        private int builtDate;

        public Car build() {
            return new Car(this);
        }

        public CarBuilder addName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder addNumber(String number) {
            this.number = number;
            return this;
        }

        public CarBuilder addPrice(int price) {
            this.price = price;
            return this;
        }

        public CarBuilder addBuiltDate(int builtDate) {
            this.builtDate = builtDate;
            return this;
        }
    }
}
