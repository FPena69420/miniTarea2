package PokePackage.Factory;

import PokePackage.Pokemon.*;

public class PlantFactory implements PokeFactory {

    private String name= "";
    private String species= "";
    private int maxHP= -1;
    private int maxPP= -1;

    @Override
    public AbstractPokemon create() {
        return new PlantType(name, species, maxHP, maxPP);
    }

    @Override
    public void setName(String aName) {
        this.name= aName;
    }

    @Override
    public void setSpecies(String aSpecies) {
        this.species= aSpecies;
    }

    @Override
    public void setMaxHP(int aMaxHP) {
        this.maxHP= aMaxHP;
    }

    @Override
    public void setMaxPP(int aMaxPP) {
        this.maxPP= aMaxPP;
    }

    @Override
    public void reset() {
        name= "";
        species= "";
        maxHP= -1;
        maxPP= -1;
    }

}
