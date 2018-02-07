package InteritanceProject;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"CapCher",50000);

        System.out.println(emp1);
        System.out.println("pay for capcher "+emp1.pay());

        Manager mng1 = new Manager(2,"Pun",100000,12000);
        mng1.setEmpId("MNG-002");
        
        System.out.println(mng1);
        System.out.println("Pay for pun "+mng1.pay());    }
}
