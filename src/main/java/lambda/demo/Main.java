package lambda.demo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {



    Kelione kelione = new Kelione();
    Elgsena keliauti = new Keliauti();
    Elgsena viesbutis = new ApsistotiViesbutyje();

    kelione.keliauti(keliauti); // Perdavem veiksma kaip metodo parametrą
    kelione.keliauti(viesbutis);


    //  void vykdyti();
    Elgsena apmoketiSaskaita = () -> System.out.println("Saskaita apmoketa!");
    kelione.keliauti(apmoketiSaskaita);

    String rezultatas = "Mokejimas patvirtintas";

    Supplier<String> tekstas = () -> rezultatas;
    Supplier<String> badMessage = () -> "Nepavyko apmoketi";

    System.err.println(kelione.patvirtinti(tekstas));
    System.err.println(kelione.patvirtinti(badMessage));


    Predikatas<Integer> predikatas = param -> param < 5;

    Predikatas<Integer> pr2 = param -> param > 5;

    List<Predikatas<Integer>> predikatai = new ArrayList<>();

    predikatai.add(predikatas);
    predikatai.add(pr2);

    for (Predikatas<Integer> integerPredicate : predikatai) {
      kelione.arPakankaLesu(integerPredicate, 3);
    }

    BiPredicate<String, String> a = (pirmas, antras) -> pirmas.isEmpty() && antras.isEmpty();


    JButton h = new JButton();

    h.addActionListener(e ->  System.out.println("Mygtukas paspaustas"));
















































  }
}
