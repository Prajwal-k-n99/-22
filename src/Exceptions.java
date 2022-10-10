import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1] = 54;
        marks[2] =35;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide with the value");
        int number = sc.nextInt();
        try {
            System.out.println("THe value at array index entered is : " + marks[ind]);
            System.out.println("The value of array.value number is :" + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arthmetic Exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBounds Exception occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception occured");
            System.out.println(e);
        }
    }
}
