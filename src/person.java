import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class person {
    String surname,firstname,street,city;
    int zipCode;
    void initialize  () throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("retrieving data about the person");
        System.out.println("enter your surname");
        surname= br.readLine();
        System.out.println("enter your firstname");
        firstname= br.readLine();
        System.out.println("enter your street");
        street= br.readLine();
        System.out.println("enter your city");
        city= br.readLine();
    }
    void print ()
    {
        System.out.println(" surname:"+surname);
        System.out.println(" firstname:"+firstname);
        System.out.println(" street:"+street);
        System.out.println(" city:"+city);
    }

    }

