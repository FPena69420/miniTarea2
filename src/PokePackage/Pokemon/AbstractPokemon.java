package PokePackage.Pokemon;

import PokePackage.Items.ItemsInterface;

public abstract class AbstractPokemon implements UseItemsInterface {
    private final String name;
    private final String species;
    private final String type;
    private final int maxHP;
    private int currentHP;
    private final int maxPP;
    private int currentPP;
    private boolean alive;

    /** Metodo constructor */
    AbstractPokemon(String name, String type, String species, int maxHP, int maxPP) {
        this.name= name;
        this.type= type;
        this.species= species;
        this.maxHP= maxHP;
        this.currentHP= maxHP;
        this.maxPP= maxPP;
        this.currentPP= maxPP;
        this.alive= maxHP> 0;
    }

    /** Retorna el atributo maxHP */
    public int getMaxHP(){
        return maxHP;
    }

    /** Retorna el atributo currentHP */
    public int getCurrentHP(){
        return currentHP;
    }

    /** Setter del atributo currentHP */
    public void setCurrentHP(int amount){
        currentHP= amount;
    }


    /** Imprime en pantalla una comparacion entre el valor actual y maximo del hp */
    public void hp(){
        System.out.println(name + " HP: " + currentHP + " / " + maxHP);
    }


    /** Imprime en pantalla una comparacion entre el valor actual y maximo del pp */
    public void pp(){
        System.out.println(name + " PP: " + currentPP + " / " + maxPP);
    }


    /** Retorna true en caso de que los hp actuales de un objeto de la clase
     sean 0 o menos, false en caso contrario */
    public Boolean isItDead(){
        return !alive;
    }


    /** Metodo que imprime en pantalla la condicion de un objeto de la clase
     según su estado de hp */
    public void outtacombat(){

        if (this.isItDead()) {
            System.out.println(name + " ha fallecido en combate.");
        }

        else {
            System.out.println(name + " puede seguir peleando.");
        }

    }

    /** Retorna el atributo name */
    public String getName(){
        return name;
    }

    /** Retorna el atributo type */
    public String getType(){
        return type;
    }

    /** Retorna el atributo species */
    public String getSpecies(){
        return species;
    }

    /** Retorna el atributo alive */
    public boolean getLife() {
        return alive;
    }

    /** Setter del atributo alive */
    public void setLife(boolean life) {
        alive= life;
    }

    /** Retorna el atributo maxPP */
    public int getMaxPP() {
        return maxPP;
    }

    /** Retorna el atributo currentPP */
    public int getCurrentPP() {
        return currentPP;
    }

    /** Setter del atributo currentPP */
    public void setCurrentPP(int aCurrentPP) {
        currentPP= aCurrentPP;

        if (currentPP> maxPP) {
            currentPP= maxPP;
        }

    }

    /** Imprime en pantalla información acerca del objeto de la clase */
    public void info(){
        System.out.println(name + ": " + species + " de tipo " + type);
    }

    /** Imprime en pantalla información acerca del objeto de la clase */
    public void fullInfo() {
        this.info();
        this.hp();
        this.pp();
    }

    /** Setter del atributo currentHP */
    public void sufferHP(int hp){
        currentHP-= hp;
        if (currentHP<= 0){

            System.out.println(name + " ha fallecido en combate.");
            alive= false;

        }
    }

    /** Setter del atributo currentHP */
    public void healHP(int hp){
        currentHP+= hp;
        if (currentHP> maxHP){

            currentHP= maxHP;

        }
    }

    /** Setter del atributo currentPP */
    public void sufferPP(int pp){
        currentPP-= pp;
    }

    /** Setter del atributo currentPP */
    public void healPP(int pp){
        currentPP+= pp;
        if (currentPP> maxPP){

            currentPP= maxPP;

        }
    }

    @Override
    /** Método para usar items */
    public void use(ItemsInterface item) {
        item.used_by(this);
    }

}
