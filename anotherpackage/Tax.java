package anotherpackage;

public class Tax {

    public double taxcalculate(double salary){
        if(salary <15000){
            return salary;
        }
        else if(salary>=1500 && salary <30000){
            return salary * 0.9;
        }
        else if(salary <30000 && salary>= 20000){
            return salary * 0.85;
        }
        else if(salary <45000 && salary>= 30000){
            return salary * 0.8;
        }
        return salary * 0.75;
    }

}
