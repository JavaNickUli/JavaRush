module uli.nick.games {
    requires javafx.controls;
    requires javafx.fxml;
    requires desktop.game.engine;


    opens uli.nick.games to javafx.fxml;
    exports uli.nick.games;
}