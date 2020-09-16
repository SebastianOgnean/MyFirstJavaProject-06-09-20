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

    public String VerifyIfWinterIsComing(int number){
        if(number > 8 || number == 6) {
            return "The amount of snow this winter is (cm):" + number;
        }else {
            return "The forecast snow is (cm):" + number;
        }
    }


}

