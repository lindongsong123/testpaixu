package com.dong.io;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("D:\\文件保存路径\\cloudmusic\\MV\\少女时代 - Gee 日文版.mp4");
            fos=new FileOutputStream("C:\\少女时代 - Gee 日文版.mp4");
            byte[] bytes = new byte[1024 * 1024];
            int read=0;
            while ((read=fis.read(bytes))!=-1){
                fos.write(bytes,0,read);

            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
