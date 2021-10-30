package controller.fichario;

import java.sql.SQLException;
import model.Cliente;

public class ClienteFichario extends GenericFichario<Cliente> {
    
    public  ClienteFichario() throws SQLException {
        super(Cliente.class);
    }
}
