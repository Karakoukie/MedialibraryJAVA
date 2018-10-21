package utils;

import java.security.MessageDigest;

public class Hashing {

    public static String getSHA256Hash(String data) {
        String result = "";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(data.getBytes());

            byte byteData[] = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            result = sb.toString();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

}