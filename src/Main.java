import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

       staff employee=new staff();
       employee.initiliaze1();
       employee.print1();
       employee.initialize();
       employee.print();
       person person=new person();
       person.initialize();
       person.print();
    }
}