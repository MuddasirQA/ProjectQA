package anotherpackage;

public class whiletasks {
    public static void main(String[] args) {
        System.out.println(transform("yes"));
        System.out.println(evenlySpaced(4,6,2));
        System.out.println(endsJava("youuuuujava"));

    }
    public static String transform(CharSequence input) {
        StringBuilder add = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            add.append(ch);
           add.append(ch);
           add.append(ch);

        }
        return add.toString();
    }
    public static boolean evenlySpaced(int a, int b, int c) {
       if(Math.abs(a-b) == Math.abs(b-c)){
           return true;
       }
       return false;



// b-a == c-a
    }
    public static boolean endsJava(String output){
        return output.endsWith("java");
    }
    public static String fizzBuzz(int number){
        if((number % 3 == 0) && (number % 5 == 0)){
            return "fizzbuzz";
        }
        else if(number % 3 == 0){
            return "fizz";

        }
        else if(number % 5 == 0){
            return "buzz";
        }
        return null;
    }

}


//        int a = 100;
//        while(a<200){
//            System.out.println("A");
//            a++;
//            if(a>200){
//                break;
// }


//        for(int b =100; b<=200; b++){
//            if(b%2==0){
//                System.out.println("-");
//            }
//            else{
//                System.out.println("*");
//            }
//
//        }
//
//        int b = 100;
//        while (b <= 200){
//            if(b%2==0){
//                System.out.println("-");
//            }
//            else{
//                System.out.println("*");
//            }
//            b++;
//
//        }
        //  print each thing i amount of times
//        for(int i = 1; i<=10; i++){
//            for(int j=0; j<i; j++){
//                System.out.println(i);
////

        // print each thing 10 times
//                for(int i=1; i<=10; i++){
//                    for(int j=1; j<=10; j++){
//                        System.out.println(i);
//                    }
//                }
