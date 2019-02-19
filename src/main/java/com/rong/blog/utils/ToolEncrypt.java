package com.rong.blog.utils;

import com.rong.blog.exception.EncryptionException;

import java.security.MessageDigest;

public class ToolEncrypt {

    /**
     * MD5加密
     *
     * @param param
     *            加密字符
     * @return String 加密后的字符
     * @throws EncryptionException
     *             Encryption异常
     */
    public static String mD5Encrypt(String param) throws EncryptionException {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u' };
        try {
            byte[] strTemp = param.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception localException) {
            throw new EncryptionException("MD5加密异常", localException);
        }
    }
}
