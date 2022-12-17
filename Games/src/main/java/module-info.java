module uli.nick.games {
    requires javafx.controls;
    requires javafx.fxml;


    opens uli.nick.games to javafx.fxml;
    exports uli.nick.games;
}