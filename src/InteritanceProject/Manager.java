
package InteritanceProject;


public class Manager extends Employee{
    private String empId;
    private double positionAllowance;

    public void setEmpId(String emgId) {
        this.empId = emgId;
    }
    

    public Manager(long empId, String empName, double payRate, double positionAllowance) {
        super(empId, empName, payRate);
        this.positionAllowance = positionAllowance;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    @Override
    public double pay() {
        return payRate+positionAllowance;
    }
    

    @Override
    public String toString() {
        return "Manager{" + "positionAllowance=" + positionAllowance + super.toString();
    }
    
}
