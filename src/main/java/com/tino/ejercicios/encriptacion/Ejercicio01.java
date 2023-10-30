package com.tino.ejercicios.encriptacion;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Encriptación y desencriptación de una cadena utilizando AES
 */
public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        String texto = "Hola mundo";
        System.out.println("Texto original: " + texto);

        // generar clave AES
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        // encriptar
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] bytesEncriptados = cipher.doFinal(texto.getBytes());

        // convertir a Base64
        String textoEncriptado = Base64.getEncoder().encodeToString(bytesEncriptados);
        System.out.println("Texto encriptado: " + textoEncriptado);

        // desencriptar
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] bytesDesencriptados = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
        String textoDesencriptado = new String(bytesDesencriptados);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }
}
