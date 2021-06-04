fireType Chomli= new fireType("Chomli", "guacalasor", 120);
waterType Paolus= new waterType("Paolus", "chungusor", 25);
plantType Chipa= new plantType("Chipa", "guachalomo", 35);
plantType Bugger= new plantType("Bugger", "moco", 1);

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