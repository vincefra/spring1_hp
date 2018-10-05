package healthypets;

import healthypets.Animals.*;
import healthypets.Animals.Base.Pets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vincent
 */
public class HealthyPets 
{
    /*
    
    En meddelanderuta, "Vilket djur ska få mat?" med tom rad under (?)
    Tomma raden ska användaren kunna fylla i djurets namn
    Efter att ha fyllt i namnet kommer en ny ruta som visar,
    Hur många gram mat djuret ska få och vilken sorts mat
    (kattfoder, hundfoder, ormpellets)
    
    Formler för mat,
    
    Hund, vikt i gram / 100 = vikt på portion i gram
    Katt, vikt i gram / 150 = vikt på portion i gram
    Orm, en portion = 20 gram ormpellets, oberoende av vikt
    
    
    */
    
    static List<Pets> petsToFeed = new ArrayList<Pets>();
    
    public static void main(String[] args) 
    { 
        Run();
    }
    
    public static void Run()
    {   
        petsToFeed.add(new Dog("Sixten", 5));
        petsToFeed.add(new Dog("Dogge", 10));
        petsToFeed.add(new Cat("Venus", 5));
        petsToFeed.add(new Cat("Ove", 3));
        petsToFeed.add(new Snake("Hypno", 1));
        
        while (true)
        {           
            String name = JOptionPane.showInputDialog("Vilket djur ska få mat?");

            //kollar så namnet är giltigt, existerar, sedan ny metod
            if (Helper.validName(name))
            {
                if (!petExist(name))
                    JOptionPane.showMessageDialog(null, "Djuret kunde ej hittas, var vänlig och försök igen!");
            }
            else
                JOptionPane.showMessageDialog(null, "Namnet är ogiltigt, var vänlig och försök igen!");
        }
    }
    
    public static boolean petExist(String name)
    {
        for (Pets pet : petsToFeed) 
            if (pet.getName().equalsIgnoreCase(name))
            {
                //polymorfism, samma method men olika output
                pet.printFood();
                return true;
            }
        
        return false;
    }
}
