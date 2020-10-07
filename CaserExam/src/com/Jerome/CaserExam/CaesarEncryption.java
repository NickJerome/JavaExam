package com.Jerome.CaserExam;

public class CaesarEncryption implements Encryption {
    @Override
    public String Encryption (String Content , int Key) { //加密
        String result = "";
        for (int i = 0 ; i < Content.length() ; i++) {
            int c = Content.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                //加密大写字母
                if (c + Key % 26 >= 'A' && c + Key % 26 <= 'Z') {
                    c = c + Key % 26;
                } else {
                    c = c + Key % 26 - 26;
                }
            }

            if (c >= 'a' && c <= 'z') {
                //加密小写字母
                if (c + Key % 26 >= 'a' && c + Key % 26 <= 'z') {
                    c = c + Key % 26 ;
                } else {
                    c = c + Key % 26 - 26;
                }
            }

            if (c >= '0' && c <= '9') {
                //加密数字
                if (c + Key % 10 >= '0' && c + Key % 10 <= '9') {
                    c = c + Key % 10 ;
                } else {
                    c = c + Key % 10 - 10;
                }
            }
            result = result + (char) c;
        }
        return result;
    }

    @Override
    public String Decryption (String Content , int Key) { //解密
        String result = "";
        for (int i = 0 ; i < Content.length() ; i++) {
            int c = Content.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                //加密大写字母
                if (c - Key % 26 >= 'A' && c - Key % 26 <= 'Z') {
                    c = c - Key % 26;
                } else {
                    c = c - Key % 26 + 26;
                }
            }

            if (c >= 'a' && c <= 'z') {
                //加密小写字母
                if (c - Key % 26 >= 'a' && c - Key % 26 <= 'z') {
                    c = c - Key % 26 ;
                } else {
                    c = c - Key % 26 + 26;
                }
            }

            if (c >= '0' && c <= '9') {
                //加密数字
                if (c - Key % 10 >= '0' && c - Key % 10 <= '9') {
                    c = c - Key % 10 ;
                } else {
                    c = c - Key % 10 + 10;
                }
            }
            result = result + (char) c;
        }
        return result;
    }
}
