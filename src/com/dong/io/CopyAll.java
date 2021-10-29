
/*
	d:/course --> c:/course
*/
package com.dong.io;
import java.io.*;
 class CopyAll
{
    public static void main(String[] args){

        File f = new File("d:/work");

        method(f);
    }


    public static void method(File f){

        //f是文件
        if(f.isFile()){

            //拷贝
            //  D:\course\JavaProjects\02-JavaSE\chapter01\A.java
            //  C:\course\JavaProjects\02-JavaSE\chapter01\A.java
            String filePath = f.getAbsolutePath(); //获取绝对路径
            String newFilePath = "C" + filePath.substring(1);
            File parentFile = new File(newFilePath).getParentFile();
            if(!parentFile.exists()){
                parentFile.mkdirs();
            }


            FileInputStream fis = null;
            FileOutputStream fos = null;

            //为了保证关闭流，使用finally语句.
            try{

                fis = new FileInputStream(filePath);
                fos = new FileOutputStream(newFilePath);

                //复制
                byte[] bytes = new byte[102400]; //100KB
                int temp = 0;
                while((temp=fis.read(bytes)) != -1){
                    fos.write(bytes,0,temp);
                }

                fos.flush();
            }catch(Exception e){
                e.printStackTrace();
            }finally{

                //分别try..catch...
                if(fis!=null){
                    try{
                        fis.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }

                }
                if(fos!=null){
                    try{
                        fos.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }

            return;
        }

        //f是目录
        File[] fs = f.listFiles();
        for(File subF:fs){
            //System.out.println(subF.getAbsolutePath());
            method(subF);
        }

    }
}