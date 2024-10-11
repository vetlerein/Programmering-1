public class Spiller {
    private int sumPoeng;
    public Spiller(int sumPoeng){              // konstruktør
        this.sumPoeng = sumPoeng;
    }

    public int getSumPoeng() {                  //getter
        return sumPoeng;
    }

    public void setSumPoeng(int newPoeng) {         //setter
        if (newPoeng == 1) {
            this.sumPoeng = 0;
        } else {
            this.sumPoeng = this.sumPoeng + newPoeng;
        }
    }

    public int kastTerning(){                   //kast terning metode
        java.util.Random terning = new java.util.Random();      
        int terningkast = terning.nextInt(6) + 1;
        return terningkast;
    }
}