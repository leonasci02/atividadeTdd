package TddTeste;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import principal.Palindromo;

public class PalindromoTest {

    private final Palindromo palindromo = new Palindromo();

    @Test
    @DisplayName("Verifica se o palindromo é verdadeiro")
    public void palindromoVerdadeiro(){
        List<String> listaDePalindromo = List.of("Rotator", "bob", "madam",//
                                    "mAlAyAlam", "1", "Able was I, ere I saw Elba",//
                                         "Madam I’m Adam","Step on no pets.", "Top spot!","02/02/2020");
        listaDePalindromo.forEach(item -> {
            Assertions.assertTrue(palindromo.ehPalindromo(item));
            System.out.printf("O texto: %s é um palíndromo.%n", item);
        });
    }

    @Test
    @DisplayName("Verifica se o palidromo eh falso")
    public void palindromoFalso(){
        List<String> listaDePalindromo = List.of("xyz", "elephant", "Country",//
                                    "Top . post!", "Wonderful-fool", "Wild imagination!");
        listaDePalindromo.forEach(item -> {
            Assertions.assertFalse(palindromo.ehPalindromo(item));
            System.out.printf("O texto: %s não é um palíndromo.%n", item);
        });
    }
}
