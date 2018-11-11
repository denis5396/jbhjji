package ba.unsa.etf.rpr.tutorijal05;

public class Digitron {
    private double operand1=0;
    private double operand2=0;
  //  private double rezultat=0;
    //private boolean rezultatSet=false;
    private boolean inf=false;
    public void setOperand1(double x){
        operand1=x;
    }
    public void setOperand2(double x){
        operand2=x;
    }
    public double getOperand1(double x){
        return operand1;
    }
    public double getOperand2(double x){
        return operand2;
    }
   /* public double gerRezultat(double x){
        return rezultat;
    }*/
    public void plus(){

        operand1=operand1+operand2;
    }
    public void minus(){

        operand1=operand1-operand2;
    }
    public void product(){
        operand1=operand1*operand2;

    }
    public void divide(){
        if(operand2!=0) {
            operand1 = operand1 / operand2;
        }else inf=true;
    }
}
