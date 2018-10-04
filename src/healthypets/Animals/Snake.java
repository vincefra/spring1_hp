package healthypets.Animals;

import healthypets.Animals.Base.IAnimalFood;
import healthypets.Animals.Base.Pets;
import javax.swing.JOptionPane;

public class Snake extends Pets implements IAnimalFood {
    
    public Snake(String name, int weight)
    {
        super(name, weight);
    }

    @Override
    public void printFood() 
    {
        JOptionPane.showMessageDialog(null, "Mat: Ormpellets" + "\n"
                + "Portion: 20gram"); 
    }
}
