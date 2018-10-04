package healthypets.Animals;

import healthypets.Animals.Base.IAnimalFood;
import healthypets.Animals.Base.Pets;
import javax.swing.JOptionPane;

public class Cat extends Pets implements IAnimalFood  {
    
    public Cat(String name, int weight)
    {
        super(name, weight);
    }

    @Override
    public void printFood() 
    {
        JOptionPane.showMessageDialog(null, "Mat: Kattfoder" + "\n" 
                + "Portion: " + (getWeight() * 1000) / 150 + "gram"); 
    }
    
}
