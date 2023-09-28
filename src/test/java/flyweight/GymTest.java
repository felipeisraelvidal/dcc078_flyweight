package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GymTest {
    @Test
    void deveRetornarAlunos() {
        Gym gym = new Gym();
        gym.enroll("Jose", "Juiz de Fora", "MG");
        gym.enroll("Maria", "Juiz de Fora", "MG");
        gym.enroll("Ana", "Juiz de Fora", "MG");
        gym.enroll("Joao", "Santos Dumont", "MG");

        List<String> saida = Arrays.asList(
                "Person { name: 'Jose', city: 'Juiz de Fora', state: 'MG' }",
                "Person { name: 'Maria', city: 'Juiz de Fora', state: 'MG' }",
                "Person { name: 'Ana', city: 'Juiz de Fora', state: 'MG' }",
                "Person { name: 'Joao', city: 'Santos Dumont', state: 'MG' }");

        assertEquals(saida, gym.getPeople());
    }

    @Test
    void deveRetornarTotalCidades() {
        Gym gym = new Gym();
        gym.enroll("Jose", "Juiz de Fora", "MG");
        gym.enroll("Maria", "Juiz de Fora", "MG");
        gym.enroll("Ana", "Juiz de Fora", "MG");
        gym.enroll("Joao", "Santos Dumont", "MG");

        assertEquals(2, CityFactory.getTotalCidades());
    }
}
