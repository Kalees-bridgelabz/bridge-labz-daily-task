package conditionalproblems;

public class PalindromeNumbers {
    public static void main(String[] args) {
        //using for loop

        int num = 132;
        int original = num;
        int reversed = 0;

        for(;num != 0; num/=10){
            reversed = reversed*10 + num%10;
        }
        System.out.println("reversed " + reversed);
        if(original == reversed)
            System.out.println("number is palindrome");
        else{
            System.out.println("number is not palindrome");
        }
    }
}
