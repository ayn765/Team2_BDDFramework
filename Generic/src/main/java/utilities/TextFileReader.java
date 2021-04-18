package utilities;

import common.BaseAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader extends BaseAPI{

    static FileReader fileReader;
    static BufferedReader bufferedReader;


    public void readFile(String path) {

        String data = "";

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

//    public String readToString(String path) {
//        String data = "";
//        try {
//            data = Files.readString(Paths.get(path));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return data;
//    }
}

