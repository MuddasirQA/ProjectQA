package anotherpackage;

public class Calculate {
    int phys;
    int bio;
    int chem;
    int score;
    int total;

    public Calculate(int phys, int bio, int chem) {

        this.phys = phys;
        this.bio = bio;
        this.chem = chem;
        this.total = getTotal();






    }

    public int getScore() {
        score = (total * 100) / 450;

        return score;


    }
    public int getTotal(){
        return phys + chem + bio;
    }

}
