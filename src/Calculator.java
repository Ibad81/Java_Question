public class Calculator {
    int num1,num2;
    static double powerInt(int num1, int num2){
        return Math.pow(num1,num2);

    }
    static double powerdouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}


class quest{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.powerInt(5,2));
        System.out.println(cal.powerdouble(2.4,5));
    }
}