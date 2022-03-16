import br.com.models.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Client c1 = new Client(1, "João", "Silva", LocalDate.parse("08/12/2018", formatter));
        Client c2 = new Client(2, "Ana", "Pereira", LocalDate.parse("09/04/2017", formatter));
        Client c3 = new Client(3, "Jose", "Silveira", LocalDate.parse("21/06/2019", formatter));

        List<Client> clientList = Arrays.asList(c1, c2, c3);

        listaClientes(clientList);
    }

    public static void listaClientes(List<Client> list) {
        list.forEach(System.out::println);
    }
}