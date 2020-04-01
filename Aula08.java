import java.lang.module.ModuleDescriptor.Builder;

/**
 * Aula08
 */
public class Aula08 {

    public static void main(String[] args) {
        
        var nome = "Andre";
        var sobreNome= "Gomes";
        final var nomeCompleto = nome + sobreNome;
        System.out.println(nome);
        System.out.println("NOme do cliente : "+ nome);
        System.out.println("NOme completo do cliente : "+ nomeCompleto);
        final var mensagem = String.format("O cliente %s possui sobre nome %s", nome, sobreNome);
        System.out.println(mensagem);

        final var builder = new StringBuilder(nome);

        final var reverse = builder.reverse();
        System.out.println(reverse);
        System.out.println("A B C D E F G ".toCharArray());
        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula".concat("de java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

    }
}