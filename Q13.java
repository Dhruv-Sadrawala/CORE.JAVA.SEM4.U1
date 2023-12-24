import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {

    static void per(int percentage){

        if (percentage>80){
            JOptionPane.showMessageDialog(null,"Your grade is A.","RESULT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (percentage>60 && percentage<80) {
            JOptionPane.showMessageDialog(null,"Your grade is B.","RESULT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (percentage>40 && percentage<60) {
            JOptionPane.showMessageDialog(null,"Your grade is C.","RESULT",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Your grade is FAIL.","RESULT",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        String mk_1;
        mk_1 = JOptionPane.showInputDialog(null, "Enter marks of maths out of 100.", "MATHS MARKS", JOptionPane.QUESTION_MESSAGE);
        int mk_1_int = parseInt(mk_1);

        String mk_2;
        mk_2 = JOptionPane.showInputDialog(null, "Enter marks of english out of 100.", "ENGLISH MARKS", JOptionPane.QUESTION_MESSAGE);
        int mk_2_int = parseInt(mk_2);

        String mk_3;
        mk_3 = JOptionPane.showInputDialog(null, "Enter marks of science out of 100.", "SCIENCE MARKS", JOptionPane.QUESTION_MESSAGE);
        int mk_3_int = parseInt(mk_3);

        int percentage=((mk_1_int+mk_2_int+mk_3_int)*100)/300;

        per(percentage);
    }
}