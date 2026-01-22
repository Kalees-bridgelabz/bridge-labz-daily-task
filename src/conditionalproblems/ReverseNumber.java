package conditionalproblems;

public class ReverseNumber {
    public static void main(String[] args) {
        //reverse a number using while loop

        int num = 231;
        int reverse = 0;

        while(num != 0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }

        System.out.println("reverse using while " + reverse);


        //using for loop

        int forNum = 231;
        int reversed = 0;
        for(;forNum !=0;forNum/=10){
            reversed = reversed*10 +forNum%10;
        }
        System.out.println("revers using for " + reversed);
    }
}
