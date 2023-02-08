/**
 * 
 */
package record;

/**
 * @author mjedli
 *
 */
public record Rectangle(double l1, double l2) {
    
    static double area;
    
    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
        if(l1 > 0 && l2 > 0) {
            area = l1*l2;
        } else {
            area = 0;
        }
    }
    
    double getl1() {
        return this.l1;
    }
    
    double getl2() {
        return this.l2;
    }
    
    double getArea() {
        return area;
    }
}
