import javax.swing.*;
import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {

        String num= JOptionPane.showInputDialog(null,"Enter a number.","INPUT",JOptionPane.QUESTION_MESSAGE);
        int num_int=parseInt(num);

        int reversedNum = 0, remainder;

        while (num_int != 0) {
            remainder = num_int % 10;
            reversedNum = reversedNum * 10 + remainder;
            num_int /= 10;
        }

            JOptionPane.showMessageDialog(null,reversedNum+" is reversed number.","RESULT",JOptionPane.INFORMATION_MESSAGE);

    }
}