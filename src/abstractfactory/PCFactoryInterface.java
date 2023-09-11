package abstractfactory;

public class PCFactoryInterface implements ComputerFactoryInterface {
    private String name;
    private String type;
    public PCFactoryInterface(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public Computer createComputer() {
        return new PC(name, type);
    }
}
