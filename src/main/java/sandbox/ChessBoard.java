package sandbox;

public class ChessBoard {

    public static void main(String[] args) {
        String[] color = {"\033[30;47m", "\033[37;40m"};
        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.print(color[(i + j) % 2] + " " + (char) (65 + j) + i);
            }
            System.out.println("\033[0m");
        }
    }
}
