/**
 * Rectangle objects manipulation
 *
 * @author Leo Debonnet & Axel Rood
 */
public class Rectangle {

    /**
     * a rectange is defined by it's height and width
     *
     * @param width  width of the rectangle
     * @param height  height of the rectangle
     */
    private double width;
    private double height;

    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }

    /** calculates this rectangle area
     *
     * @return the area as a double
     */
    public double area(){
        return this.width * this.height;
    }

    /** calculates this rectangle permieter
     *
     * @return the perimeter as a double
     */
    public double perimeter(){
        return this.width*2 + this.height*2;
    }

    /** checks if this rectangle is a square
     *
     * @return a boolean
     */
    public boolean isSquare(){
        if(this.width == this.height) return true;
        else return false;
    }

    /** checks if this object and an other object are equals
     * If the object is not a Rectangle object, false is returned.
     * @param o the object which is compared to the actual Rectangle object
     *
     * @return a boolean
     */
    public boolean equals(Object o){
        if(!(o instanceof Rectangle)) return false;

        Rectangle r = (Rectangle) o;
        return this.perimeter() == r.perimeter() && this.area() == r.area();
    }

    /**
     * get rectangle informations as a string
     *
     * @return description for this lightbulb
     */
    public String toString(){
        return "Height:"+height+" Width:"+width;
    }

    /**
     * returns this rectangle's width
     *
     * @return this rectangle's width
     */
    public double getWidth() {
        return width;
    }

    /**
     * returns this rectangle's height
     *
     * @return this rectangle's height
     */
    public double getHeight() {
        return height;
    }
}
