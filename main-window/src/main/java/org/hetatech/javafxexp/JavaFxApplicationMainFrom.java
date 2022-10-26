package org.hetatech.javafxexp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JavaFxApplicationMainFrom extends Application {

    // button size
    private static final double BTN_MIN_WIDTH = 100;
    private static final double BTN_MIN_HEIGHT = 100;

    // button position
    private static final int BTN_COL_INDEX_START_A_NEW_TEST = 0;
    private static final int BTN_ROW_INDEX_START_A_NEW_TEST = 0;
    private static final int BTN_COL_SPAN_START_A_NEW_TEST = 2;
    private static final int BTN_ROW_SPAN_START_A_NEW_TEST = 1;

    private static final int BTN_COL_INDEX_TESTS = 0;
    private static final int BTN_ROW_INDEX_TESTS = 1;

    private static final int BTN_COL_INDEX_DOMAINS = 1;
    private static final int BTN_ROW_INDEX_DOMAINS = 1;

    private static final int BTN_COL_INDEX_EXERCISES = 0;
    private static final int BTN_ROW_INDEX_EXERCISES = 2;

    private static final int BTN_COL_INDEX_STRATEGIES = 1;
    private static final int BTN_ROW_INDEX_STRATEGIES = 2;

    private static final int BTN_COL_INDEX_BOOKS = 0;
    private static final int BTN_ROW_INDEX_BOOKS = 3;

    private static final int BTN_COL_INDEX_SETTINGS = 1;
    private static final int BTN_ROW_INDEX_SETTINGS = 3;

    private static final int BTN_COL_INDEX_KEYWORDS = 0;
    private static final int BTN_ROW_INDEX_KEYWORDS = 4;

    private static final int BTN_COL_INDEX_EXIT = 1;
    private static final int BTN_ROW_INDEX_EXIT = 4;

    // buttons text
    private static final String BTN_TEXT_START_A_NEW_TEST = "Start a new test";
    private static final String BTN_TEXT_TESTS = "Tests";
    private static final String BTN_TEXT_DOMAINS = "Domains";
    private static final String BTN_TEXT_EXERCISES = "Exercises";
    private static final String BTN_TEXT_STRATEGIES = "Strategies";
    private static final String BTN_TEXT_BOOKS = "Books";
    private static final String BTN_TEXT_SETTINGS = "Settings";
    private static final String BTN_TEXT_KEYWORDS = "Keywords";
    private static final String BTN_TEXT_EXIT = "Exit";

    private Button createButton() {
        Button button = new Button();
        button.setMinSize(BTN_MIN_WIDTH, BTN_MIN_HEIGHT);
        button.setMaxWidth(Double.MAX_VALUE);
        return button;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Your Math knowledge base");

        GridPane mainPane = new GridPane();
        mainPane.setHgap(30);
        mainPane.setVgap(30);
        mainPane.setPadding(new Insets(20, 20, 20, 20));

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);

        mainPane.getColumnConstraints().addAll(column1, column2);

        Button btnStartNewTest = createButton();
        btnStartNewTest.setText(BTN_TEXT_START_A_NEW_TEST);
        mainPane.add(btnStartNewTest, BTN_COL_INDEX_START_A_NEW_TEST,
                BTN_ROW_INDEX_START_A_NEW_TEST, BTN_COL_SPAN_START_A_NEW_TEST, BTN_ROW_SPAN_START_A_NEW_TEST);

        Button btnTests = createButton();
        btnTests.setText(BTN_TEXT_TESTS);
        mainPane.add(btnTests, BTN_COL_INDEX_TESTS, BTN_ROW_INDEX_TESTS);

        Button btnDomains = createButton();
        btnDomains.setText(BTN_TEXT_DOMAINS);
        mainPane.add(btnDomains, BTN_COL_INDEX_DOMAINS, BTN_ROW_INDEX_DOMAINS);

        Button btnExercises = createButton();
        btnExercises.setText(BTN_TEXT_EXERCISES);
        mainPane.add(btnExercises, BTN_COL_INDEX_EXERCISES, BTN_ROW_INDEX_EXERCISES);

        Button btnStrategies = createButton();
        btnStrategies.setText(BTN_TEXT_STRATEGIES);
        mainPane.add(btnStrategies, BTN_COL_INDEX_STRATEGIES, BTN_ROW_INDEX_STRATEGIES);

        Button btnBooks = createButton();
        btnBooks.setText(BTN_TEXT_BOOKS);
        mainPane.add(btnBooks, BTN_COL_INDEX_BOOKS, BTN_ROW_INDEX_BOOKS);

        Button btnSettings = createButton();
        btnSettings.setText(BTN_TEXT_SETTINGS);
        mainPane.add(btnSettings, BTN_COL_INDEX_SETTINGS, BTN_ROW_INDEX_SETTINGS);

        Button btnKeywords = createButton();
        btnKeywords.setText(BTN_TEXT_KEYWORDS);
        mainPane.add(btnKeywords, BTN_COL_INDEX_KEYWORDS, BTN_ROW_INDEX_KEYWORDS);

        Button btnExit = createButton();
        btnExit.setText(BTN_TEXT_EXIT);
        mainPane.add(btnExit, BTN_COL_INDEX_EXIT, BTN_ROW_INDEX_EXIT);

        Scene scene = new Scene(mainPane, 1205, 825);

        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void startApplication(String... args) {
        launch(args);
    }
}
