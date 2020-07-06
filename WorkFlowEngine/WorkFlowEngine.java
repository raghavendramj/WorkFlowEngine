package WorkFlowEngine;

public class WorkFlowEngine {

    public static void main(String args[]){


        Divide division = new Divide(null);
        Multiply multiply = new Multiply(division);
        Subtract subtract = new Subtract(multiply);
        Add addition = new Add(subtract);
        Input input = new Input(addition);
        input.operate(30, 10);
    }
}
