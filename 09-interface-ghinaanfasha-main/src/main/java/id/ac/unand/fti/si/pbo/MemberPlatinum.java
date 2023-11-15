package id.ac.unand.fti.si.pbo;

public class MemberPlatinum extends Member implements CanGetDiskon, CanRequestDelivery, CanRequestCicilan, CanDeposit{
    Integer saldo = 0;

    @Override
    public Integer hitungTotalBayar (Integer jumlahBelanja){
        if (jumlahBelanja>=500000 && jumlahBelanja<=1000000){
            jumlahBelanja -= (jumlahBelanja*3/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        if(jumlahBelanja>1000000 && jumlahBelanja <=7000000){
            jumlahBelanja -= (jumlahBelanja*5/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        if (jumlahBelanja>7000000 && jumlahBelanja <=10000000){
            jumlahBelanja -= (jumlahBelanja*7/100)+1;
            this.jumlahBelanja = jumlahBelanja;
        }
        else if (jumlahBelanja>10000000){
            jumlahBelanja -= (jumlahBelanja*7/100);
            this.jumlahBelanja = jumlahBelanja;
        }
        this.jumlahBelanja = jumlahBelanja;
        return jumlahBelanja;
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        Double hargaOngkir = 0.0;
        if (jarakTujuan >= 10.0){
            for (Integer i = 10; i < jarakTujuan; i = i + 1){
                hargaOngkir = hargaOngkir + 1000;
            }
        }
        return hargaOngkir;
    } 

    @Override
    public Integer hitungCicilanPerBulan (Integer totalBelanja, Integer jumlahBulan){
        Integer cicilan = 0;
        if(totalBelanja>2500000 && jumlahBulan <=12){
            cicilan = totalBelanja / jumlahBulan;
        }
        return cicilan;
    }

    @Override
    public void deposit (Integer jumlahDeposit){
        saldo = saldo + jumlahDeposit;
    }

    @Override
    public void tarikTunai(Integer jumlahTarikTunai){
        if (saldo > jumlahTarikTunai){
            saldo = saldo - jumlahTarikTunai;
        }
    }

    @Override
    public Integer cekSaldo(){
        return saldo;
    }
}
