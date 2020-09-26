package com.feicaodemo.iodemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

/**
 * @author Caofei
 * @className FileIoDemo
 * @description TODO
 * @date {2020/9/9} 6:36
 */
@Slf4j
public class FileIoDemo {

    public static void main(String[] args){
        String path = "demo.txt";
        try{
            InputStream inputStream = new FileInputStream(path);
            FileReader reader = new FileReader("demo.txt");
            char[] chars = new char[1024];

            FileWriter writer = new FileWriter(new File(path));
            int len = 0;
            while((len = reader.read(chars))!= -1){
                writer.write(chars,0,len);
            }
            System.out.println(reader);
            System.out.println(writer);
        }catch (IOException e){

        }
    }
}
