/**
/**
 * Aula09
 *
 * @author	Vasconcelos Achilles
 * @since	v0.0.1
 * @version	v1.0.0	Tuesday, March 31st, 2020.
 * @global
 */

public class Aula09 {
   /**  Clacular o imc
    MENOR QUE 18,5   MAGREZA  0
    ENTRE 18,5 E 24,9  NOMAL  0
    ENTRE 25,0 E 29,9 SOBREPESO I
    ENTRE 30,0 E 39,9 OBESIDADE II
    MAIOR QUE 40,0    OBESIDADE GAVE III
    */
public Double calcular(final Pessoa pessoa){
    final var altura = pessoa.getAltura();
    final var imc = pessoa.getPeso() / altura * altura;
    return imc;
}
        
    }
