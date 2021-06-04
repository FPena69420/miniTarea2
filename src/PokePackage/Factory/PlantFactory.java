package PokePackage.Factory;

import PokePackage.Pokemon.*;

public class PlantFactory implements PokeFactory {

    private String name= "";
    private String species= "";
    private int maxHP= -1;
    private int maxPP= -1;


    public PlantType create() {
        return new PlantType(name, species, maxHP, maxPP);
    }

    @Override
    /** Define el atributo name */
    public void setName(String aName) {
        this.name= aName;
    }

    @Override
    /** Define el atributo species */
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

    @Override
    public void setFull(String aName, String aSpecies, int aMaxHP, int aMaxPP) {
        name= aName;
        species= aSpecies;
        maxHP= aMaxHP;
        maxPP= aMaxPP;
    }

}
