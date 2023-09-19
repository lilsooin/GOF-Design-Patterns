package prototype;

import java.util.List;

public class ProtoTypeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.loadData();

        //cloneData
        try {
            Employee clonData = (Employee) employee.clone();
            Employee clonData2 = (Employee) employee.clone();

            List<String> list = clonData.getEmpList();
            list.add("John");
            System.out.println("clonData: " + clonData.getEmpList());

            List<String> list2 = clonData2.getEmpList();
            list2.remove("Pankaj");
            System.out.println("clonData2: " + clonData2.getEmpList());

            System.out.println("emp List: " + employee.getEmpList());

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
