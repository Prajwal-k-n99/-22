import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "Age cannot be greater than 125";
    }
    public String getMessage(){
        return "Make sure that the value of age entered is correct ";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try {
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

    }
}
