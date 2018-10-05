package healthypets.Animals.Base;

import healthypets.Helper;

public abstract class Pets implements IAnimalFood 
{
    //abstrakt klass som bas för djuren
    
    //inkapslar, metoder set/get för bättre kontroll än protected
    private String name;
    
    //i gram, kg to g (/1000)
    private int weight;
    
    //krävs för att anropa super sen i extended class
    Pets(){}

    public Pets(String name, int weight)
    {
        setName(name);
        setWeight(weight);  
    }

    // <editor-fold defaultstate="collapsed" desc=" Set/Get ">
    
    public void setName(String name)
    {
        if (Helper.validName(name))
            this.name = name;   
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setWeight(int weight)
    {      
        this.weight = weight;
    }
    
    public int getWeight()
    {
        return weight;
    }

    // </editor-fold>
}
