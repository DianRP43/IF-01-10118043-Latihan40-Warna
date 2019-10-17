
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class warna {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
                    public static final String reset = "\u001B[0m";
                    public static final String merah = "\u001B[31m";
                    public static final String hijau = "\u001B[32m";
                    public static final String kuning = "\u001B[33m";
                    public static final String biru = "\u001B[34m";
                    public static final String ungu = "\u001B[35m";
                    public static final String biruMuda = "\u001B[36m";
                    public static final String putih = "\u001B[37m";
                    public static final String latarMerah = "\u001B[41m";
                    public static final String latarHijau = "\u001B[42m";
                    public static final String latarKuning = "\u001B[43m";
                    public static final String latarBiru = "\u001B[44m";
                    public static final String latarUngu = "\u001B[45m";
                    

                    //variabel
                     public static String warna;
	public static String nama;
                     public static String warnaCek;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
                           //header
                            System.out.println(merah + " YUK " + hijau + "CEK " + kuning + "KEPRIBADIANMU" +biruMuda +
                                                              " DARI " + ungu + "WARNA " + biru + "FAVORITMU\n\n");
       
                            System.out.println(latarMerah + putih+ "\t  MERAH\t\t"  );
                            System.out.println(latarHijau + putih+ "\t  HIJAU\t\t"  );
                            System.out.println(latarKuning + putih+ "\t  KUNING\t"  );
                            System.out.println(latarBiru + putih+ "\t  BIRU\t\t"  );
                            System.out.println(latarUngu + putih+ "\t  UNGU\t\t\n"  );
        
                            //input
                            System.out.print(reset + "PILIH WARNA FAVORITMU : ");
                            Scanner scanner = new Scanner(System.in);
                            warna = scanner.nextLine();
                            warnaCek = warna.toUpperCase();
        
                            System.out.print("Nama Kamu : ");
                            nama = scanner.nextLine();
        
                            //proses dan output
        
                            System.out.println("\n+++++HASIL TEST KEPRIBADIAN " + nama + "+++++");
                            switch(warnaCek){
                                    case "MERAH" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + merah + warnaCek); 
                                                Merah m = new Merah();
                                                m.red();
                                                break;
                                   case "HIJAU" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + hijau + warnaCek); 
                                                Hijau h = new Hijau();
                                                h.green();
                                                break;
                                   case "KUNING" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + kuning + warnaCek); 
                                                Kuning k = new Kuning();
                                                k.yellow();
                                                break;
                                    case "BIRU" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + biru + warnaCek); 
                                                Biru b = new Biru();
                                                b.blue();
                                                break;
                                    case "UNGU" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + ungu + warnaCek); 
                                                Ungu u = new Ungu();
                                                u.purple();
                                                break;
                                    default :
                                                System.out.println("Oopss... Belum Terindentifikasi ");
                                                break;
                  
         } 
	}
    }
    

