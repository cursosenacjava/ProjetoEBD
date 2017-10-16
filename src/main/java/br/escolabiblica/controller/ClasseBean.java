package br.escolabiblica.controller;

import br.escolabiblica.dao.ClasseDAO;
import br.escolabiblica.model.Classe;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "classeBean")
public class ClasseBean {

    private Classe classe;

    public ClasseBean() {
        this.classe = new Classe();
    }

    public void salvar() {
        ClasseDAO dao = new ClasseDAO();
        if (this.classe.getId() == 0) {
            dao.insert(this.classe);
        } else {
            dao.update(this.classe);
        }
        this.classe = new classe();
    }
    
    public void editar(Classe classe) {
        this.classe = classe;
    }
    
    public void remover(Classe classe) {
        ClasseDAO dao = new ClasseDAO();
        dao.delete(classe);
    }
    
    public List<Classe> getClasses() {
        ClasseDAO dao = new ClasseDAO();
        return dao.selectAll();
    }
    
    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    private static class classe extends Classe {

        public classe() {
        }
    }
    
}
