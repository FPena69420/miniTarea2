package PokePackage.Factory;

import PokePackage.Pokemon.*;

public interface PokeFactory {

    void setName(String aName);
    void setSpecies(String aSpecies);
    void setMaxHP(int aMaxHP);
    void setMaxPP(int aMaxPP);

    void setFull(String aName, String aSpecies, int aMaxHP, int aMaxPP);

    void reset();
}
