package PokePackage.Factory;

import PokePackage.Pokemon.*;

public interface PokeFactory {

    void setName(String aName);
    void setSpecies(String aSpecies);
    void setMaxHP(int aMaxHP);
    void setMaxPP(int aMaxPP);

    String getName();
    String getSpecies();
    int getMaxHP();
    int getMaxPP();

    void setFull(String aName, String aSpecies, int aMaxHP, int aMaxPP);

    void reset();
}
