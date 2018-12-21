
package app;

import java.util.Observable;

public class Patient extends Observable {
    private String name;
    private String state;
    
    public Patient(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        setChanged();
        notifyObservers(getState());
    }
    
}
