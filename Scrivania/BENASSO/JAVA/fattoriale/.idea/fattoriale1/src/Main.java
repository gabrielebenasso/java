

public class Main {

    public static int fattoriale (int n){
        if(n==0){
            return 1;
        }else{
            return fattoriale(n-1)*n;
        }

    }
    public static int fibonacci(int num){
        if(num == 0 | num == 1)
            return 1;
        else
            return  fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void reverse(String parola, int i) {
//        System.out.println(parola.charAt(i));
        if (i == 0) {
            System.out.println(parola.charAt(i));
        } else {
            System.out.println(parola.charAt(i));
            reverse(parola, i - 1);
        }
    }
    //        System.out.println(parola.charAt(i));
//        if(i !=0)
//            reverse(parola, i-1);
//    }
    public static void main(String[] args){
        System.out.println(fattoriale(5));
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(6));
        String s = "Ciao";

        reverse(s,0);

    }
}
