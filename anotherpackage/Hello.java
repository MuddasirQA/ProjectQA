package anotherpackage;

public class Hello {

    public static int task1(int a, int b, boolean x) {
        if (x) {
            return a + b;

        }

        return a * b;
    }


    public static void input(int a) {
        if (a > 2000) {
            System.out.println("A");
            if (a > 6000) {
                System.out.println("C");
            } else {
                System.out.println("B");
                if (a > 4000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }


        } else if (a < 2000) {
            System.out.println(("1"));
            if (a > 100) {
                System.out.println("3");
                if (a > 600) {
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if (a > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }

    public static int BlackJack(int a, int b) {
        if (a > 21 && b > 21 || a < 0 || b < 0) {

            return 0;

        } else if (a > 21) {
            return b;
        } else {
            return a;
        }

    }

    public static int uniqueSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (b == c) {
            return a + b;
        } else if (a == b) {
            return a + c;
        } else {
            return a + b + c;
        }
    }



    public static void main(String[] args) {




        Tax newsalary = new Tax();

        System.out.println(newsalary.taxcalculate(100000));


        System.out.println(BlackJack(21, 21));

        // Flowchart for control-flow statements

        input(6001);

        Calculate paul = new Calculate(60, 20, 30);


        System.out.println(paul.getTotal());
        System.out.println(paul.getScore());


        // Results.displayPercentage(Results.displayResults(40, 100, 150));
        //   Results.displayPercentage(290);


    }

    }
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static double divide(double a, double b) {
//        return a / b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static class Results {
//
//
//        int phys;
//        int chem;
//        int bio;
//        int total;
//        int percentage;
//
//        public static int displayResults(int chem, int bio, int phys) {
//            int total = chem + bio + phys;
//            System.out.println("This person scored " + chem + " In Chemistry, " + bio + " In Bio, and " + phys + " in physics");
//            System.out.println("Total result: " + total);
//
//
//            return total;
//        }
//
//        public static int displayPercentage(int score) {
//
//            return score * 100 / 450;
//
//        }






