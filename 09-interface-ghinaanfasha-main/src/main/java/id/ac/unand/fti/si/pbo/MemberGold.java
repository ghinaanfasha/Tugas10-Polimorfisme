package id.ac.unand.fti.si.pbo;

public class MemberGold extends Member implements CanGetDiskon, CanRequestDelivery, CanRequestCicilan{

    @Override
    public Integer hitungTotalBayar (Integer jumlahBelanja){
        if (jumlahBelanja>=500000 && jumlahBelanja<=1000000){
            jumlahBelanja -= (jumlahBelanja*2/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        if(jumlahBelanja>1000000 && jumlahBelanja <=7000000){
            jumlahBelanja -= (jumlahBelanja*4/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        else if (jumlahBelanja>7000000){
            jumlahBelanja -= (jumlahBelanja*6/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        this.jumlahBelanja = jumlahBelanja;
        return jumlahBelanja;
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        Double hargaOngkir = 0.0;
        if (jarakTujuan >= 7.0){
            for (Integer i = 7; i < jarakTujuan; i = i + 1){
                hargaOngkir = hargaOngkir + 1000;
            }
        }
        return hargaOngkir;
    }

    @Override
    public Integer hitungCicilanPerBulan (Integer totalBelanja, Integer jumlahBulan){
        Integer cicilan = 0;
        if(totalBelanja>5000000 && jumlahBulan <=24){
            cicilan = totalBelanja / jumlahBulan;
        }
        return cicilan;
    }

}
