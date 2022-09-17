package factory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ExecuteAround {
    public static void main(String[] args) throws Exception {

        String fileName = "src/factory/process.txt";
        String text = readText(fileName, (reader) -> {
            String str = "";
            try {
                str = reader.readLine() + reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        });
        System.out.println(text);
    }
    static String readText(String fileName, ProcessInterface p) throws Exception {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            return p.process(reader);
        }
    }
}
@FunctionalInterface
interface ProcessInterface {
    String process(BufferedReader reader);
}
