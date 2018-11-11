package ba.unsa.etf.rpr.tutorijal05;

import java.util.function.Function;

public class Digitron {

    private double rezultat=0;
    private double operand=0;
    private int fja=0;
    public void setOperand(double x){
        operand=x;
    }
    public double getRez(double x){
        return  rezultat;
    }
    public void plus(double x){
        rezultat+=x;
        operand=x;
        fja=1;
        prvi=true;
    }
    public void minus(double x){
        rezultat-=x;
        operand=x;
        fja=2;
        prvi=true;
    }
    public void product(double x){
        rezultat *= x;
        operand=x;
        fja = 3;
    }
    public void divide(double x){
        if(x!=0) {
            rezultat/=x;
            operand=x;
        }else {
            throw new IllegalArgumentException("Ne moze se dijeliti sa nulom!");
        }
        fja=4;
    }
    public void jednako(){
        switch(fja){
            case 1:
                plus(operand);
                break;
            case 2:
                minus(operand);
                break;
            case 3:
                product(operand);
                break;
            case 4:
                divide(operand);
                break;
        }
    }
}
