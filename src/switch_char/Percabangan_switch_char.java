package switch_char;



public class Percabangan_switch_char {
    public static void main(String[] args) {
        char nilai='A';
        switch (nilai){
            case 'A':
                System.out.println("mhs     : \"terimakasih pak\"");
                System.out.println("dosen   : \"selamat ya\"");
                break;
            case 'B':
                System.out.println("mhs     : \"kenapa ulun kada dapat A, pak?\"");
                System.out.println("dosen   : \"!@#$#\"");
                break;
            case 'C':
                System.out.println("mhs     : \"ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("dosen   : \"tapi bisalah menjawab ujian\"");
                System.out.println("mhs     : \"hihihi\"");
                break;
            default:
                System.out.println("mhs     : \"ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("dosen   : \"bujur jua kah\"");
                System.out.println("dosen   : \"memeriksa berkas\"");
                System.out.println("dosen   : \"menceleng\"");
                System.out.println("mhs     : \"kabur...\"");
                break;


        }
    }
}
