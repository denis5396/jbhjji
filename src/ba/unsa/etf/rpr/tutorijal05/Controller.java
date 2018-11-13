package ba.unsa.etf.rpr.tutorijal05;


import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label display;
    double input=0;
    int izbor=0;
    double rez=0;
    double lastNum=0;
    boolean kucano=false;
    double epsilon=0.001;
    int brojOperacije=0;
    int brdecimala=0;
    private SimpleStringProperty disp;

    public Controller() {
        disp = new SimpleStringProperty("0");
    }

    private String dajRez(){
        if(Math.abs(rez-(int)rez)<epsilon){return ""+(int)rez;}
        return rez+"";
    }
    private String dajInput(){
        if(Math.abs(input-(int)input)<epsilon){return ""+(int)input;}
        return input+"";
    }
    public void nineClick(ActionEvent actionEvent) {
        postavi(9);
    }
    public void eightClick(ActionEvent actionEvent) {
        postavi(8);
    }
    public void sevenClick(ActionEvent actionEvent) {
        postavi(7);
    }
    public void sixClick(ActionEvent actionEvent) {
        postavi(6);
    }
    public void fiveClick(ActionEvent actionEvent) {
        postavi(5);
    }
    public void fourClick(ActionEvent actionEvent) {
        postavi(4);
    }
    public void threeClick(ActionEvent actionEvent) {
        postavi(3);
    }
    public void twoClick(ActionEvent actionEvent) {
        postavi(2);
    }
    public void oneClick(ActionEvent actionEvent) {
        postavi(1);
    }
    public void zeroClick(ActionEvent actionEvent) {
        postavi(0);
    }
    public void dotClick(ActionEvent actionEvent){
        if(brdecimala==0)brdecimala=1;
    }
    private void postavi(int br){
        if(brdecimala==0){
            input=10*input +br;
        }else{
            input+=(double)br/Math.pow(10,brdecimala);
            brdecimala++;
        }
        display.setText(dajInput());
        kucano=true;
        lastNum=input;
    }

    public void procClick(ActionEvent actionEvent) {

    }
    public void minusClick(ActionEvent actionEvent) {
        if(kucano){
            brdecimala=0;
            brojOperacije++;
            if(brojOperacije==2){
                equals(izbor);
                brojOperacije=1;
            }
            else if(brojOperacije==1){
                rez=input;
                display.setText(dajRez());
            }
            input=0;
        }
        izbor=2;
    }
    public void plusClick(ActionEvent actionEvent) {
        if(kucano){
            brdecimala=0;
            brojOperacije++;
            if(brojOperacije==2){
                equals(izbor);
                brojOperacije=1;
            }
            else if(brojOperacije==1){
                rez=input;
                display.setText(dajRez());
            }
            input=0;
        }
        izbor=1;
    }
    public void productClick(ActionEvent actionEvent) {
        if(kucano){
            brdecimala=0;
            brojOperacije++;
            if(brojOperacije==2){
                equals(izbor);
                brojOperacije=1;
            }
            else if(brojOperacije==1){
                rez=input;
                display.setText(dajRez());
            }
            input=0;
        }
        izbor=3;
    }
    public void divideClick(ActionEvent actionEvent) {
        if(kucano){
            brdecimala=0;
            brojOperacije++;
            if(brojOperacije==2){
                equals(izbor);
                brojOperacije=1;
            }
            else if(brojOperacije==1){
                rez=input;
                display.setText(dajRez());
            }
            input=0;
        }
        izbor=4;

    }
    public void equalsClick(ActionEvent actionEvent) {
        brdecimala=0;
        switch(izbor){
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                product();
                break;
            case 4:
                divide();
                break;

        }
        brojOperacije=0;
    }

    public void product(){
        rez*=lastNum;
        display.setText(dajRez());
        input=0;
        kucano=false;
    }
    public void plus(){
        rez+=lastNum;
        display.setText(dajRez());
        input=0;
        kucano=false;
    }
    public void minus(){
        rez-=lastNum;
        display.setText(dajRez());
        input=0;
        kucano=false;
    }
    public void divide(){
        if(lastNum!=0) {
            rez /= lastNum;
            display.setText(rez + "");

        }else display.setText("Error!");
        input = 0;
        kucano = false;
    }
    public void equals(int izbor){
        switch(izbor){
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                product();
                break;
            case 4:
                divide();
                break;

        }
    }

}
