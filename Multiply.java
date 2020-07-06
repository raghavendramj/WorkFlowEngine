
package WorkFlowEngine;

public class Multiply extends Operation{

    public Multiply(Operation operation){
        super(operation);
    }

    public boolean doOperate(int a, int b){
        System.out.println(" Multiplication result of  (a * b) => ("+a+" * "+b+") is: "+ (a*b));


        return false;
    }
}
