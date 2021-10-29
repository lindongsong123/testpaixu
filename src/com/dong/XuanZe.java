package com.dong;

public class XuanZe {
    public static void main(String[] args) {
        int [] arr={23,445,90,1,9,6};
        for (int i = 0;i <arr.length ; i++) {
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    
}
