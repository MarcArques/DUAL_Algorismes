import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electrodomestic> electrodomestics = new ArrayList<>();
        electrodomestics.add(new Rentadora("Rentadora A", "Blanc", 400.99, "LG", "A++", 1200, 75.5));
        electrodomestics.add(new Rentadora("Rentadora B", "Negre", 350.99, "Samsung", "A++", 1000, 70.0));
        electrodomestics.add(new Nevera("Nevera A", "Gris", 500.50, "Bosch", "A++", 200, 55.0));
        electrodomestics.add(new Nevera("Nevera B", "Blanc", 450.00, "Siemens", "A+", 180, 50.0));
        electrodomestics.add(new Forn("Forn A", "Inox", 300.30, "Balay", "A+", 250, true));
        electrodomestics.add(new Forn("Forn B", "Blanc", 280.00, "Teka", "A", 230, false));

        List<Electrodomestic> clones = new ArrayList<>();
        for (Electrodomestic electrodomestic : electrodomestics) {
            clones.add(electrodomestic.clone());
        }

        System.out.println("Comparando la lista original consigo misma:");
        for (int i = 0; i < electrodomestics.size(); i++) {
            Electrodomestic original = electrodomestics.get(i);
            Electrodomestic otroOriginal = electrodomestics.get(i);

            System.out.println("Objetos iguales (mismo objeto): " + (original == otroOriginal));
            System.out.println("Misma clase: " + (original.getClass() == otroOriginal.getClass()));
            System.out.println("Iguales datos: " + original.equals(otroOriginal));
        }

        System.out.println("\nComparando la lista original con los clones:");
        for (int i = 0; i < electrodomestics.size(); i++) {
            Electrodomestic original = electrodomestics.get(i);
            Electrodomestic clon = clones.get(i);

            System.out.println("Objetos diferentes (clon): " + (original != clon));
            System.out.println("Misma clase: " + (original.getClass() == clon.getClass()));
            System.out.println("Iguales datos: " + original.equals(clon));
        }
    }
}
