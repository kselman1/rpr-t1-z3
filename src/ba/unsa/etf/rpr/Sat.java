package ba.unsa.etf.rpr;

public class Sat {
    int sati,minute,sekunde;

    Sat(int h,int m,int s) throws Exception {
        setSat(h,m,s);

    }

    public void setSat(int sati, int minute, int sekunde) throws Exception {
        if (sati < 0 || sati > 24)
            throw new Exception("Neispravan broj sati!");

        else this.sati = sati;
        if(minute<0 || minute>59)
            throw new Exception("Neispravan broj minuta!");
        else
            this.minute = minute;
        if(sekunde<0 || sekunde>59)
            throw new Exception("Neispravan broj sekundi!");
        else
            this.sekunde = sekunde;
    }
    public void Sljedeci(){

        sekunde=sekunde+1;
        if(sekunde==60){
            sekunde=0;
            minute=minute+1;
        }
        if(minute==60){
            minute=0;
            sati=sati+1;
        }
        if(sati==24)
            sati=0;
    }
    public void Prethodni(){

        sekunde=sekunde-1;
        if (sekunde==-1) {
            sekunde=59;
            minute=minute-1;
        }
        if (minute==-1) {
            minute=59;
            sati=sati-1;
        }
        if (sati==-1)
            sati=23;

    }
    public void PomjeriZa(int pomak) {
        int i=0;
        if (pomak>0) {
            for (i=0; i < pomak ; i++)
            Sljedeci();
        }
		else {
            for (i =0; i < -pomak ;i++)
            Prethodni();
        }
    }
    public int getSati() {
        return sati;
    }
    public int getSekunde() {
        return sekunde;
    }

    public int getMinute() {
        return minute;
    }
    public void Ispisi(){
        System.out.println(sati+ ":" +minute+":" +sekunde);
    }

}
