package br.escolabiblica.principal;

import br.escolabiblica.dao.ClasseDAO;
import br.escolabiblica.model.Classe;

public class Principal {
    
    public static void main(String[] args) {
        
        new ClasseDAO().insert(new Classe(0, "Calçados", "Setor de Calçados"));

//        System.out.println(new ClasseDAO().selectAll());

        System.exit(0);
        
    }
    
}
