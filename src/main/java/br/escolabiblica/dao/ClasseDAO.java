package br.escolabiblica.dao;

import br.escolabiblica.model.Classe;
import br.escolabiblica.util.GenericDAO;

public class ClasseDAO extends GenericDAO<Classe> {

    @Override
    public Class<Classe> getClassType() {
        return Classe.class;
    }

}
