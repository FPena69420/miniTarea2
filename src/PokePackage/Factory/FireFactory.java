package PokePackage.Factory;

import PokePackage.Pokemon.*;

public class FireFactory implements PokeFactory {

    private String name= "";
    private String species= "";
    private int maxHP= -1;
    private int maxPP= -1;


    public FireType create() {
        return new FireType(name, species, maxHP, maxPP);
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
    /** Define el atributo maxHP */
    public void setMaxHP(int aMaxHP) {
        this.maxHP= aMaxHP;
    }

    @Override
    /** Define el atributo maxPP */
    public void setMaxPP(int aMaxPP) {
        this.maxPP= aMaxPP;
    }

    @Override
    /** Establece los atributos a sus valores de inicio */
    public void reset() {
        name= "";
        species= "";
        maxHP= -1;
        maxPP= -1;
    }

    @Override
    /** Establece todos los atributos al mismo tiempo */
    public void setFull(String aName, String aSpecies, int aMaxHP, int aMaxPP) {
        name= aName;
        species= aSpecies;
        maxHP= aMaxHP;
        maxPP= aMaxPP;
    }

}
