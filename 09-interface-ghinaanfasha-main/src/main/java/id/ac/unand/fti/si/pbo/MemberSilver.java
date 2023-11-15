package id.ac.unand.fti.si.pbo;

public class MemberSilver extends Member implements CanGetDiskon, CanRequestDelivery{

    @Override
    public Integer hitungTotalBayar (Integer jumlahBelanja){
        if (jumlahBelanja>=500000 && jumlahBelanja<=1000000){
            jumlahBelanja -= (jumlahBelanja*1/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        if(jumlahBelanja>1000000 && jumlahBelanja <=7000000){
            jumlahBelanja -= (jumlahBelanja*3/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        else if (jumlahBelanja>7000000){
            jumlahBelanja -= (jumlahBelanja*5/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        this.jumlahBelanja = jumlahBelanja;
        return jumlahBelanja;
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        Double hargaOngkir = 0.0;
        if (jarakTujuan >= 5.0){
            for (Integer i = 5; i < jarakTujuan; i = i + 1){
                hargaOngkir = hargaOngkir + 1500;
            }
        }
        return hargaOngkir;
    }    
}
