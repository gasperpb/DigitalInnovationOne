/**
 * Programa
 */
public class Programa {
    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Andre", 1.9,100.0);
        final var calculadorDeImc = new Aula09();
        final var imc = calculadorDeImc.calcular(pessoa);
        System.out.printf("IMC = %.2f", imc);

        
    }

    
}