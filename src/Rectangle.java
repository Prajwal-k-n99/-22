public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 6;
        this.breadth = 5;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
    class Const{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}
