package controller.fichario;

import java.sql.SQLException;
import model.Filme;

public class FilmeFichario  extends GenericFichario<Filme>{
    
    public  FilmeFichario() throws SQLException {
        super( Filme.class);
    }
}
