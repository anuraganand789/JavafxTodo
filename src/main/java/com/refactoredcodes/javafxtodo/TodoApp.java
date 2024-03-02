package com.refactoredcodes.javafxtodo;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class TodoApp extends Application {

    final VBox  sidebar         =   new VBox();
    final VBox  vboxContent     =   new VBox();
    final HBox  rootNode        =   new HBox();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stageMain){
        sidebar
                .getChildren()
                .addAll(
                            searchBox()
                        ,   shortcutButtons()
                );

        rootNode.getChildren().addAll(sidebar, vboxContent);

        final Scene sceneMain   =   new Scene(rootNode);

        final Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();

        stageMain.setHeight(primaryScreenBounds.getHeight());
        stageMain.setWidth(primaryScreenBounds.getWidth());

        stageMain.setScene(sceneMain);
        stageMain.show();
    }

    private Node searchBox(){
        final TextField textFieldSearch = new TextField();

        return textFieldSearch;
    }

    private Node shortcutButtons(){
        final VBox vboxShortcutButtons = new VBox();
        final Button    buttonMyDay         =   new Button("My Day");
        final Button    buttonImportant     =   new Button("Important");
        final Button    buttonCompleted     =   new Button("Completed");
        final Button    buttonFlaggedEmail  =   new Button("Flagged Email");
        final Button    buttonTasks         =   new Button("Tasks");

        vboxShortcutButtons
                .getChildren()
                .addAll(buttonMyDay, buttonImportant, buttonCompleted, buttonFlaggedEmail, buttonTasks);

        return vboxShortcutButtons;
    }
}
