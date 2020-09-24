public class Lab5 {

    public static void main(String[] args) {
        int[] myArray = new int[100];
        myArray[0] = 1;
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
           // System.out.println(myArray[i]);
        }


        LogicalOperations logic = new LogicalOperations();
        int[] secondArray = logic.getArrayToNumber(7);
        //logic.printArray(secondArray);




    }

}
