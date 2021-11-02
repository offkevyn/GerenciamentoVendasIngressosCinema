package controller.fichario;

import java.sql.SQLException;
import model.Ingresso;

public class IngressoFichario extends GenericFichario<Ingresso>{
    
    public IngressoFichario() throws SQLException {
        super(Ingresso.class);
    }
    
}
