import javax.swing.*;
import java.util.*;

import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {
        String year;
        boolean leap;
        year= JOptionPane.showInputDialog(null,"Enter Year","YEAR INPUT",JOptionPane.QUESTION_MESSAGE);
        System.out.println(year);
        int year_int=parseInt(year);

        if (year_int%4==0){
            if (year_int%100==0){
                if (year_int%400==0){
                    leap=true;
                }
                else leap=false;
            }
            else leap=true;
        }
        else leap=false;

        if (leap){
            System.out.println(year_int+" is a leap year");
        }
        else System.out.println(year_int+" is not a leap year");

    }
}