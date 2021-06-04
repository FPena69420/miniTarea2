package PokePackage;

import PokePackage.Factory.PokeFactory;
import PokePackage.Pokemon.AbstractPokemon;

public class Creator implements PokeFactory {
    private PokeFactory currentFactory= null;

    @Override
    /** Crea un pokemon de acuerdo a los parametros almacenados en currentFactory */
    public AbstractPokemon create() {

        try {
            return currentFactory.create();
        }

        catch (Exception e) {
            System.out.println("Cannot invoke create() because there is no Factory selected");
            return null;
        }
    }

    @Override
    /** 'Set'ea el atributo name de currentFactory */
    public void setName(String aName) {
        currentFactory.setName(aName);
    }

    @Override
    /** 'Set'ea el atributo species de currentFactory */
    public void setSpecies(String aSpecies) {
        currentFactory.setSpecies(aSpecies);
    }

    @Override
    /** 'Set'ea el atributo maxHP de currentFactory */
    public void setMaxHP(int aMaxHP) {
        currentFactory.setMaxHP(aMaxHP);
    }

    @Override
    /** 'Set'ea el atributo maxPP de currentFactory */
    public void setMaxPP(int aMaxPP) {
        currentFactory.setMaxPP(aMaxPP);
    }

    @Override
    /** Lleva los atributos de currentFactory a sus estados originales */
    public void reset() {
        currentFactory.reset();
    }

    /** Cambia la Factory almacenada en currentFactory */
    public void setCurrentFactory(PokeFactory aFactory) {
        currentFactory= aFactory;
    }

}
