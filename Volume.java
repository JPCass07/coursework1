public class Volume{

    public double sphere(double d)
    {
  
        double r = d / 2;
        return (4.0/3.0) * Maths.pi() * Maths.pow(r, 3);
    }

    public static void main(String[] args) {

        double diameter = 20.24;
        double volume = sphere(diameter);
        System.out.println("Volume of sphere with diameter " + diameter + " is: " + volume);
    }

}