

public class FoodItem
{
    // instance variables - replace the example below with your own
    private String name;
    private double fat;
    private double carbs;
    private double protein;

    
    public FoodItem(String Bname, double Bfat, double Bcarbs, double Bprotein)
    {
        name = Bname;
        fat = Bfat;
        carbs = Bcarbs;
        protein = Bprotein;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double totalCalories()
    {
        
        return (fat * 9) + (carbs * 4) + (protein * 4);
    }
    public double totalGrams(double Gfat, double Gcarbs, double Gprotein, double totalGrams)
    {
        Gfat = fat;
        Gcarbs = carbs;
        Gprotein = protein;
        totalGrams = Gfat + Gcarbs + Gprotein;
        return totalGrams;
    }
    public double fatCalories()
    {
        return fat * 9 /totalCalories();
    }
    public boolean isHealthy()
    {
        boolean isHealthy;
        if(totalCalories()*0.3> fatCalories())
        {
            isHealthy = true;
        }
        else
        {
            isHealthy = false;
        }
        
        return isHealthy;
        
    }
    public String ToString()
    {
        String healthText;
        if (isHealthy() == true)
        {
            healthText = " acceptable choice, below 30% calories from fat!";
        }
        else
        {
            healthText = " health risk, exceeds 30% calories from fat!";
        }
        return name + ", " + totalCalories() + " calories" + ", " + healthText;
    }
}
