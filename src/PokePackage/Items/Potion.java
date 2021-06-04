package PokePackage.Items;

import PokePackage.Pokemon.*;

public class Potion implements ItemsInterface{

    @Override
    public void used_by(AbstractPokemon pokemon) {
        AbstractPokemon P= (AbstractPokemon) pokemon;

        P.healHP(10);
    }

}
