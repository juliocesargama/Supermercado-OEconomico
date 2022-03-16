import br.com.models.Item;
import br.com.models.Client;
import br.com.models.Purchase;
import br.com.repository.ClientRepository;
import br.com.repository.ItemRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

            ClientRepository clientRepository = new ClientRepository();
            ItemRepository itemRepository = new ItemRepository();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            Client c1 = new Client(1, "João", "Silva", LocalDate.parse("08/12/2018", formatter));
            Client c2 = new Client(2, "Ana", "Pereira", LocalDate.parse("09/04/2017", formatter));
            Client c3 = new Client(3, "Jose", "Silveira", LocalDate.parse("21/06/2019", formatter));

            //create client
            clientRepository.create(c1);
            clientRepository.create(c2);
            clientRepository.create(c3);

            //find one client
            Integer id = 1;
            Client clientSave = clientRepository.findById(1);
            System.out.println(clientSave);

                //find all
            List<Client> clients = clientRepository.getAll();
            clients.forEach(System.out::println);

                //delete Client
            clientRepository.delete(id);

            Client c4 = new Client(3, "Jose", "Lima", LocalDate.parse("21/06/2019", formatter));
            clientRepository.update(c2);

            Item e1 = new Item(1, "arroz", new BigDecimal(20.0), 1, LocalDate.parse("08/12/2018", formatter));
            Item e2 = new Item(2, "feijão", new BigDecimal(16.0), 2, LocalDate.parse("08/12/2018", formatter));
            Item e3 = new Item(3, "macarrão", new BigDecimal(8.0), 1, LocalDate.parse("08/12/2018", formatter));

            System.out.println("Add items to fatura");
            List<Item> itens = List.of(e1, e2, e3);
            Purchase purchase = new Purchase(1, itens, 3, LocalDate.parse("08/12/2018", formatter));



    }
}

