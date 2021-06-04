package PokePackage.Factory;

public abstract class AbstractFactory implements PokeFactory{
    private String name= "";
    private String species= "";
    private int maxHP= -1;
    private int maxPP= -1;


    @Override
    /** Define el atributo name */
    public void setName(String aName) {
        name= aName;
    }

    @Override
    /** Retorna el atributo name */
    public String getName() {
        return name;
    }

    @Override
    /** Define el atributo species */
    public void setSpecies(String aSpecies) {
        species= aSpecies;
    }

    @Override
    /** Retorna el atributo species */
    public String getSpecies() {
        return species;
    }

    @Override
    /** Define el atributo maxHP */
    public void setMaxHP(int aMaxHP) {
        maxHP= aMaxHP;
    }

    @Override
    /** Retorna el atributo maxHP */
    public int getMaxHP() {
        return maxHP;
    }

    @Override
    /** Define el atributo maxPP */
    public void setMaxPP(int aMaxPP) {
        maxPP= aMaxPP;
    }

    @Override
    /** Retorna el atributo maxPP */
    public int getMaxPP() {
        return maxPP;
    }

    @Override
    /** Establece los atributos a sus valores de inicio */
    public void reset() {
        name= "";
        species= "";
        maxHP= -1;
        maxPP= -1;
    }

    @Override
    /** Establece todos los atributos al mismo tiempo */
    public void setFull(String aName, String aSpecies, int aMaxHP, int aMaxPP) {
        name= aName;
        species= aSpecies;
        maxHP= aMaxHP;
        maxPP= aMaxPP;
    }
}
