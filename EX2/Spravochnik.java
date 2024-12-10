import java.util.*;
public class Spravochnik{
    private HashMap<String,String> spravochnik= new HashMap<>();
    public Spravochnik (){
        spravochnik = new HashMap<>();
    }

    public void add(String Surname, String number ) {
        spravochnik.put(Surname, number);
    }
    public void get (String Surname){
        System.out.println(spravochnik.get(Surname));
    }
    }

