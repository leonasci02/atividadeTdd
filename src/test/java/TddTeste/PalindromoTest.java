package TddTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import principal.Palindromo;
import java.util.Arrays;
import java.util.List;

public class PalindromoTest {

    private final Palindromo palindromo = new Palindromo();

    @Test
    @DisplayName("Verifica a exceção com texto nulo")
    public void palindromoExcecaoComTextoNulo() {
        Assertions.assertThrows(IllegalArgumentException.class,//
                () -> palindromo.ehPalindromo(null));
    }

    @Test
    @DisplayName("Verifica a exceção com texto vazio")
    public void palindromoExcecaoComTextoVazio() {
        Assertions.assertThrows(IllegalArgumentException.class,//
                () -> palindromo.ehPalindromo(""));
    }

    @Test
    @DisplayName("Verifica se o palindromo é verdadeiro")
    public void palindromoVerdadeiro() {
        List<String> listaDePalindromo = Arrays.asList("Rotator", "bob", "madam", "mAlAyAlam", //
                "1", "Able was I, ere I saw Elba", "Madam I’m Adam", "Top spot!", "02/02/2020");
        listaDePalindromo.forEach(item -> {
            Assertions.assertTrue(palindromo.ehPalindromo(item));
            System.out.printf("O texto: %s é um palíndromo.%n", item);
        });
    }

    @Test
    @DisplayName("Verifica se o palidromo é falso")
    public void palindromoFalso() {
        List<String> listaDePalindromo = Arrays.asList("xyz", "elephant", "Country", "Top . post!", //
                "Wonderful-fool","Wild imagination!");
        listaDePalindromo.forEach(item -> {
            Assertions.assertFalse(palindromo.ehPalindromo(item));
            System.out.printf("O texto: %s não é um palíndromo.%n", item);
        });
    }
}
