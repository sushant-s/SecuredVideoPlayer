package encrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author sushant
 */
public class Encrypt {

    public static void main(String[] args) throws InvalidAlgorithmParameterException, UnsupportedEncodingException, FileNotFoundException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IOException, NoSuchProviderException {
        String initVector = "RandomInitVector";
        String folder = "your_path";
        int j = new File(folder).listFiles().length;
        System.out.println(Integer.toString(j));
        int i=0;
        if(j>9)
        {
            while(i<10)
            {
                //System.out.println("i");
                //System.out.println(Integer.toString(i));
                IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
                FileInputStream fis = null;
                String InputPath = "your_path";
                String SubPath = Integer.toString(i)+".ts";
                InputPath = InputPath.concat(SubPath);
                System.out.println(InputPath);
                fis = new FileInputStream(InputPath);
                // This stream write the encrypted text. This stream will be wrapped by another stream.
                FileOutputStream fos = null;
                String OutputPath = "your_path";
                OutputPath = OutputPath.concat(SubPath);
                System.out.println(OutputPath);
                fos = new FileOutputStream(OutputPath);
                // Length is 16 byte
                SecretKeySpec sks = new SecretKeySpec("your_password".getBytes(), "AES");
                // Create cipher
                Cipher cipher = null;
                //cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, sks, iv);
                // Wrap the output stream
                CipherOutputStream cos = new CipherOutputStream(fos, cipher);
                // Write bytes
                int b;
                byte[] d = new byte[8];
                while ((b = fis.read(d)) != -1) {
                cos.write(d, 0, b);
                }
                // Flush and close streams.
                cos.flush();
                cos.close();
                fis.close();
                i++;
                System.out.println("Encrypted");
            }
        }
        else
        {
            while(i<j)
            {
                //System.out.println("i");
                //System.out.println(Integer.toString(i));
                IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
                FileInputStream fis = null;
                String InputPath = "your_path";
                String SubPath = Integer.toString(i)+".ts";
                InputPath = InputPath.concat(SubPath);
                System.out.println(InputPath);
                fis = new FileInputStream(InputPath);
                // This stream write the encrypted text. This stream will be wrapped by another stream.
                FileOutputStream fos = null;
                String OutputPath = "your_path";
                OutputPath = OutputPath.concat(SubPath);
                System.out.println(OutputPath);
                fos = new FileOutputStream(OutputPath);
                // Length is 16 byte
                SecretKeySpec sks = new SecretKeySpec("your_path".getBytes(), "AES");
                // Create cipher
                Cipher cipher = null;
                //cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, sks, iv);
                // Wrap the output stream
                CipherOutputStream cos = new CipherOutputStream(fos, cipher);
                // Write bytes
                int b;
                byte[] d = new byte[8];
                while ((b = fis.read(d)) != -1) {
                cos.write(d, 0, b);
                }
                // Flush and close streams.
                cos.flush();
                cos.close();
                fis.close();
                i++;
                System.out.println("Encrypted");
            }
        }
        while(i<(j-1))
        {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes());
            FileInputStream fis = null;
            String Path = "your_path";
            String SubPath = Integer.toString(i)+".ts";
            Path = Path.concat(SubPath);
            fis = new FileInputStream(Path);
            // This stream write the encrypted text. This stream will be wrapped by another stream.
            FileOutputStream fos = null;
            String OutputPath = "your_path";
            OutputPath = OutputPath.concat(SubPath);
            fos = new FileOutputStream(OutputPath);
            // Length is 16 byte
            SecretKeySpec sks = new SecretKeySpec("your_password".getBytes(), "AES");
            // Create cipher
            Cipher cipher = null;
            //cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, sks, iv);
            // Wrap the output stream
            CipherOutputStream cos = new CipherOutputStream(fos, cipher);
            // Write bytes
            int b;
            byte[] d = new byte[8];
            while ((b = fis.read(d)) != -1) {
                cos.write(d, 0, b);
            }
            // Flush and close streams.
            cos.flush();
            cos.close();
            fis.close();
            i++;
            System.out.println("Encrypted");
       }
    }
}       
