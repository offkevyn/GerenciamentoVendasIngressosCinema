package controller.fichario;

import controller.DAO.SalaDAO;
import java.sql.SQLException;
import model.Sala;

public class SalaFichario extends GenericFichario<Sala>{

    public SalaFichario() throws SQLException {
        super(Sala.class);
    }
}
