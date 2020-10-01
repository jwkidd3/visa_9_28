package com.moto.thurs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyNIO {
    public static void main(String... args) throws Exception {

        File readfile=new File("/Users/jwkidd3/IMG_4810.jpeg");
        File  writefile=new File("/Users/jwkidd3/out.jpeg");

        ByteBuffer filebuffer= ByteBuffer.allocate(256);

        FileInputStream fis=new FileInputStream(readfile);
        FileChannel inchan=fis.getChannel();
        FileOutputStream fos=new FileOutputStream(writefile);
        FileChannel outchan=fos.getChannel();

        int bytesRead=inchan.read(filebuffer);
        while (bytesRead != -1){
            filebuffer.flip();
            outchan.write(filebuffer);
            filebuffer.clear();
            bytesRead=inchan.read(filebuffer);
        }
        outchan.close();
        inchan.close();
        fos.close();
        fis.close();
    }
}
