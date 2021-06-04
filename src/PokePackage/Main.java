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

        WaterFactory WF= new WaterFactory();
        WF.setMaxHP(100);
        WF.setName("Kmisa");
        WF.setSpecies("Butterflop");
        WF.setMaxPP(21);
        System.out.println(WF.create().getClass());
        WaterType Kmisa= WF.create();
        Kmisa.fullInfo();

        FireFactory FF= new FireFactory();

        FF.setName("Charmooder3");
        FF.setSpecies("Charmander");
        FF.setMaxHP(125);
        FF.setMaxPP(10);

        FireType P3= FF.create();
        P3.fullInfo();
        P3.sufferHP(100);
        P3.hp();
        P3.use(new Potion());
        P3.hp();

        P3.use(new FullRestore());
        P3.hp();
        P3.pp();

        PlantFactory PF= new PlantFactory();
        PF.setFull("Nugaloog", "Squiddy", 328, 3);
        PlantType Nugaloog= PF.create();
        Nugaloog.fullInfo();

        Kmisa.fight(Nugaloog);

    }

}
