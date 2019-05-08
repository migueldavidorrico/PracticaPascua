import java.io.*;

public class Datos {
    public static void main(String[] args) throws IOException {
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("datos.otm"))){
            dos.writeInt(50);
            dos.writeUTF("Perico de los palotes");
        }

        try(DataInputStream dis=new DataInputStream(new FileInputStream("datos.otm"))){
            while(true) {
                System.out.println(dis.readInt());
                System.out.println(dis.readUTF());
            }

        } catch (EOFException eof){
            System.out.println("Bien leido");
        }
    }
}
