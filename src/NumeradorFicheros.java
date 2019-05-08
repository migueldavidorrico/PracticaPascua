import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class NumeradorFicheros {
    public static void main(String[] args) throws IOException {
        File original=new File(args[0]);

        File destino=File.createTempFile("tmp"+System.currentTimeMillis(),"txt");
        try(BufferedReader br=new BufferedReader(new FileReader(original))
            ; BufferedWriter bw=new BufferedWriter(new FileWriter(destino))){
            String linea=br.readLine();
            int contador=1;
            while(linea!=null) {
                linea=(contador++)+". "+linea;

                System.out.println(linea);

                bw.write(linea);
                bw.newLine();
                linea=br.readLine();
            }
        }
        destino.renameTo(original);
    }
}
