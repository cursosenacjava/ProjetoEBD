package br.escolabiblica.dao;

import br.escolabiblica.model.Sexo;
import br.escolabiblica.util.GenericDAO;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
}
