import javax.swing.*;

import static java.lang.Integer.parseInt;

class conso {

    conso(int num_int){
        if (num_int%2==0){
            JOptionPane.showMessageDialog(null,num_int+" is a even number");
        }
        else JOptionPane.showMessageDialog(null,num_int+" is a odd number");
    }
    public static void main(String[] args) {
        String num;
        num= JOptionPane.showInputDialog(null,"Enter a number","NUMBER INPUT",JOptionPane.QUESTION_MESSAGE);
        int num_int=parseInt(num);

        new conso(num_int);
    }
}