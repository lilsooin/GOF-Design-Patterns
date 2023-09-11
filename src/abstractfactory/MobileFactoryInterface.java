package abstractfactory;

public class MobileFactoryInterface implements ComputerFactoryInterface {
    String name;
    String type;

    public MobileFactoryInterface(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public Computer createComputer() {
        return new Mobile(name, type);
    }
}
