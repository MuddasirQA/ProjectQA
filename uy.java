public class uy {

    public static int getSum(int n) {
//
//
//        for(sum = 0; n > 0; sum += n % 10,  n /= 10);
//
//        return sum;

        {
            int sum = 0;

            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }

            return sum;
        }


    }




        public static void main (String[]args){
            System.out.println(getSum(41252345));
        }

    }
