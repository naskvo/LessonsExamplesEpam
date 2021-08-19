package javaclasses.aboutimport;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnMainImport {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
