package controller.fichario;

import java.sql.SQLException;
import model.Secao;

public class SecaoFichario extends GenericFichario<Secao> {
    
    public SecaoFichario() throws SQLException {
        super(Secao.class);
    }
}
