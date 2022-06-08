package com.codewithcup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BatchRunner {
    public static void main(String[] args) {

        ProcessBuilder processBuilder = new ProcessBuilder("H:\\RunnerProject\\src\\com\\codewithcup\\runner.bat");
        try{
            Process process = processBuilder.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line =reader.readLine())!=null){
                output.append(line +"\n");
            }
            int exitVal = process.waitFor();
            if(exitVal == 0){
                System.out.println(output);
                System.exit(0);
            }else{
                System.out.println("Abnormal Termination");
                //abnormal
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
//        catch(Exeception e){
//            e.printStackTrace();
//        }

//        {
//            String filePath = "";
//            try {
//
//                Process p = Runtime.getRuntime().exec(filePath);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
    }
}
