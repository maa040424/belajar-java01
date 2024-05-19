public class Array {
    public static void main(String[] args) {
        String[] arrayNama = new String[3];
        arrayNama[0] = "Muhammad ";
        arrayNama[1] = "Adam ";
        arrayNama[2] = "Alghifari";
        
        System.out.print(arrayNama[0]);
        System.out.print(arrayNama[1]);
        System.out.println(arrayNama[2]);
        
        //inisialisasi array 
        String[] nama ={
            "Muhammad", "Adam ", "Alghifari"
        };
        
        int[] iniInt = new int[]{
            1,2,3,4,5,6,7,8,9
        };
        
        System.out.println(iniInt[3] + nama[1] );
        System.out.println(iniInt.length);
        
        //contoh array dalam array 
        String[][] members = {
        {"Muhammad", "Adam","Alghifari"},
        {"Tes", "Satu", "Dua"},
        {"tEs", "Tiga", "Empat"}
                
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][2]);
        System.out.println(members[2][2]);
    }
    
}
