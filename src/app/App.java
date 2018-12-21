
package app;

public class App {

    public static void main(String[] args) {
        Doctor doctor01 = new Doctor("Ahmet");
        Doctor doctor02 = new Doctor("Ayse");
        Doctor doctor03 = new Doctor("Alptekin");
        
        System.out.println("* * * * * * * * * * * * * * * * * ");
        
        Patient patient01 = new Patient("Ali");
        patient01.addObserver(doctor01);
        patient01.addObserver(doctor02);
        System.out.println("Patient " + patient01.getName() + " is observed by doctor(s)" + doctor01.getName() + "," + doctor02.getName());
        patient01.setState("Heart rate is unstable");
        
        System.out.println("* * * * * * * * * * * * * * * * * ");
        
        Patient patient02 = new Patient("Murat");
        patient02.addObserver(doctor01);
        System.out.println("Patient " + patient01.getName() + " is observed by doctor(s)" + doctor01.getName());
        patient02.setState("Blood pressure is high");
        
        System.out.println("* * * * * * * * * * * * * * * * * ");
        
        Patient patient03 = new Patient("Fatma");
        patient03.addObserver(doctor02);
        patient03.addObserver(doctor03);
        System.out.println("Patient " + patient01.getName() + " is observed by doctor(s)" + doctor02.getName() + "," + doctor03.getName());
        patient02.setState("Blood pressure is low");
        
    }
    
}
