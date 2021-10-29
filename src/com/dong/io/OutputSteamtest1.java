package com.dong.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputSteamtest1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("fos.txt",true);
            byte[]bytes={97,98,99,100};
            fos.write(bytes);
            String s="我是林东松";
            byte[] bytes1 = s.getBytes();
            fos.write(bytes1);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
