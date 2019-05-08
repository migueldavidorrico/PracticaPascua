import java.io.*;

public class LeerBMP {

    public static void main(String[] args) {
        int contador=56;
        try(RandomAccessFile raf=new RandomAccessFile("blanco.bmp","rw");
        RandomAccessFile rafEscribir=new RandomAccessFile("bonito.bmp","rw")){
                byte[] cabecera=new byte[55];
                raf.read(cabecera);
                rafEscribir.write(cabecera);

                while(true) {
                    byte b=raf.readByte();
                    byte g=raf.readByte();
                    byte r=raf.readByte();
                    byte media=(byte)((b+g+r)/3);
                    rafEscribir.writeByte(media);
                    rafEscribir.writeByte(media);
                    rafEscribir.writeByte(media);
                    contador+=3;
                    if(contador>raf.length()){
                        break;
                    }
//                    System.out.println(contador+" "+raf.length());
                }

            } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
