import java.io.*;

public class PD232 {
    public static int totalSPP;
   public static void main(String[] args){
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    try{
        do {
            String nim, nama;
            int jml_sem;

            System.out.println("===========");
            System.out.println("1. Input Data");
            System.out.println("2. Output Data");
            System.out.println("3. Logout");
            System.out.println("===========");
            System.out.print("Pilih Menu : ");

            int menu = Integer.parseInt(br.readLine());

            switch (menu){
                case 1:
                    System.out.println("isi NIM : ");
                     nim = br.readLine();

                    System.out.println("isi nama : ");
                     nama = br.readLine();

                    System.out.println("isi semester yang sudah ditempuh : ");
                    int sem = Integer.parseInt(br.readLine());

                    total_SPP(sem);
                    System.out.println("Jumlah SPP adalah : " + total_SPP(sem));
                    break;
                case 2:
                    break;
                default:
                    System.exit(0);
                    break;
            }
        } while (true);
        

    } catch (Exception e){
        System.out.println("Error Adalah " + e.getMessage());
    }
   }

   static public int total_SPP(int smt){
        totalSPP= smt *15000000;

        return totalSPP;
   }
   static public void cekData(){
    
   }
}
