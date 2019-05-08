import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ComparadorSpanish {

    private static Collator comparador;

    private static ComparadorSpanish ourInstance = new ComparadorSpanish();

    public static ComparadorSpanish getInstance() {
        return ourInstance;
    }

    private ComparadorSpanish() {
        comparador=Collator.getInstance(new Locale("es"));
    }
    private Collator getComparador(){
        return comparador;
    }

    public static int compare(String o1,String o2){
        ComparadorSpanish c=ComparadorSpanish.getInstance();
        return c.getComparador().compare(o1,o2);
    }
}
