package view;

import model.Cliente;
import model.Item;
import model.Produto;
import model.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(
            (byte) 33,
            "Florisbaldo",
            "980.946.830-07"
        );
        Vendedor vendedor = new Vendedor(
            (byte) 1,
            "Paulo Gilberto",
            "315.311.390-43"
        );
        Item item = new Item(
                new Produto(
                "ABC123",
                "Bolacha Trakinas Banana",
                3.44f
            ),
            (byte) 5
        );
    }
}
