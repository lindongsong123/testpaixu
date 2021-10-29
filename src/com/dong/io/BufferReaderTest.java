package com.dong.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        FileReader fr=null;
        try {
            fr=new FileReader("src\\com\\dong\\io\\InputSteam03.java");
            br=new BufferedReader(fr);
            String s=null;
            while((s=br.readLine())!=null){
                System.out.println(s);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
