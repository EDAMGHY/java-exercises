package ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier1 = new EntierNaturel(5);
            System.out.println("Valeur de entier1 : " + entier1.getVal());
            entier1.decrementer();
            System.out.println("Nouvelle valeur de entier1 après décrément : " + entier1.getVal());

            EntierNaturel entier2 = new EntierNaturel(-3); // Génère une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception capturée: " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
    }
}
