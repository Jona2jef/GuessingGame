package jonny.custom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class Logic {
    // to remove spaces in a string
    public static final String removeSpaces(String str){
        char [] arr = str.toCharArray();
        String finalStr = "";

        for (char ch: arr) {
            if (Character.isLetterOrDigit(ch))
                finalStr = finalStr.concat(String.valueOf(ch));
        }

        return finalStr;
    }

    // count the number of lines in a file
    public static int linesInFile(File file) throws FileNotFoundException {
        Scanner fs = new Scanner(file);
        int ls = 0;
        while (fs.hasNextLine()) {
            ls++;
        }
        return ls;
    }

    // to put lines of a file into an array
    public static final String[] generateArrayFromFile(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        int nl = linesInFile(file);
        String[] finalArray = new String[nl];
        int count = 0;
        while (sc.hasNextLine()) {
            finalArray[count] = sc.nextLine();
            count++;
        }
        return finalArray;
    }
}
