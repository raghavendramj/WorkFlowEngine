package WorkFlowEngine;

public class Divide extends Operation{

    public Divide(Operation operation){
        super(operation);
    }

    public boolean doOperate(int a, int b){
        System.out.println(" Division result of  (a / b) => ("+a+" / "+b+") is: "+ (a/b));


        return false;
    }
}
