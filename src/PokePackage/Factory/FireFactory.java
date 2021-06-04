package PokePackage.Factory;

import PokePackage.Pokemon.*;

public class FireFactory extends AbstractFactory {

    public FireFactory() {
        super();
    }

    public FireType create() {
        try {
            return new FireType(this.getName(), this.getSpecies(), this.getMaxHP(), this.getMaxPP());
        }
        catch (Exception e){
            System.out.println("There was an error trying to create the Pokemon");
            return null;
        }
    }

}
