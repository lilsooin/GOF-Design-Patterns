package abstractfactory;

public class Mobile extends Computer {

    private String name;
    private String type;

    public Mobile(
            String name, String type
    ) {
        this.name = name;
        this.type = type;
        System.out.println("Mobile 생성");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}
