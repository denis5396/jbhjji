package ba.unsa.etf.rpr.tutorijal05;


import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textBox;
    double input=0;
    double a=0;
    double b=0;
    boolean isA=false;
    boolean isB=false;
    int izbor=0;
    double rez=0;
    double lastNum=0;
    double proiz=1;
    boolean kucano=false;

    boolean prvi=false;

    public void nineClick(ActionEvent actionEvent) {
        input=10*input+9;
        postavi(input);
        textBox.setText(input+"");
    }
    public void eightClick(ActionEvent actionEvent) {
        input=10*input+8;
        postavi(input);
        textBox.setText(input+"");
    }
    public void sevenClick(ActionEvent actionEvent) {
        input=10*input+7;
        postavi(input);
        textBox.setText(input+"");
    }
    public void sixClick(ActionEvent actionEvent) {
        input=10*input+6;
        postavi(input);
        textBox.setText(input+"");
    }
    public void fiveClick(ActionEvent actionEvent) {
        input=10*input+5;
        postavi(input);
        textBox.setText(input+"");
    }
    public void fourClick(ActionEvent actionEvent) {
        input=10*input+4;
        postavi(input);
        textBox.setText(input+"");
    }
    public void threeClick(ActionEvent actionEvent) {
        input=10*input+3;
        postavi(input);
        textBox.setText(input+"");
    }
    public void twoClick(ActionEvent actionEvent) {
        input=10*input+2;
        postavi(input);
        textBox.setText(input+"");
    }
    public void oneClick(ActionEvent actionEvent) {
        input=10*input+1;
        postavi(input);
        textBox.setText(input+"");
    }
    public void zeroClick(ActionEvent actionEvent) {
        input=10*input+0;
        postavi(input);
        textBox.setText(input+"");
    }
    private void postavi(double input){
        kucano=true;
        prvi=true;
        lastNum=input;
    }

    public void procClick(ActionEvent actionEvent) {

        }
    public void minusClick(ActionEvent actionEvent) {
        if(kucano){
            if(prvi && !isA){rez=input; isA=true; izbor=2; textBox.setText(rez+""); input=0; return;}
            rez-=input;
            textBox.setText(rez+"");
        }
        kucano=false;
        input=0;
        izbor=2;
    }
    public void plusClick(ActionEvent actionEvent) {
        if(kucano){
            if(prvi && !isA){rez=input; isA=true; izbor=1; textBox.setText(rez+""); input=0; return;}
            rez+=input;
            textBox.setText(rez+"");
        }
        kucano=false;
        input=0;
        izbor=1;
    }
    public void productClick(ActionEvent actionEvent) {
        if(kucano){
            if(prvi && !isA){rez=input; isA=true; izbor=3;textBox.setText(rez+""); input=0; return;}
            rez*=input;
            textBox.setText(rez+"");
        }
        kucano=false;
        input=0;
        izbor=3;
    }
    public void divideClick(ActionEvent actionEvent) {

    }
    public void equalsClick(ActionEvent actionEvent) {
        System.out.println(izbor+"=");
        switch(izbor){
            case 1:
                plus();
                break;
            case 3:
                product();
                break;

        }
    }
    public void product(){
        rez*=lastNum;
        textBox.setText(rez+"");
        input=0;
        kucano=false;
        prvi=false;
        isA=false;
    }
    public void plus(){
        rez+=lastNum;
        textBox.setText(rez+"");
        input=0;
        kucano=false;
        prvi=false;
        isA=false;
    }
    public void minus(){
        rez-=lastNum;
        textBox.setText(rez+"");
        input=0;
        kucano=false;
        prvi=false;
        isA=false;
    }

}
