package PokePackage.Factory;

import PokePackage.Pokemon.*;

public class PlantFactory extends AbstractFactory {

    public PlantFactory() {
        super();
    }

    public PlantType create() {
        try {
            return new PlantType(this.getName(), this.getSpecies(), this.getMaxHP(), this.getMaxPP());
        }
        catch (Exception e){
            System.out.println("There was an error trying to create the Pokemon");
            return null;
        }
    }

}
