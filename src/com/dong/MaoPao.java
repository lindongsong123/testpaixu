package com.dong;

public class MaoPao {
    public static void main(String[] args) {
        int [] arr={23,1,56,7,10};
        for(int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}
