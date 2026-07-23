package Work06;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return length*width;
    }
    public int getPerimeter(){
        return (length+width)*2;
    }
    public  static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 5);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
