package chapter1;

/**
 * @author aLieb
 * @date 2024年04月15日 15:08
 */
public class Circle extends Shape{
    public String color;
    public int r;
    @Override
    public void draw() {
        System.out.println("draw a circle with r = " + String.valueOf(r));
    }

    @Override
    public void erase() {
        System.out.println("erase a circle with r = " + String.valueOf(r));
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String getColor() {
        System.out.println("color of circle is: " + color);
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        System.out.println("set the color of circle to: " + color);
        super.setColor(color);
    }
}
