package sandbox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        String tag = args[0];
        FileReader fileReader = new FileReader(fileName);
        ArrayList<Character> array = new ArrayList<>();
        while (fileReader.ready()) {
            char data = (char) fileReader.read();
            array.add(data);
        }
        fileReader.close();
        String text = "";
        for (char a : array) {
            text = text + a;
        }
        text = text.replaceAll("[\\r\\n]+", "");
        ArrayList<String> result = new ArrayList<>();
        String startTag = "<" + tag;
        String endTag = "</" + tag + ">";
        ArrayList<Integer> startTagIndexArray = new ArrayList<>();
        ArrayList<Integer> endTagIndexArray = new ArrayList<>();
        int startTagIndex = 0;
        int endTagIndex = 0;
        while (true) {
            if (startTagIndex == 0) {
                startTagIndex = text.indexOf(startTag);
                if (startTagIndex == -1) break;
                startTagIndexArray.add(startTagIndex);
                startTagIndex++;
            } else {
                startTagIndex = text.indexOf(startTag, startTagIndex + 1);
                if (startTagIndex == -1) break;
                startTagIndexArray.add(startTagIndex);
            }
        }
        while (true) {
            if (endTagIndex == 0) {
                endTagIndex = text.indexOf(endTag);
                if (endTagIndex == -1) break;
                endTagIndexArray.add(endTagIndex);
                endTagIndex++;
            } else {
                endTagIndex = text.indexOf(endTag, endTagIndex + 1);
                if (endTagIndex == -1) break;
                endTagIndexArray.add(endTagIndex);
            }
        }
        int i = 0;
        int j = 0;
        int counter = 0;
        int startOfText = startTagIndexArray.get(i);
        int endOfText = endTagIndexArray.get(j);
        while (i < startTagIndexArray.size() || j < endTagIndexArray.size()) {
            if (i >= startTagIndexArray.size()) {
                endOfText = endTagIndexArray.get(endTagIndexArray.size()-1);
                result.add(text.substring(startOfText, endOfText + endTag.length()));
                break;
            } else if ((startTagIndexArray.get(i) < endTagIndexArray.get(j))) {
                counter++;
                i++;
            } else if (startTagIndexArray.get(i) > endTagIndexArray.get(j)) {
                counter--;
                if (counter == 0) {
                    endOfText = endTagIndexArray.get(j);
                    result.add(text.substring(startOfText, endOfText + endTag.length()));
                    if (startTagIndexArray.size() > (i + 1)) {
                        startOfText = startTagIndexArray.get(i);
                    }
                }
                j++;
            }
        }

        for (String data : result) {
            System.out.println(data);
        }

    }
}
