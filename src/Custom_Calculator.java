class InvalidInputException extends Exception{
    public String toString(){
        return "Cannot add 8 and 9";
    }
}
class MaxInputException  extends Exception{
    public String toString(){
        return "Input cannot be greater than 100000";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Cannot devide by zero";
    }
}
class MaxMultiplyInputException extends Exception{
    public String toString(){
        return "Input cannot be greater than 7000 while multiplying";
    }
}
class Calci{
    double add(double a,double b) throws InvalidInputException,MaxInputException{
        if (a>100000||b>100000){
            throw  new MaxInputException();
        }
        if (a==8||b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a,double b) throws MaxInputException{
        if (a>100000||b>100000){
            throw  new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a,double b) throws MaxInputException,MaxMultiplyInputException{
        if (a>100000||b>100000){
            throw  new MaxInputException();
        }
        if(a>7000||b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide(double a,double b) throws MaxInputException,CannotDivideByZeroException{
        if (a>100000||b>100000){
            throw  new MaxInputException();
        }
        if(b==0){
            throw  new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class Custom_Calculator {
    public static void main(String[] args) throws MaxInputException,MaxMultiplyInputException,CannotDivideByZeroException,InvalidInputException {
        Calci c = new Calci();
        c.add(8,9);
        c.subtract(74,56);
        c.divide(4,0);
        c.multiply(6,8456);
        c.add(687451235,3);
    }
}
