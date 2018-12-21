
package app;

import java.util.Observable;
import java.util.Observer;

public class Doctor implements Observer {
    private String name = null;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public void update(Observable observable, Object object) {
        System.out.print("SMS sent to Doctor " + getName() + " ==> ");
        System.out.println("Patient " + ((Patient)observable).getName() + " " + object);
    }
    
}
