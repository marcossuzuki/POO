import racional.*;

public class Principal {
    public static void main(String args[]) {
        try {
            NumeroRacional a = new NumeroRacional();
            NumeroRacional b = new NumeroRacional(8, 16);
            System.out.println(b.getString());
            System.out.println(a.getString());
            b.soma(a);
            System.out.println(b.getString());
            a.soma(a);   
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }


}