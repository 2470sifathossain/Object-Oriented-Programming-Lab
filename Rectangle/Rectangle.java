/*MD SIFAT HOSSAIN 153402342
 */
package Rectangle;


public class Rectangle {
    
    double length;
    double width;
    
    double calArea()
    {
    return length*width;
    }
    
    double calPerimeter()
    {
        return 2*(length+width);
    }
    
    double calDiagonal()
    {
        return Math.sqrt(width*width+length*length);
    }
         
}