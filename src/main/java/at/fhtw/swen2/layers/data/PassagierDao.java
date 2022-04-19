package at.fhtw.swen2.layers.data;

import at.fhtw.swen2.layers.model.Passagier;

import java.util.Collection;

public interface PassagierDao {

    Collection<Passagier> getAllPassagiere();
    void savePassagier(Passagier passagier);
}
