package amaya.task1;

public class Cjmath {

    public double sqrt(double s) {
        double b=s;
        int i=0;
        while ((b*b>s)&&(i<200)){
            b=(b+s/b)/2;
            i++;
        }
        return b;
    }
}
