package conditionalproblems;

public class OperatorPrograms{


    public static void main(String[] args) {

        int a = 7;int b = 11;int c = 97;

        int result1 = a+b*c;
        int result2 = c+a/b;
        int result3 =  a%b+c;
        int result4 = a*b+c;

        int max = result1;
        int min = result1;

        if(result2>max) max = result2;
        if(result3>max) max = result3;
        if(result4>max) max = result4;

        if(result2<min) min = result2;
        if(result3<min) min = result3;
        if(result4<min) min = result4;




        System.out.println("result1 " + result1);
        System.out.println("result2 " + result2);
        System.out.println("result3 " + result3);
        System.out.println("result4 " + result4);

        System.out.println("max value " + max);
        System.out.println("min value " + min);
    }


}
