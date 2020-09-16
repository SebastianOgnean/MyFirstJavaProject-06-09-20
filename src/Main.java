public class Main {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        //System.out.println(math.adunare(12,6));
        //System.out.println(math.scadere(152,68));
        //System.out.println(math.inmultire(25,46));
        //System.out.println(math.impartire(99, 12));
        LogicalOperations logic = new LogicalOperations();
        int biggest = logic.checkBiggerNumber(341,5463);
        //System.out.println("The bigger number is: " +biggest);
        //System.out.println(logic.verifyText("FastTrackIT"));
        //System.out.println(logic.VerifyTextAndNumber("FastTrackIT",2));
        System.out.println(logic.VerifyIfWinterIsComing(14));
    }

}