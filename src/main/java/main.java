import br.com.models.Item;
import br.com.models.Client;
import br.com.repository.ClientRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Client c1 = new Client(1, "João", "Silva", LocalDate.parse("08/12/2018", formatter));
        Client c2 = new Client(2, "Ana", "Pereira", LocalDate.parse("09/04/2017", formatter));
        Client c3 = new Client(3, "Jose", "Silveira", LocalDate.parse("21/06/2019", formatter));

        clientRepository.create(c1);
        clientRepository.create(c2);
        clientRepository.create(c3);

        Client client = clientRepository.findById(2);
        System.out.println("client found: " + client);

        Item i1 = new Item(1, "Laranja", new BigDecimal("2.50"), 10, LocalDate.parse("20/10/2020", formatter));
        Item i2 = new Item(2, "Maçã", new BigDecimal("1.50"), 5, LocalDate.parse("20/10/2020", formatter));
        Item i3 = new Item(3, "Banana", new BigDecimal("3.50"), 15, LocalDate.parse("20/10/2020", formatter));

        List<Item> itemList = new ArrayList<>(Arrays.asList(i1, i2, i3));

        clientRepository.delete(3);
        System.out.println(clientRepository.getAll());
    }
}

