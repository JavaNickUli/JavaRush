package sandbox;

public class Task2202 {

    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        int indexLast1 = string.indexOf("");
        try {
            int index1 = string.indexOf(' ') + 1;
            int index2 = string.indexOf(' ', index1) + 1;
            int index3 = string.indexOf(' ', index2) + 1;
            int index4 = string.indexOf(' ', index3) + 1;
            int indexLast = string.indexOf("\bобучения\b", index4);
            return string.substring(index1, indexLast);
        } catch (Exception e) {
            throw new TooShortStringException(e);
        }
    }

    public static class TooShortStringException extends RuntimeException {

        public TooShortStringException(Throwable cause) {
            super(cause);
        }
    }
}
