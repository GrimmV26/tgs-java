package P2;

import java.util.Scanner;

public class JavaDasar {
    public static void main(String[] args) {
//        output
//        System.out.println("Nama Saya Arga ");
//        System.out.print("Hello World ");
//        Scanner input = new Scanner(System.in);
        String nama; int umr;
        
//        IO
//        System.out.print("Masukin : ");
//        nama = input.nextLine();        
//        System.out.print("Umur Nya : " );
//        umr = input.nextInt();

//        Tipe Data
        int no = 7, nomor = 50;
        String kalimat = "haha";
        char abc = 'b';
        var bilangan = 70;
        byte intByte = 10; //max 127 min -128
        float inifloat = 12.7f;
        double inidobel = 133.45f;
        int iniint = 19_000_000;
        short inishort = 112;
        long inilong = 899;
        
        System.out.println(iniint);
       
//        operator 
//        aritmatika + - * /
//        relasi == < > <= >=
//        logika && || !
//        tiernary -- ++

        iniint = no - nomor;
        System.out.println(iniint);
        
//        Kondisi
//        if else switch lambda
        char nilai = 'C';
//        lambda switch
        switch(nilai){
            case 'A'-> {
                System.out.print("Kamu lulus");
            }
            case 'B'-> System.out.print("Kamu lulus");
            case 'C'-> System.out.print("Kamu GAK lulus");
        };
        
//        array
        int[] bil={1,2,3};

        
    }
    
}