import java.util.ArrayList;
import java.util.List;

public class LogicalOperations {

    public String checkTextAndNumber(String input, int number) {
        if (input.equals("FastTrack") && number <= 3) {
            return (input + number);
        } else if (!input.equals("FastTrack") && number >= 4) {
            return (number + input);
        }
        return "";
    }

    public int GivenaNumber(int x) {
        if (x >= 2 && x >= 8) {
            return x;
        }
        return 0;
    }

    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {

            return firstNumber;

        } else {

            return secondNumber;
        }
    }

    public String verifyText(String textInput) {
        if (textInput.equals("FastTrackIT")) {
            return "Learning text comparison.";
        } else {
            return "Got to try some more.";
        }
    }

    public String VerifyTextAndNumber(String input, int number) {
        if (input.equals("FastTrackIT") && number <= 3) {
            return (input + number);
        } else if (!input.equals("FastTrackIT") && number >= 4) {
            return (number + input);
        }
        return "something";
    }

    public String VerifyIfWinterIsComing(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter is (cm):" + number;
        } else {
            return "The forecast snow is (cm):" + number;
        }
    }

    public void getNumber(int startNumber, int endNumber) {
        for (int i = startNumber; i >= endNumber; i--) {
            System.out.println(i);
        }
    }

    public void getNumber2(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
    }

    public void get2Numbers(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    public void get2NumbersAndVerifyThem(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber)
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }

        else if (secondNumber > firstNumber)
            for (int y = firstNumber; y <= secondNumber; y++) {
                System.out.println(y);
            }

    }

    public void numerePare() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public void numereIpare() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }

    public void getANumber(int startNumber) {
        int i = startNumber;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public void getANumber2(int startNumber) {
        int i = startNumber;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    public void getTwoNumbers(int firstNumber, int secondNumber) {
        int i = firstNumber, secondNUmber;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void getTwoNumbersAndVerifyThem(int firstNumber, int secondNumber) {
        int x = firstNumber;
        int y = secondNumber;
        while (x > y) {
            System.out.println(x);
            x++;
        }

        while (y > x) {
            System.out.println(y);
            y++;
        }
    }

    public int[] getArrayToNumber(int maxValue) {
        int[] myArray = new int[maxValue];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
//            System.out.println(myArray[i]);
        }
        return myArray;
    }

    public void printArray(int[] myArray) {
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    public int[] numerePare(int[] numere) {
        int k = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                numere[k] = i;
                k++;
            }
        }
        return (numere);
    }

    public float mediaNumerelor(int [] numere2){
        int suma = 0;
        for (int i = 0; i < numere2.length; i++)
        {
          suma += numere2[1];
        }
        float media = suma / numere2.length;
        return media;
    }

    public void isParameterFromList(List<Integer> myList){
        for(int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
    }

    public void twoParameters(List<Integer> mySecondList, int numar){
        mySecondList.add(numar);
    }

    public void listAndNumber (List<Integer> myThirdList, int numar) {
        int i=0;
        int lungime = myThirdList.size();
        for(i = numar; i < myThirdList.size(); i++)
        {
            System.out.println(myThirdList.get(i));
        }

    }

    public void ReverseList (List<Integer> myList) {
        int lungime = myList.size();
        for(int i = myList.size() - 1; i >= 0; i--)
        {
            System.out.println(myList.get(i));
        }

    }

    public void ReplaceString (List<String> myList, int position, String text) {
        myList.set(position, text);
    }

    public List<Integer> SetFirstElement (List<Integer> myList, int number) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(number);
        for(int i = 0; i < myList.size(); i++){
            resultList.add(myList.get(i));
        }
        return  resultList;
    }








}

