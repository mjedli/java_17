package record;

public class Main {

    public static void main (String[] args) {
    
        Rectangle r1 = new Rectangle(10,5);
        double result = r1.getArea(); // 50.0
        System.out.println(result);
        
        Rectangle r2 = new Rectangle(-5.9,9);
        double result1 = r2.getArea(); // 0.0
        System.out.println(result1);

    }

}