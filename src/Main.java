import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        City city = new City();
        city.setId(0).setName("MDP").build();

        List<Evento> lista = Arrays.asList(new Evento(0, "Evento 2", 0),
                new Evento(3, "Evento 3", 1),
                new Evento(1, "Evento 1", 4),
                new Evento(4, "Evento 5", 2),
                new Evento(2, "Evento 4", 3),
                new Evento(5, "Evento 6", 0),
                new Evento(6, "Evento 7", 4));

        System.out.println(lista.stream().map(Evento::getId).limit(5).collect(Collectors.toList()));
        Collections.sort(lista, Comparator.comparing(evento -> evento.getName()));
        System.out.println(lista);
    }
}