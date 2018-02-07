
package week4;


public class Boss {
    private int id;
    private String name;
    private double saraly;

    public Boss() {
    }

    public Boss(int id, String name, double saraly) {
        this.id = id;
        this.name = name;
        this.saraly = saraly;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaraly() {
        return saraly+(saraly*0.25);
    }

    public void setSaraly(double saraly) {
        this.saraly = saraly;
    }

    @Override
    public String toString() {
        return "Boss{" + "id=" + id + ", name=" + name + ", saraly=" + saraly + '}';
    }
    
    
}
