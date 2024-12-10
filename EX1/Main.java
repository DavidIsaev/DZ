import java.util.*;
public class Main{
    public static void main(String[] args) {
    String[] array ={"кот","лев","мышь","","оцелот","кот","мышь","лев","оцелот","собака","собака","шмель","рыба","рыба","корова","опоссум"};
    HashSet<String> unique = new HashSet<String>();

    for(int i = 0; i < 16; i++){
        unique.add(array[i]);
    }

     System.out.println("Уникальный ввод"); 
    System.out.println(unique);
    int count = 1;
    HashMap<String,Integer> map= new HashMap<>();
    for(String i : array) {
        if (map.containsKey(i)){
            map.put(i,map.get(i) + 1);
        }
        else{
            map.put(i,1);
        }
    }
    System.out.println("Колличество вхождений");
    for(String r : unique){
        System.out.println(r +" : " +  map.get(r));
    } 
    }

}