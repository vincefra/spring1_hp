package healthypets.Animals;

import healthypets.Animals.Base.IAnimalFood;
import healthypets.Animals.Base.Pets;
import javax.swing.JOptionPane;

public class Dog extends Pets implements IAnimalFood {
    
    public Dog(String name, int weight)
    {
        super(name, weight);
    }

    @Override
    public void printFood() 
    {
        JOptionPane.showMessageDialog(null, "Mat: Hundfoder" + "\n" 
                + "Portion: " + (getWeight() * 1000) / 100 + "gram"); 
    }
}
