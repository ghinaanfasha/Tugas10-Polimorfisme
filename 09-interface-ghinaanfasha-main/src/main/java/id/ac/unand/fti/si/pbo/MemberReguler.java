package id.ac.unand.fti.si.pbo;

public class MemberReguler extends Member implements CanGetDiskon{

    @Override
    public Integer hitungTotalBayar (Integer jumlahBelanja){
        if (jumlahBelanja>=500000 && jumlahBelanja<=1000000){
            jumlahBelanja -= (jumlahBelanja*1/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        if(jumlahBelanja>1000000 && jumlahBelanja <=7000000){
            jumlahBelanja -= (jumlahBelanja*2/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        else if (jumlahBelanja>7000000){
            jumlahBelanja -= (jumlahBelanja*3/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        this.jumlahBelanja = jumlahBelanja;
        return jumlahBelanja;
    }
}
