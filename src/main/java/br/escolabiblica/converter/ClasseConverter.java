package br.escolabiblica.converter;

import br.escolabiblica.dao.ClasseDAO;
import br.escolabiblica.model.Classe;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "classeConverter", forClass = Classe.class)
public class ClasseConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringClasse) {
        if (stringClasse != null) {
            int id = Integer.parseInt(stringClasse);
            ClasseDAO dao = new ClasseDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectClasse) {
        if (objectClasse != null) {
            Classe classe = (Classe) objectClasse;
            return String.valueOf(classe.getId());
        }
        return null;
    }
    
}
