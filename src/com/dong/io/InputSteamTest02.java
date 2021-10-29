package com.dong.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputSteamTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;

        try {
            fis = new FileInputStream("src\\com\\dong\\io\\test.txt");
            byte[] bytes = new byte[4];
            while (true){
                int read = fis.read(bytes);

                if (read==-1){
                    break;
                }
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
