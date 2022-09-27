class Circle {
    public int radius;
    Circle(){
        System.out.println("I am a Circle  non parameterised constructor");
    }
    Circle(int r){
        System.out.println("I am a Circle parameterised constuctor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
        }
        public class Inheritdemo{
            public static void main(String[] args) {
                Circle cr = new Circle(4);
                Cylinder cy = new Cylinder(12,4);
                System.out.println("Area of Circle is " + cr.area());
                System.out.println("Area of Cylinder is " + cy.area());
                System.out.println("Volume of Cylinder is " + cy.volume());
            }

        }
