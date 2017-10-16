package br.escolabiblica.controller;

import br.escolabiblica.dao.ClasseDAO;
import br.escolabiblica.dao.AlunoDAO;
import br.escolabiblica.model.Classe;
import br.escolabiblica.model.Aluno;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "alunoBean")
public class AlunoBean {
    
    private Aluno aluno = new Aluno();
    
    public void salvar() {
        AlunoDAO dao = new AlunoDAO();
        if (this.aluno.getId() == 0) {
            dao.insert(this.aluno);
        } else {
            dao.update(this.aluno);
        }
        this.aluno = new Aluno();
    }
    
    public void editar(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public void excluir(Aluno aluno) {
        AlunoDAO dao = new AlunoDAO();
        dao.delete(aluno);
    }

    public List<Classe> getClasses() {
        ClasseDAO dao = new ClasseDAO();
        return dao.selectAll();
    }
    
    public List<Aluno> getAlunos() {
        AlunoDAO dao = new AlunoDAO();
        return dao.selectAll();
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
