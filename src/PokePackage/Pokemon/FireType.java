package PokePackage.Pokemon;

/** Clase FireType, instancia objetos que representan pokemones de clase fuego, capaces de
 pelear contra pokemones de clase agua, planta y fuego. */
public class FireType extends AbstractPokemon implements FightInterface {

    /** Metodo constructor */
    public FireType(String name, String species, int maxHP, int maxPP) {
        super(name, "Fire Type", species, maxHP, maxPP);
    }



    @Override
    /** Metodo usado para que este pokemon pelee con otro */
    public void fight(FightInterface pokemon){

        System.out.println(this.getName() + " ha atacado.");
        pokemon.foughtByFireType();

    }


    @Override
    public void foughtByPlantType() {

        System.out.println(this.getName() + " ha sufrido 5 de daño.");
        this.sufferHP(5);

    }

    @Override
    public void foughtByWaterType() {

        System.out.println(this.getName() + " ha sufrido 10 de daño.");
        this.sufferHP(10);

    }

    @Override
    public void foughtByFireType() {

        System.out.println(this.getName() + " ha sufrido 5 de daño.");
        this.sufferHP(5);

    }

}
