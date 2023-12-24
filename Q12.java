import javax.swing.*;

import static java.lang.Integer.parseInt;

class smallest {

    static void comp(int num_1_int,int num_2_int,int num_3_int){

        if (num_1_int > num_2_int && num_1_int > num_3_int) {
            JOptionPane.showMessageDialog(null, num_1_int + " is greater among three numbers.", "ANSWER", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (num_2_int > num_1_int && num_2_int > num_3_int) {
            JOptionPane.showMessageDialog(null, num_2_int + " is greater among three numbers.", "ANSWER", JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, num_3_int + " is greater among three numbers.", "ANSWER", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        String num_1;
        num_1 = JOptionPane.showInputDialog(null, "Enter first number.", "FIRST NUMBER", JOptionPane.QUESTION_MESSAGE);
        int num_1_int = parseInt(num_1);

        String num_2;
        num_2 = JOptionPane.showInputDialog(null, "Enter second number.", "SECOND NUMBER", JOptionPane.QUESTION_MESSAGE);
        int num_2_int = parseInt(num_2);

        String num_3;
        num_3 = JOptionPane.showInputDialog(null, "Enter third number.", "THIRD NUMBER", JOptionPane.QUESTION_MESSAGE);
        int num_3_int = parseInt(num_3);

        comp(num_1_int,num_2_int,num_3_int);

    }
}