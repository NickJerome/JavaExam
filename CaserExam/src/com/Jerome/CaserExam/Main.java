package com.Jerome.CaserExam;

import java.util.Scanner;

interface Encryption {
    String Encryption (String Content , int Key);
    String Decryption (String Content , int Key);
}

class Data {
    public int type;
    public String Content;
    public int method;
}

public class Main {

    private static void preliminary (Scanner sc) {
        System.out.println("Encrypt Or Decrypt？ 【E/D】");
        String type = sc.nextLine();
        CaesarEncryption CaeSarMethon = new CaesarEncryption();
        System.out.println("Pleass Enter The Content:");
        String Content = sc.nextLine();
        System.out.println("Pleass Enter The Key:");
        int Key = sc.nextInt();

        if (type.charAt(0)=='E') {
            System.out.println(CaeSarMethon.Encryption(Content , Key));
        } else {
            System.out.println(CaeSarMethon.Decryption(Content , Key));
        }
    }

    private static void basic (Scanner sc) {
        Data data = new Data();

        System.out.println("Encrypt Or Decrypt？ 【0/1】");
        data.type = sc.nextInt();
        System.out.println("Caesar Or md5？ 【0/1】");
        data.method = sc.nextInt();
        System.out.println("Pleass Enter The Content:");
        sc.next();
        data.Content = sc.nextLine();
        System.out.println("Pleass Enter The Key:");
        int Key = sc.nextInt();

        if (data.method == 0) { //Caesae
            CaesarEncryption Caesar = new CaesarEncryption();
            if (data.type == 0) { //Encryption
                System.out.println(Caesar.Encryption(data.Content , Key));
            } else {
                System.out.println(Caesar.Decryption(data.Content , Key));
            }
        } else {
            Md5Encryption MD5 = new Md5Encryption();
            if (data.type == 0) { //Encryption
                System.out.println(MD5.Encryption(data.Content, Key));
            } else {
                try {
                    System.out.println(MD5.Decryption(data.Content, Key));
                } catch (UnsupportedOperationException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        basic (scanner);
    }


}
