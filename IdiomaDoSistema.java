import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do Sistema é ");
        System.out.println(loc.getLanguage());
    }
}
