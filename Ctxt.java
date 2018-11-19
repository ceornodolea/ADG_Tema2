import java.io.*;

public class Ctxt {
    public static void copyTextFiles(){
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("C:/Users/ceorn/Desktop/ADG/Tema2/src/in.txt");
            outputStream = new FileWriter("C:/Users/ceorn/Desktop/ADG/Tema2/src/out.txt");
            int c;
            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        }catch (IOException ex){
            System.out.println("Err001"+ex);
        }finally {
            if (inputStream != null) try{
                inputStream.close();
            }catch (IOException ex)
            {
                System.out.println("Err002"+ex);
            }
            if (outputStream != null) try{
                outputStream.close();
            }catch (IOException ex){
                System.out.println("Err003"+ex);
            }
        }
    }
    public static void copyBinaryFiles(){
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try{
            inputStream = new FileInputStream("C:/Users/ceorn/Desktop/ADG/Tema2/src/inn");
            outputStream = new FileOutputStream("C:/Users/ceorn/Desktop/ADG/Tema2/src/outt");
            int c;
            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        }catch (IOException ex){
            System.out.println("Err004"+ex);
        }finally {
            if (inputStream != null) try{
                inputStream.close();
            }catch (IOException ex)
            {
                System.out.println("Err005"+ex);
            }
            if (outputStream != null) try{
                outputStream.close();
            }catch (IOException ex){
                System.out.println("Err006"+ex);
            }
        }
    }
    public static void main(String[] args){
        copyTextFiles();
        copyBinaryFiles();
}
}
