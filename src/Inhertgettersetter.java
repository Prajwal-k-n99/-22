class Rectangle1{
    public   int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    Rectangle1(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double Area(){
        return length*breadth;
    }
}
 class Cuboid extends Rectangle1{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    Cuboid(int length,int breadth,int height){
        super(length, breadth);
        this.height=height;
    }
    public double volume(){
        return length*breadth*height;
    }
}
public class Inhertgettersetter {
    public static void main(String[] args) {
        Rectangle1 rc = new Rectangle1(3,4);
        Cuboid cu = new Cuboid(3,4,5);
        System.out.println(rc.getLength());
        System.out.println(rc.getBreadth());
        System.out.println(cu.getHeight());
        System.out.println(rc.Area());
        System.out.println(cu.volume());
    }
}
