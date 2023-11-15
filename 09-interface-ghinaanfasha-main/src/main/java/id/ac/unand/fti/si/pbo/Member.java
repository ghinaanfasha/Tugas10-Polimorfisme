package id.ac.unand.fti.si.pbo;

public abstract class Member {
    public Integer poin = 0;
    public Integer jumlahBelanja = 0;
    
    public Integer getPoin(){
        if (this.jumlahBelanja >= 10000){
            Integer x = 0;
            for (Integer i = 10000; i <= this.jumlahBelanja;){
                this.jumlahBelanja = this.jumlahBelanja - 10000;
                x++;
            }
            this.poin = this.poin + x;
        }
        return this.poin;
    }


    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer jumlahBelanja){
        Integer poin = (int) (jumlahBelanja / 10000);
        return poin;
    }
}
