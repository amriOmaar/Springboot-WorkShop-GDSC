package WorkShop_GDSC.esprit.tn.services;

import java.util.List;

public interface ICrudService<Class, typeId> {

    List<Class> getAll();
    Class add(Class class1) throws Exception;
    Class update(typeId typeId,Class class1) throws Exception;
    void delete(typeId typeId);
}
