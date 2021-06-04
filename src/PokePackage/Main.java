package PokePackage;

import PokePackage.Factory.*;
import PokePackage.Items.*;
import PokePackage.Pokemon.*;

public class Main {

    public static void main(String args[]){
        FireType Chomli= new FireType("Chomli", "guacalasor", 120, 19);
        WaterType Paolus= new WaterType("Paolus", "chungusor", 25, 11);
        PlantType Chipa= new PlantType("Chipa", "guachalomo", 35, 9);
        PlantType Bugger= new PlantType("Bugger", "moco", 1, 1);

        Chomli.fight(Paolus);
        Paolus.hp();

        Chomli.fight(Chipa);
        Chipa.hp();

        Paolus.fight(Chomli);
        Chomli.hp();
        Chomli.outtacombat();

        Paolus.fight(Chipa);
        Chipa.hp();

        Chomli.fight(Bugger);
        Bugger.hp();
        /**Bugger.outtacombat();*/
        System.out.println("NOOOOOOO, Buggeeeeeeer!!!!!111!!1!");

        Bugger.info();
        Chomli.info();
        Paolus.info();

        Creator C= new Creator();

        C.setCurrentFactory(new FireFactory());
        AbstractPokemon Charmooder= C.create();
        Charmooder.info();

        C.setName("Charmooder2");
        C.setSpecies("Charmander");
        C.setMaxHP(125);
        C.setMaxPP(10);

        AbstractPokemon P2= C.create();
        P2.info();

        C.setName("Charmooder3");
        AbstractPokemon P3= C.create();
        P3.info();

        P3.sufferHP(100);
        P3.hp();
        P3.use(new Potion());
        P3.hp();

        P3.use(new FullRestore());
        P3.hp();
        P3.pp();

        C.setCurrentFactory(new WaterFactory());
        C.setMaxHP(100);
        C.setName("Gugul");
        C.setSpecies("Butterflop");
        C.setMaxPP(21);

        WaterType Gugul= (WaterType) C.create();
        Gugul.fullInfo();

        C.setName("Kmisa");
        WaterType Kmisa= (WaterType) C.create();
        Kmisa.fullInfo();

        Kmisa.fight(Gugul);
        Gugul.fullInfo();
    }

}
