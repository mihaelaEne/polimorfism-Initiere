import org.junit.Test;
import ro.mycode.models.FaceCare;
import ro.mycode.models.Produs;
import ro.mycode.models.Telefon;
import ro.mycode.models.Tricou;

import java.io.PrintWriter;

public class test {

    @Test

public void test(){
        FaceCare faceCare=new FaceCare("faceCare",1,"crema de fata","de folosit dimineata si seara",18);


        Telefon telefon=new Telefon("telefon",2,"iphone","negru",5000);


        Tricou tricou=new Tricou("tricou",3,36,"FirmaTricou","MaterialTricou");


        Produs produs=faceCare;

        produs=tricou;


        produs=telefon;


        produs.test();



    }
}
