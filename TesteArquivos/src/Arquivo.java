import java.io.*;

public class Arquivo {
    public static boolean Write(String path, String texto){
        try{
            FileWriter arq = new FileWriter(path);
            PrintWriter gravarArq = new PrintWriter(path);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
