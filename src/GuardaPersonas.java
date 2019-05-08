import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GuardaPersonas {
    private static final int TAMANYO_REGISTRO = 50;

    public static void main(String[] args) {
        Persona ana=new Persona("ana",(byte)32,1.50,"Soy de Elche");
        Persona bea=new Persona("bea",(byte)17,2.05,"Soy alta");
        try(RandomAccessFile raf=new RandomAccessFile("personas.dat","rw")){
            int registro=0;


            raf.seek(registro*TAMANYO_REGISTRO);
            raf.writeUTF(ana.getNombre());
            raf.seek(registro*TAMANYO_REGISTRO+10);
            raf.writeByte(ana.getEdad());
            raf.writeDouble(ana.getAltura());
            raf.writeUTF(ana.getDescripcion());

            registro=1;
            raf.seek(registro*TAMANYO_REGISTRO);
            raf.writeUTF(bea.getNombre());
            raf.seek(registro*TAMANYO_REGISTRO+10);
            raf.writeByte(bea.getEdad());
            raf.writeDouble(bea.getAltura());
            raf.writeUTF(bea.getDescripcion());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
