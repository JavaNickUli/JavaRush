package sandbox;

public class Solution {

    public static void main(String[] args) {
        int id = 19846;
        String[] product = new String[]{"-c", "Шорты пляжные синие", "159.00", "12"};
        String SB = executeSB(id, product);
        String format = (executeFormat(id, product));
        System.out.println(executeSB(id, product));
        System.out.println(executeFormat(id, product));
    }

    public static String executeSB(int maxId, String[] args) {
        StringBuilder id = new StringBuilder(String.valueOf(maxId));
        id.setLength(8);
        StringBuilder productName = new StringBuilder(args[1]);
        productName.setLength(30);
        StringBuilder price = new StringBuilder(args[2]);
        price.setLength(8);
        StringBuilder quantity = new StringBuilder(args[3]);
        quantity.setLength(4);
        String str = "\n" + id + productName + price + quantity;
        return str;
    }

    public static String executeFormat(int maxId, String[] args) {
        return String.format("\n%-8d%-30s%-8s%-4s", ++maxId, args[1], args[2], args[3]);
    }
}

