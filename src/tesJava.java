import java.util.Scanner;

public class tesJava {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Nama :");
        String nama = scanner.nextLine();
        
        System.out.println("Semester :");
        int semester = scanner.nextInt();
        
        System.out.println("Nilai Absen :");
        float nilaiAbsen = scanner.nextFloat();
        
        System.out.println("Nilai Tugas :");
        int tugas = scanner.nextInt();
        
        System.out.println("Nilai UTS :");
        int uts = scanner.nextInt();
        
        System.out.println("Nilai UAS :");
        int uas = scanner.nextInt();
        
       
        float hasil = (nilaiAbsen* 0.10f) + (tugas * 0.20f) + (uts * 0.30f) + (uas * 0.40f);
        int nilai = (int)hasil;
        String ucapan1 ="";
        String ucapan2;
        String ucapan="";
                
        if (hasil >= 80){
           ucapan = "Nilai Abjad Anda : A";
        } else if (hasil >=75){
            ucapan = "Nilai Abjad Anda : B+";
        } else if (hasil >=70){
            ucapan = "Nilai Abjad Anda : B";
        } else if (hasil >=65){
            ucapan = "Nilai Abjad Anda : C+";
        } else if (hasil >=60){
            ucapan = "Nilai Abjad Anda : C";
        } else if (hasil >=55){
            ucapan = "Nilai Abjad Anda : D";
        } else if (hasil >=50){
            ucapan = "Nilai Abjad Anda : E";
        } else {
            ucapan = "Nilai Abjad Anda : F";
            ucapan1 = "Harap Lebih Giat Lagi Dalam Menuntut Ilmu :)";
        } 
        
        if (nilai >= 60 ){
            ucapan2 = "Anda Lulus";
        } else {
            ucapan2 = "Anda Gagal";
        }
        
        System.out.println("Nama Anda :" + nama);
        System.out.println("Anda Berada Di Semester :" + semester);
        System.out.println("Nilai Absen Anda :" + nilaiAbsen);
        System.out.println("Nilai Tugas Anda :" + tugas);
        System.out.println("Nilai UTS Anda :" + uts);
        System.out.println("Nilai UAS Anda :" + uas);
        System.out.println(ucapan);
        System.out.println(ucapan2);
        
        scanner.close();
    }
}
