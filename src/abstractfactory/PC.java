package abstractfactory;

public class PC extends Computer {

    private String name;
    private String type;

    public PC(
        String name, String type
    ){
     this.name = name;
     this.type = type;
        System.out.println("PC 생성");
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
