package br.escolabiblica.converter;

import br.escolabiblica.dao.AlunoDAO;
import br.escolabiblica.model.Aluno;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "alunoConverter", forClass = Aluno.class)
public class AlunoConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringAluno) {
        if (stringAluno != null) {
            int id = Integer.parseInt(stringAluno);
            AlunoDAO dao = new AlunoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectAluno) {
        if (objectAluno != null) {
            Aluno cliente = (Aluno) objectAluno;
            return String.valueOf(cliente.getId());
        }
        return null;
    }
    
}
