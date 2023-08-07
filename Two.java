package com.yunhe.Zy20;

import java.io.File;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        File file = new File("D:/book/bokk/bokk.txt");
        te(file);
    }
    public static void te(File file){
        Scanner scanner = new Scanner(System.in);

        if(file.isFile()){
            System.out.println("是否删除？");
            System.out.println("1.删除   2.取消");
            int i = scanner.nextInt();
            if (i==1){
                file.delete();
                System.out.println("删除成功");
            }else if(i==2){
                System.out.println("取消删除");
            }else {
                System.out.println("选择无效");
            }
        }else {
            System.out.println("文件路径无效，删除失败");
        }
    }
}
