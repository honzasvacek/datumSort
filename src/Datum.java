public class Datum implements Comparable<Datum>{
    int den;
    int mesic;
    int rok;

    public Datum(int den, int mesic, int rok) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return den + " " + mesic + " " + rok;
    }

    @Override
    public int compareTo(Datum o) {
        if(rok > o.rok){
            return 1;
        }
        if(rok < o.rok){
            return -1;
        }

        /* urcite rok == o.rok*/

        if(mesic > o.mesic){
            return 1;
        }
        if(mesic < o.mesic){
            return -1;
        }

        /* urcite se rovna rok a mesic o.rok a o.mesic */

        if(den > o.den){
            return 1;
        }
        if(den < o.den){
            return -1;
        }
        else return 0;
    }
}

