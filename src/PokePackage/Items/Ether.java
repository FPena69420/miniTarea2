package PokePackage.Items;

import PokePackage.Pokemon.*;

public class Ether implements ItemsInterface{

    @Override
    public void used_by(AbstractPokemon pokemon) {
        AbstractPokemon P= (AbstractPokemon) pokemon;

        P.healPP(10);
    }

}
