import javax.swing.*;

public class Check {
    public Check()
    {

    }
    public int[] convertirString(String cadena)
    {
        int[] arreglo=new int[cadena.length()] ;
        for(int i=0;i<cadena.length();i++){
            arreglo[i]=(int)cadena.charAt(i);
        }
        return arreglo;
    }
    public int tomarPosicion(int[] bytes)
    {
        int suma=0;
        int[] result=new int[bytes.length];
        for(int i=0;i<bytes.length;i++){
            suma+=(bytes[i]*i);
        }

        return suma;
    }
    public void checking(int a, int b)
    {
        if(a==b)
        {
            JOptionPane.showMessageDialog(null,"El paquete esta completo","Paquete recibido exitosamente",JOptionPane.ERROR_MESSAGE);
            System.out.println("package status: correct");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error el paquete esta corrupto, se requiere un reenvio","Paquete corrupto",JOptionPane.ERROR_MESSAGE);

            System.out.println("package status: corrupt, resend is required");
        }
    }
}
