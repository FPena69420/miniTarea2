package PokePackage.Items;

import PokePackage.Pokemon.*;

public class FullRestore implements ItemsInterface {

    @Override
    public void used_by(AbstractPokemon pokemon) {
        AbstractPokemon P= (AbstractPokemon) pokemon;

        P.healHP(P.getMaxHP());
        P.healPP(P.getMaxPP());
    }

}
