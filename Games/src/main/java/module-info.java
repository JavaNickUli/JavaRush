module uli.nick.games {
    requires javafx.controls;
    requires javafx.fxml;
    requires desktop.game.engine;

    exports com.javarush.games.minesweeper;
    opens com.javarush.games.minesweeper to javafx.graphics;

    exports com.javarush.games.snake;
    opens com.javarush.games.snake to javafx.graphics;
}