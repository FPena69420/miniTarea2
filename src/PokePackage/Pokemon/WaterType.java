package PokePackage.Pokemon;

/** Clase waterType, instancia objetos que representan pokemones de clase agua, capaces de
 pelear contra pokemones de clase agua, planta y fuego */
public class WaterType extends AbstractPokemon implements FightInterface {

    /** Metodo constructor */
    public WaterType(String name, String species, int maxHP, int maxPP) {
        super(name, "Water Type", species, maxHP, maxPP);
    }



    @Override
    /** Metodo usado para que este pokemon pelee con otro */
    public void fight(FightInterface pokemon){

        System.out.println(this.getName() + " ha atacado.");
        pokemon.foughtByWaterType();

    }

    @Override
    public void foughtByPlantType() {

        System.out.println(this.getName() + " ha sufrido 10 de daño.");
        this.sufferHP(10);

    }

    @Override
    public void foughtByWaterType() {

        System.out.println(this.getName() + " ha sufrido 5 de daño.");
        this.sufferHP(5);

    }

    @Override
    public void foughtByFireType() {

        System.out.println(this.getName() + " ha sufrido 5 de daño.");
        this.sufferHP(5);

    }
}
