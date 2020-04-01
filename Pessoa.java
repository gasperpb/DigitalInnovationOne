/**
 * /** Pessoa
 *
 * @author Vasconcelos Achilles
 * @since v0.0.1
 * @version v1.0.0 Tuesday, March 31st, 2020.
 * @global
 */
public class Pessoa {
    private String nome;
    private Double altura;
    private Double peso;

    public Pessoa(final String nome, final Double altura, final Double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;

    }

    public Double getPeso() {
        return peso;
    }
}