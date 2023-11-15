package id.ac.unand.fti.si.pbo;

public interface CanDeposit{
    public void deposit(Integer jumlahDeposit);
    public void tarikTunai(Integer jumlahTarikTunai);
    public Integer cekSaldo();
}