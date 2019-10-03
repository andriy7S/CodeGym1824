package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        try{
            while(true){

                fileName = reader.readLine();
                FileInputStream inputStream = new FileInputStream(fileName);
                if (inputStream.available() > 0) {
                    inputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            reader.close();
            System.out.println(fileName);
        }
    }
}
