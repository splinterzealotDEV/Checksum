import javax.swing.*;

public class main {
    public static void main(String[] args) {

        char a='A';
        String cadena1=JOptionPane.showInputDialog("Ingresar primera cadena");
        String cadena2=JOptionPane.showInputDialog("Ingresar segunda cadena");
        System.out.println((int)a);
        Check c=new Check();
        int[] charsA=new int[cadena1.length()];
        int[] charsB=new int[cadena1.length()];
        int checkA=0;
        int checkB=0;
        charsA=c.convertirString(cadena1);
        charsB=c.convertirString(cadena2);
        checkA=c.tomarPosicion(charsA);
        checkB=c.tomarPosicion(charsB);
        c.checking(checkA,checkB);



    }
}
