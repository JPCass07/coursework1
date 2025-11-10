public class Volume{


    // Method to calculate the volume of a sphere given its diameter
    public static double sphere(double d) {
        double r = d / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) {
        double diameter = 20.24;
        double volume = sphere(diameter);
        System.out.println("Volume of sphere with diameter " + diameter + " is: " + volume);
    }
}


