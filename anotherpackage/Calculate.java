package anotherpackage;

public class Calculate {
    int phys;
    int bio;
    int chem;
    int score;
    int total;

    public static void main(String[] args) {


    }


    public static int sumDigits(int num) {

        int sum;

        /* Single line that calculates sum */
        for (sum = 0; num > 0; sum += num % 10,
                num /= 10)
            ;

        return sum;


    }


    public Calculate(int phys, int bio, int chem) {

        this.phys = phys;
        this.bio = bio;
        this.chem = chem;
        this.total = getTotal();
        this.score = getScore();

        if (this.score < 60) {
            System.out.println("one or more of your grades was was too low which means overall you have failed");
        }


    }

    public int getScore() {
        score = (total * 100) / 450;

        return score;


    }

    public int getTotal() {
        return phys + chem + bio;
    }

}
