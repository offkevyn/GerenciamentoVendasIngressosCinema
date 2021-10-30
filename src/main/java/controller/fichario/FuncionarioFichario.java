package controller.fichario;

import java.sql.SQLException;
import model.Funcionario;

public class FuncionarioFichario extends GenericFichario<Funcionario>{
    
    public FuncionarioFichario() throws SQLException {
        super(Funcionario.class);
    }
    
}
