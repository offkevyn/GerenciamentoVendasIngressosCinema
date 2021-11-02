package controller.fichario;

import java.sql.SQLException;
import model.Caixa;

public class CaixaFichario extends GenericFichario<Caixa>{
    
    public CaixaFichario() throws SQLException {
        super(Caixa.class);
    }
}
