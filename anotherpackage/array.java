package anotherpackage;

public class array {
    public static void main(String[] args) {
//        int[] newarray = new int [10];
////        newarray[0] = 1;
////        newarray[2];
////    }
////        int newArray[] = {1,2,3,4,5,6,7,8,9,10};
////        for(int i : newArray){
////            System.out.println(i);
////
////
////
////
////        }
////    }
        int[] anotherarray = new int[5];
        for (int i = 0; i < anotherarray.length; i++) {

            anotherarray[i] = i;

            System.out.println(anotherarray[i]);
        }
        for (int i = 0; i < anotherarray.length; i++) {

            anotherarray[i] = i * 10;

            System.out.println(anotherarray[i]);

        }

    }

}