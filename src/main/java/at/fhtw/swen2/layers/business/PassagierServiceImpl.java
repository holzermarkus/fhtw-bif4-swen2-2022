package at.fhtw.swen2.layers.business;

import at.fhtw.swen2.layers.model.Passagier;
import at.fhtw.swen2.layers.data.PassagierDao;
import at.fhtw.swen2.layers.data.PassagierDaoImpl;
import at.fhtw.swen2.layers.model.Flug;

import java.util.Collection;

public class PassagierServiceImpl implements PassagierService {

    private PassagierDao passagierDao;

    @Override
    public Collection<Passagier> getPassagierListeForFlug(Flug flug) {
        return null;
    }

    @Override
    public void savePassagier(Passagier passagier) {
        // validate passagier
        // ...

        passagierDao.savePassagier(passagier);
    }

    {
        passagierDao = new PassagierDaoImpl();
    }
}
