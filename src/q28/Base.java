package q28;

public class Base {
    int id = 1000; //Line n1

    Base(){
        Base(); //Line n2
        // Before it starts executing remaining statements inside the constructor,
        // instance variable assignment statement (if available) are executed
        // Base() method defined in Derived class is executed.
        // Which overriding method to invoke, is decided at runtime based on the instance.
    }

    void Base(){ //Line n3
        System.out.println(++id); //Line n4
    }
}
