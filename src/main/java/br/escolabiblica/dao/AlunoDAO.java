package br.escolabiblica.dao;

import br.escolabiblica.model.Aluno;
import br.escolabiblica.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class AlunoDAO extends GenericDAO<Aluno> {

    @Override
    public Class<Aluno> getClassType() {
        return Aluno.class;
    }

    public List<Aluno> buscarPorNome(String nome) {
        String jpql = "select p from Aluno p where p.nome like :nome";
        TypedQuery<Aluno> query = getEm().createQuery(jpql, Aluno.class).setMaxResults(10);
        query.setParameter("nome", "%"+ nome + "%");
        return query.getResultList();
    }

}
