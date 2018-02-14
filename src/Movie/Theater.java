/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

/**
 *
 * @author INT105
 */

public class Theater {
    private String name;

    public Theater() {
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        Theater temp;
        if (obj!=null && obj instanceof Theater) {
            temp = (Theater)obj;
            if (this.getName() == temp.getName()) 
                return true;    
        }
        return false; 
    }
}



