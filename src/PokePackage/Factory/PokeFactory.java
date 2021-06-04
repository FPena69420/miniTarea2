package PokePackage.Factory;

import PokePackage.Pokemon.*;

public interface PokeFactory {

    AbstractPokemon create();
    void setName(String aName);
    void setSpecies(String aSpecies);
    void setMaxHP(int aMaxHP);
    void setMaxPP(int aMaxPP);

    void reset();
}
