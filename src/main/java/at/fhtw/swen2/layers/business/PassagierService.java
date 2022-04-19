package at.fhtw.swen2.layers.business;

import at.fhtw.swen2.layers.model.Passagier;
import at.fhtw.swen2.layers.model.Flug;

import java.util.Collection;

public interface PassagierService {

    Collection<Passagier> getPassagierListeForFlug(Flug flug);

    void savePassagier(Passagier passagier);

}
