package com.Jerome.CaserExam;

import java.awt.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Encryption implements Encryption {
    @Override
    public String Encryption (String Content , int Key) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] b = Content.getBytes();
            byte[] digest = md5.digest(b);
            char[] chars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7' , '8', '9', 'A', 'B', 'C', 'D', 'E','F' };
            StringBuffer sb = new StringBuffer();
            for (byte bb : digest) {
                sb.append(chars[(bb >> 4) & 15]);
                sb.append(chars[bb & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    @Override
    public String Decryption (String Content , int Key) {
        UnsupportedOperationException e = new UnsupportedOperationException("MD5 算法无法解密");
        throw e;
    }
}
