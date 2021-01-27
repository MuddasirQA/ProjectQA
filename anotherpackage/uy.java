package anotherpackage;

public class uy {

    public static int getSum(int n) {
//
//
//        for(sum = 0; n > 0; sum += n % 10,  n /= 10);
//
//        return sum;

        {
            int sum = 0;

            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            return sum;
        }


    }


    public static void main(String[] args) {
        System.out.println(getSum(41252345));

    }

    public void coins(int cost, int amount) {
        int tenNote = 0;
        int fiveNote = 0;
        int twoPound = 0;
        int onePound = 0;
        int fiftyPence = 0;
        int twentyPence = 0;
        int tenPence = 0;
        int fivePence = 0;
        int twoPence = 0;
        int onePence = 0;

        if (amount > cost) {
            int change = (amount * 100) - (cost * 100);
            int initChange = (amount * 100) - (cost * 100);
            while (change != 0) {
                if (change >= 1000) {
                    tenNote++;
                    change -= 1000;
                } else if (change >= 500 && change < 1000) {
                    fiveNote++;
                    change -= 500;
                } else if (change >= 200 && change < 500) {
                    twoPound++;
                    change -= 200;
                } else if (change >= 100 && change < 200) {
                    onePound++;
                    change -= 100;
                } else if (change >= 50 && change < 100) {
                    fiftyPence++;
                    change -= 50;
                } else if (change >= 20 && change < 50) {
                    twentyPence++;
                    change -= 20;
                } else if (change >= 10 && change < 20) {
                    tenPence++;
                    change -= 10;
                } else if (change >= 5 && change < 10) {
                    fivePence++;
                    change -= 5;
                } else if (change >= 2 && change < 5) {
                    twoPence++;
                    change -= 2;
                } else if (change == 1) {
                    onePence++;
                    change -= 1;
                }
                System.out.println(change);
            }
        }
    }
}
