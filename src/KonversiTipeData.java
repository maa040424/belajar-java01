
public class KonversiTipeData {
    public static void main(String[] args) {
        //widening castion ini dari lower ke upper tipe data number
        byte iniByte = 100;
        int iniInt = iniByte;
        
        System.out.println(iniInt);
        
        //Narrowing casting ini dari upper ke lowwer tipe data number harus ada (lowwer tipe data)
        
        byte iniByte2 = (byte)iniInt;
        System.out.println(iniByte2);
    
    }
    
}
