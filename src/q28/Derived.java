package q28;

public class Derived extends Base{
    int id = 2000; //Line n5
    // hides the variable created at Line n1

    Derived(){} //Line n6
    // Before it starts executing remaining statements inside the constructor,
    // instance variable assignment statement (if available) are executed

    @Override
    void Base() { //Line n7
        System.out.println(--id); //Line n8
        //  This id variable still stores the value 0 as
        //  Base class's constructor has not finishes its execution.
    }
}
