package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    List<String> empList;

    public Employee() {
        empList = new ArrayList<>();
    }

    public Employee(List<String> list){
        this.empList = list;
    }

    public void loadData() {
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < empList.size(); ++i) {
            list.add(empList.get(i));
        }


        return new Employee(list);
    }
}
