package conditionalproblems;

public class SwitchProblem {
    public static void main(String[] args) {
        char letter = 'b';
        switch (letter){
            case 'a' :
                System.out.println("letter is Vowel");
                break;
            case 'e' :
                System.out.println("letter is Vowel");
                break;
            case 'i' :
                System.out.println("letter is Vowel");
                break;
            case 'o' :
                System.out.println("letter is Vowel");
                break;
            case 'u' :
                System.out.println("letter is Vowel");
                break;
            default:
                System.out.println("letter is Constant");
                break;
        }

        int num = 7;
        switch (num){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("please enter valid number");
                break;
        }
    }
}
