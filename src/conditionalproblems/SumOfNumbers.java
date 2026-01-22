package conditionalproblems;

public class SumOfNumbers {

    public static void main(String[] args) {
        // using while loop

        int num = 5;
        int result = 0;
        while(num != 0){
            result += num;
            num--;
        }

        System.out.println("result during while " + result);

        //using for loop
        int forResult = 0;
        int forNum = 5;

        for (int i = 1; i <= forNum; i++) {
            forResult += i;
        }

        System.out.println("result during for " + forResult);
    }
}
