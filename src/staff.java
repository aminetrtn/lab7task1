import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class staff extends person {

    String education, position;
    void initiliaze1 () throws IOException {
        initialize();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter yur rducation");
        education= br.readLine();
        System.out.println("enter your position");
        position= br.readLine();
    }
void print1 ()
{
    print();
    System.out.println("education:"+education);
    System.out.println(" position:"+position);
}

}
