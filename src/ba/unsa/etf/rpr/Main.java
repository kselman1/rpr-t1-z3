package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) throws Exception {
        Sat s=null;
        try {
             s = new Sat(12, 12, 32);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       s.setSat(15,12,45);
        s.Ispisi();
    }
}
