package OOP.localdates;

import java.time.LocalDate;

public class Exemplo011 {
    public static void main(String[] args) {
        
    
    LocalDate hoje = LocalDate.now();
    LocalDate ontem =hoje.minusDays(1);
   
   
     System.out.println(hoje);// today`s date

     System.out.println(ontem);//yesterday`s date
  

}}