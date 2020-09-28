import java.util.ArrayList;
import java.util.List;

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
        //System.out.println(logic.VerifyIfWinterIsComing(14));
        //logic.getNumber(-89,-100);
        //logic.getNumber2(94,100);
        //logic.get2Numbers(5,8);
        //logic.get2NumbersAndVerifyThem(9,8);
        //logic.numerePare();
        //logic.numereIpare();
        //logic.getANumber(99);
        //logic.getANumber2(-97);
        //logic.getTwoNumbers(6,10);
        //logic.getTwoNumbersAndVerifyThem(7,6);
        int [] numere = new int[100];
        //logic.numerePare();
        int [] numere2 = {2,3,4};
        //logic.mediaNumerelor(numere2);

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        //logic.isParameterFromList(myList);
       // System.out.println(myList);

        List<Integer> mySecondList = new ArrayList<>();
        mySecondList.add(3);
        mySecondList.add(6);
        mySecondList.add(7);
        mySecondList.add(9);
       // logic.twoParameters(mySecondList, 10);
        //System.out.println(mySecondList);

        List<Integer> myThirdList = new ArrayList<>();
        myThirdList.add(3);
        myThirdList.add(4);
        myThirdList.add(5);
        myThirdList.add(6);
        myThirdList.add(8);
        myThirdList.add(9);
        //logic.listAndNumber(myThirdList, 1);

       // logic.ReverseList(myThirdList);

        List<String> myStringList = new ArrayList<>();
        myStringList.add("cat");
        myStringList.add("dog");
        myStringList.add("house");
        //System.out.println(myStringList);
        //logic.ReplaceString(myStringList, 2, "Elvis likes sushi");
        //System.out.println(myStringList);

        logic.SetFirstElement(myThirdList, 69);
        System.out.println(logic.SetFirstElement(myThirdList, 69));






















    }




}