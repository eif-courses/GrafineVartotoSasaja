package lambda.demo;

import java.util.function.Supplier;

public class Kelione {

 public void keliauti(Elgsena elgsena){
    elgsena.vykdyti();
 }
 public String patvirtinti(Supplier<String> supplier){
   return supplier.get();
 }
 public void arPakankaLesu(Predikatas<Integer> predicate, int suma){
   if(predicate.test(suma)){
     System.out.println("Jusu saskaita pakankama aciu uz pinigus!");
   }else {
     System.out.println("Saskaitos likutis nepakankamas");
   }
 }




}
