package PokePackage.Factory;

import PokePackage.Pokemon.*;

public class WaterFactory extends AbstractFactory{

    public WaterFactory() {
        super();
    }

    public WaterType create() {
        try {
            return new WaterType(this.getName(), this.getSpecies(), this.getMaxHP(), this.getMaxPP());
        }
        catch (Exception e){
            System.out.println("There was an error trying to create the Pokemon");
            return null;
        }
    }

}
