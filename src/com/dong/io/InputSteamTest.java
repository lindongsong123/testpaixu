package com.dong.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputSteamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("D:\\test\\1.txt");
           int b=0;
            while((b=fis.read())!=-1){
//                System.out.println(b);
                System.out.println((char)b);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
