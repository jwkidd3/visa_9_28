package com.moto.thurs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyNIO {
    public static void main(String... args) throws IOException {
        File readFile= new File("/Users/jwkidd3/IMG_4810.jpeg");
        File writeFile = new File("/Users/jwkidd3/OUT_IMG_4810.jpeg");

        ByteBuffer fileBuffer= ByteBuffer.allocate(256);

        FileInputStream fis=new FileInputStream(readFile);
        FileChannel orgiChan=fis.getChannel();
        FileOutputStream fos=new FileOutputStream(writeFile);
        FileChannel copyChan=fos.getChannel();

        int bytesRead=orgiChan.read(fileBuffer);
        while(bytesRead != -1){
            fileBuffer.flip();
            copyChan.write(fileBuffer);
            fileBuffer.clear();
            bytesRead=orgiChan.read(fileBuffer);
        }

        copyChan.close();
        orgiChan.close();
        fos.close();
        fis.close();

    }
}
