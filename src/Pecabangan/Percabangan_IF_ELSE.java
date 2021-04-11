package Pecabangan;


public class Percabangan_IF_ELSE {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet<totalBelanja){
            System.out.println("uang kurang, kurangi jajan anda");
        }else if (uangDiDompet>totalBelanja) {
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("uang cukup, angsul : " + angsul);
        }else {
            System.out.println("uang pas.. Uwu..");
        }
    }
}
