package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        //Objek Polimorfisme
        MemberReguler a = new MemberReguler();
        MemberSilver b = new MemberSilver();
        MemberGold c = new MemberGold();
        MemberPlatinum d = new MemberPlatinum();

        //MemberReguler
        System.out.println("\nMember Reguler");
        System.out.println("Total bayar \t: " + a.hitungTotalBayar(7500000));
        
        //MemberSilver
        System.out.println("\nMember Silver");
        System.out.println("Total bayar \t: " + b.hitungTotalBayar(7500000));
        System.out.println("Total ongkir \t: " + b.hitungOngkir(20.0));
    
        //MemberGold
        System.out.println("\nMember Gold");
        System.out.println("Total bayar \t: " + c.hitungTotalBayar(7500000));
        System.out.println("Total ongkir \t: " + c.hitungOngkir(20.0));
        System.out.println("Total cicilan \t: " + c.hitungCicilanPerBulan(7500000, 12));

        //MemberPlatinum
        System.out.println("\nMember Platinum");
        System.out.println("Total bayar \t: " + d.hitungTotalBayar(7500000));
        System.out.println("Total ongkir \t: " + d.hitungOngkir(20.0));
        System.out.println("Total cicilan \t: " + d.hitungCicilanPerBulan(7500000, 12));
    }
    
}
