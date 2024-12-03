class Calculator{

    public int add(int x1,int x2){
        return x1+x2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public double add(double d1, double d2){
        return d1+d2;
    }


}

public class methodOverloading {
    /*Method overloading, also known as function overloading, 
    /is a programming technique that allows multiple methods with the same name to exist in a class, 
    but with different parameters or signatures*/
    
    
    public static void main(String[] args){
        Calculator calculatorObj = new Calculator();

        System.out.println(calculatorObj.add(6.9,6.9));
        System.out.println(calculatorObj.add(10,10));
        System.out.println(calculatorObj.add(1,2,3));

    }
}
