package com.dong.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputSteam03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("src\\com\\dong\\io\\test.txt");
            byte[] bytes = new byte[20];
            int read=0;
            while((read=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,read));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
