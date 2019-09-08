/*MD SIFAT HOSSAIN 153402342
 */
package Exam1;


public class Isosceles {
    double side;
    double base;
    
    double calArea()
    {
        return (base/4)*Math.sqrt(4*(side*side-base*base));
    }
    
}
