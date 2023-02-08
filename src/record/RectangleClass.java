/**
 * 
 */
package record;

/**
 * @author mjedli
 *
 */
public class RectangleClass {
	
    double l1;
    double l2;
    double area;
    
    public RectangleClass(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
        if(l1 > 0 && l2 > 0) {
            this.area = l1*l2;
        } else {
            this.area = 0;
        }
    }
    
    double getl1() {
        return this.l1;
    }
    
    double getl2() {
        return this.l2;
    }
    
    double getArea() {
        return this.area;
    }
    
}
