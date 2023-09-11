package abstractfactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerFactoryInterface computerFactoryInterface){
        return computerFactoryInterface.createComputer();
    }
}
