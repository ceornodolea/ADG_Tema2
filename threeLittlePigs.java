import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class threeLittlePigs {
    public static void main(String[] args){
        HashMap map = new HashMap(); // va fi de tip cuvant_cheie - numar_aparitii
        FileReader inputStream = null;
        Scanner s=null;
        try {
            inputStream = new FileReader("C:/Users/ceorn/Desktop/ADG/Tema2/src/poem.txt");
            s= new Scanner(inputStream);
            s.useLocale(Locale.US);
            while (s.hasNext()){
                // dam strip de numa numa
                String word = s.next().toLowerCase().replaceAll("\\p{Punct}","").trim();
                if (map.containsKey(word)){ //daca exista cuvantul in map
                    Integer count =(Integer)map.get(word); //caut cuvantul
                    map.put(word, count.intValue() + 1); //incrementez
                }else { //daca nu
                    map.put(word, 1); // nu exista, il adaug cu count 1
                }
            }
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList); // ordonez alfabetic

            for (int i=0; i< arrayList.size();i++){ //afisez fiecare element din map
                String word_searched = (String)arrayList.get(i);
                Integer word_count = (Integer)map.get(word_searched);
                System.out.println("Cuvantul: "+word_searched+" apare de "+word_count+" ori.");
            }

        }catch (IOException ex){
            System.out.println(ex);
        }finally {
            if (inputStream != null) try{
                inputStream.close();
                s.close();
            }catch (IOException ex)
            {
                System.out.println(ex);
            }
        }
    }
}
