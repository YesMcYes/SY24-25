
public class Atom
{
   int neutron;
   int proton;
   int electron;
   String name;
   
   public Atom(int mew, int pro, int ele, String nam)
   {
       neutron = mew;
       proton = pro;
       electron = ele;
       name = nam;
       
    }
    public String toString()
    {
        return name;
    }
    public static void main(String args[])
    {
     Atom hydrogen = new Atom(0,1,1,"hydrogen"); 
     Atom oxygen = new Atom(1,1,1, "oxygen");
     System.out.println(hydrogen);
     System.out.println(oxygen);
    }
}
