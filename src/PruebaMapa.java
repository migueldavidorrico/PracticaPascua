import javax.swing.*;
import java.text.Collator;
import java.util.*;

public class PruebaMapa {



    public static void main(String[] args) {
        ComparadorSpanish c = ComparadorSpanish.getInstance();
        Map<String,String> colores= new HashMap<>();
        colores.put("rojo","#FF0000");
        colores.put("azul","#0000EE");
        colores.put("árbol","#FEFEFE");
        colores.put("verde","#22FF00");
        colores.put("amarillo","#AAFF00");
        colores.put("Íllice","#77CCASA");
        colores.put("gris claro","#BBBBBB");
        colores.put("negro","#000000");
        colores.put("ñoño","#448810");



        List<String> ordenados=new ArrayList<>();
        ordenados.addAll(colores.keySet());
        ordenados.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return c.compare(o1,o2);
            }
        });
        Iterator<String> iterador=ordenados.iterator();
        while(iterador.hasNext()){
            String actual=iterador.next();
            JOptionPane.showMessageDialog(null,
                    "<html><h1 style=\"color:"+colores.get(actual)+"\">"+actual+"</h1>");
        }
//
//        for (Map.Entry<String, String> entrada :
//                colores.entrySet()) {
//            JOptionPane.showMessageDialog(null,
//                    "<html><h1 style=\"color:"+entrada.getValue()+"\">"+entrada.getKey()+"</h1>");
//        }
//
//        List<String> aBorrar=new ArrayList<>();
//        for (String entrada :
//                colores.keySet()) {
//            if(entrada.startsWith("a")){
//                aBorrar.add(entrada);
//
//            }
//        }
//
//        System.out.println(aBorrar.size());
//        for (String s :
//                aBorrar) {
//            colores.remove(s);
//        }
//        for (Map.Entry<String, String> entrada :
//                colores.entrySet()) {
//            JOptionPane.showMessageDialog(null,
//                    "<html><h1 style=\"color:"+entrada.getValue()+"\">"+entrada.getKey()+"</h1>");
//        }
    }
}
