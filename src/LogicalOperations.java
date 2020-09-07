public class LogicalOperations {
    public String checkTextAndNumber (String input, int number){
        if (input.equals("FastTrack") && number <=3) {
            return (input + number);
        }else if (!input.equals("FastTrack") && number >=4){
            return (number + input);
        }
        return "";
    }

    public int GivenaNumber (int x){
        if (x>=2 && x>=8) {
            return x;
        }
        return 0;
    }
    }
