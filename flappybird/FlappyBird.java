/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flappybird;

/**
 *
 * @author Hasoub
 */
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Hasoub
 */
public class FlappyBird extends Application {

    Scene HomeScene;
    Scene Registration;
    Scene LogINPage;
    Scene SignupPape;
    Scene Setting;
    Scene Game;
    Scene Rank;
    Scene GameOver;

    @Override
    public void start(Stage primaryStage) {

//////////////////////////////////////////////////HOME PAGE////////////////////////////////////////////////////////
        Button btnPlay = new Button("Play");
        btnPlay.setTranslateY(82);
        btnPlay.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 15; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 10px 20px;"
        );

        //images
        ImageView backgroundView = new ImageView(new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/089918d8-99ff-45de-a084-3fe85d0e3fcc/dg34rsu-29a3d144-dc3f-473e-a949-f73a4ba1ef7c.png/v1/fit/w_608,h_457,q_70,strp/flappy_bird_backdrop_by_lenaxux_dg34rsu-375w-2x.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDU3IiwicGF0aCI6IlwvZlwvMDg5OTE4ZDgtOTlmZi00NWRlLWEwODQtM2ZlODVkMGUzZmNjXC9kZzM0cnN1LTI5YTNkMTQ0LWRjM2YtNDczZS1hOTQ5LWY3M2E0YmExZWY3Yy5wbmciLCJ3aWR0aCI6Ijw9NjA4In1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0._FI7nnUO3ZCIz23z4_juaIbbiEa_LQd1lX6MK-0iUEE"));
        backgroundView.setFitWidth(500);
        backgroundView.setFitHeight(400);

        Image Bird = new Image("file:src//image//IMG_0447.PNG");
        ImageView BirdV = new ImageView(Bird);
        BirdV.setFitHeight(150);
        BirdV.setFitWidth(150);
        BirdV.setLayoutY(160);
        BirdV.setLayoutX(180);

        Image setting = new Image("file:src//image//IMG_0461.PNG");
        ImageView settingV = new ImageView(setting);
        settingV.setFitHeight(40);
        settingV.setFitWidth(40);
        settingV.setLayoutY(350);
        settingV.setLayoutX(30);

        Image playWithFriends = new Image("file:src//image//IMG_0462.PNG");
        ImageView playWithFriendsV = new ImageView(playWithFriends);
        playWithFriendsV.setFitHeight(40);
        playWithFriendsV.setFitWidth(40);
        playWithFriendsV.setLayoutY(350);
        playWithFriendsV.setLayoutX(80);

        //Tittle of the games
        Text title1 = new Text("Flappy Bird");
        title1.setFont(Font.font("Comic Sans MS", 50));
        title1.setFill(Color.web("#6CA04E"));

        Text title2 = new Text("Game");
        title2.setFont(Font.font("Comic Sans MS", 50));
        title2.setFill(Color.web("#AA7A00"));

        //layout
        VBox titleBox = new VBox(-15, title1, title2);
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setPadding(new Insets(20, 0, 0, 0));

        Pane Birdimg = new Pane();
        Birdimg.getChildren().addAll(BirdV, settingV, playWithFriendsV);

        HBox btt = new HBox(90, btnPlay);
        btt.setAlignment(Pos.CENTER);
        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView, titleBox, btt, Birdimg);
        root.setAlignment(Pos.TOP_CENTER);

        HomeScene = new Scene(root, 500, 400);

        ///////////////////////////////Registration/////////////////////////////
        //Bottons
        Button btnLogInR = new Button("Log in");
        btnLogInR.setTranslateY(240);
        btnLogInR.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 15; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 10px 20px;"
        );

        Button btnSignUP2R = new Button("Sign up");
        btnSignUP2R.setTranslateY(295);

        btnSignUP2R.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 15; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 10px 20px;"
        );
        

        //images
        ImageView backgroundViewR = new ImageView(new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/089918d8-99ff-45de-a084-3fe85d0e3fcc/dg34rsu-29a3d144-dc3f-473e-a949-f73a4ba1ef7c.png/v1/fit/w_608,h_457,q_70,strp/flappy_bird_backdrop_by_lenaxux_dg34rsu-375w-2x.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDU3IiwicGF0aCI6IlwvZlwvMDg5OTE4ZDgtOTlmZi00NWRlLWEwODQtM2ZlODVkMGUzZmNjXC9kZzM0cnN1LTI5YTNkMTQ0LWRjM2YtNDczZS1hOTQ5LWY3M2E0YmExZWY3Yy5wbmciLCJ3aWR0aCI6Ijw9NjA4In1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0._FI7nnUO3ZCIz23z4_juaIbbiEa_LQd1lX6MK-0iUEE"));
        backgroundViewR.setFitWidth(500);
        backgroundViewR.setFitHeight(400);

        Image BirdR = new Image("file:src//image//IMG_0447.PNG");
        ImageView BirdVR = new ImageView(BirdR);
        BirdVR.setFitHeight(150);
        BirdVR.setFitWidth(150);
        BirdVR.setLayoutY(140);
        BirdVR.setLayoutX(180);

        Image settingR = new Image("file:src//image//IMG_0461.PNG");
        ImageView settingVR = new ImageView(settingR);
        settingVR.setFitHeight(40);
        settingVR.setFitWidth(40);
        settingVR.setLayoutY(350);
        settingVR.setLayoutX(30);

        //tittle of gemes
        Text title1R = new Text("Flappy Bird");
        title1R.setFont(Font.font("Comic Sans MS", 50));
        title1R.setFill(Color.web("#6CA04E"));

        Text title2R = new Text("Game");
        title2R.setFont(Font.font("Comic Sans MS", 50));
        title2R.setFill(Color.web("#AA7A00"));

        //layout
        VBox titleBoxR = new VBox(-15, title1R, title2R);
        titleBoxR.setAlignment(Pos.TOP_CENTER);
        titleBoxR.setPadding(new Insets(20, 0, 0, 0));

        Pane BirdimgR = new Pane();
        BirdimgR.getChildren().addAll(BirdVR, settingVR);

        
        StackPane root2 = new StackPane();
        root2.getChildren().addAll(backgroundViewR, titleBoxR, btnLogInR, btnSignUP2R, BirdimgR);
        root2.setAlignment(Pos.TOP_CENTER);

        Registration = new Scene(root2, 500, 400);

        ////////////////////////////////////////////////////RegistrationForm////////////////////////////////////////////////
// Background image
        Image backgroundImage = new Image("file:src//image//background.jpeg");
        ImageView backgroundViewL = new ImageView(backgroundImage);
        backgroundViewL.setFitWidth(500);
        backgroundViewL.setFitHeight(400);

        // Border image
        Image borderImage = new Image("file:src///image/border.png");
        ImageView borderView = new ImageView(borderImage);
        borderView.setFitWidth(420);
        borderView.setFitHeight(320);

        // Login form
        VBox form = new VBox(5);
        form.setAlignment(Pos.CENTER);

        // "Log In" title
        Text loginText_1 = new Text("Log");
        loginText_1.setFont(Font.font("Comic Sans MS", 50));
        loginText_1.setFill(Color.web("#6CA04E"));

        Text loginText_2 = new Text("In");
        loginText_2.setFont(Font.font("Comic Sans MS", 50));
        loginText_2.setFill(Color.web("#AA7A00"));

        HBox textContainer = new HBox(10);
        textContainer.setAlignment(Pos.CENTER);
        textContainer.getChildren().addAll(loginText_1, loginText_2);

        // Username field
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.setMaxWidth(200);
        Label usernameError = new Label();
        usernameError.setTextFill(Color.RED);

        // Password field
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(200);
        Label passwordError = new Label();
        passwordError.setTextFill(Color.RED);

        // Sign-in button
        Button signInButton = new Button("Sign In");
        signInButton.setStyle(
                "-fx-background-color: linear-gradient(#FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 15;"
        );

        // Add all elements to VBox
        form.getChildren().addAll(textContainer, usernameField, usernameError, passwordField, passwordError, signInButton);

        // Close button
        Button closeButton = new Button("X");
        closeButton.setStyle("-fx-background-color: transparent; -fx-font-size: 18px; -fx-text-fill: red;");
        closeButton.setOnAction(e -> primaryStage.close());

        // Sign-in button action
        signInButton.setOnAction(e -> {
            usernameError.setText("");
            passwordError.setText("");

            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            boolean isValid = true;

            // Username validation
            if (username.isEmpty()) {
                usernameError.setText("Username cannot be empty.");
                isValid = false;
            } else if (!username.matches("^[a-zA-Z0-9_]+$")) {
                usernameError.setText("Username can only contain letters, numbers, and underscores.");
                isValid = false;
            }

            // Password validation
            if (password.isEmpty()) {
                passwordError.setText("Password cannot be empty.");
                isValid = false;
            }

            // Simulated credential check (replace with real logic if needed)
            if (isValid) {
                if (username.equals("admin") && password.equals("password")) { // Example credentials
                    primaryStage.setScene(HomeScene);

                    // here call the home Scene
                } else {
                    passwordError.setText("Incorrect Username or Password.");
                }
            }
        });

        // StackPane containing the border and form
        StackPane borderPane = new StackPane();
        borderPane.getChildren().addAll(borderView, form);
        borderPane.setAlignment(Pos.CENTER);

        // Position close button in the top-right corner of the border
        StackPane.setAlignment(closeButton, Pos.TOP_RIGHT);
        StackPane.setMargin(closeButton, new Insets(15, 15, 0, 0));

        // Main container
        StackPane root3 = new StackPane();
        root3.getChildren().addAll(backgroundViewL, borderPane, closeButton);

        LogINPage = new Scene(root3, 500, 400);

        //////////////////////////////////////////////////Sign up//////////////////////////////////////////
        Image backgroundImageSI = new Image("file:src//image//background.jpeg");
        ImageView backgroundViewSI = new ImageView(backgroundImageSI);
        backgroundViewSI.setFitWidth(500);
        backgroundViewSI.setFitHeight(400);

        Image borderImageSI = new Image("file:src///image/border.png");
        ImageView borderViewSI = new ImageView(borderImageSI);
        borderViewSI.setFitWidth(420);
        borderViewSI.setFitHeight(320);

        VBox formSI = new VBox(5);
        formSI.setAlignment(Pos.CENTER);

        Text signUpTextSI = new Text("Sign");
        signUpTextSI.setFont(Font.font("Comic Sans MS", 50));
        signUpTextSI.setFill(Color.web("#6CA04E"));

        Text signUpText2SI = new Text("Up");
        signUpText2SI.setFont(Font.font("Comic Sans MS", 50));
        signUpText2SI.setFill(Color.web("#AA7A00"));

        HBox textContainerSI = new HBox(10);
        textContainerSI.setAlignment(Pos.CENTER);
        textContainerSI.getChildren().addAll(signUpTextSI, signUpText2SI);

        TextField idFieldSI = new TextField();
        idFieldSI.setPromptText("ID");
        idFieldSI.setMaxWidth(200);
        Label idErrorSI = new Label();
        idErrorSI.setTextFill(Color.RED);

        TextField nameFieldSI = new TextField();
        nameFieldSI.setPromptText("Name");
        nameFieldSI.setMaxWidth(200);
        Label nameErrorSI = new Label();
        nameErrorSI.setTextFill(Color.RED);

        PasswordField passwordFieldSI = new PasswordField();
        passwordFieldSI.setPromptText("Password");
        passwordFieldSI.setMaxWidth(200);
        Label passwordErrorSI = new Label();
        passwordErrorSI.setTextFill(Color.RED);

        Button signUpButtonSI = new Button("Sign Up");
        signUpButtonSI.setStyle(
                "-fx-background-color: linear-gradient(#FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 15;"
        );

        formSI.getChildren().addAll(textContainerSI, idFieldSI, idErrorSI, nameFieldSI, nameErrorSI, passwordFieldSI, passwordErrorSI, signUpButtonSI);

        Button closeButtonSI = new Button("X");
        closeButtonSI.setStyle("-fx-background-color: transparent; -fx-font-size: 18px; -fx-text-fill: red;");
        closeButtonSI.setOnAction(e -> primaryStage.close());

        signUpButtonSI.setOnAction(e -> {
            idErrorSI.setText("");
            nameErrorSI.setText("");
            passwordErrorSI.setText("");

            String id = idFieldSI.getText().trim();
            String name = nameFieldSI.getText().trim();
            String password = passwordFieldSI.getText().trim();
            boolean isValid = true;

            if (id.isEmpty()) {
                idErrorSI.setText("ID cannot be empty.");
                isValid = false;
            }

            if (name.isEmpty()) {
                nameErrorSI.setText("Name cannot be empty.");
                isValid = false;
            }

            if (password.isEmpty()) {
                passwordErrorSI.setText("Password cannot be empty.");
                isValid = false;
            }

            if (isValid) {
                passwordErrorSI.setTextFill(Color.GREEN);
                passwordErrorSI.setText("Account created successfully!");
                primaryStage.setScene(HomeScene);

            }
        });

        StackPane borderPaneSI = new StackPane();
        borderPaneSI.getChildren().addAll(borderViewSI, formSI);
        borderPaneSI.setAlignment(Pos.CENTER);

        StackPane.setAlignment(closeButtonSI, Pos.TOP_RIGHT);
        StackPane.setMargin(closeButtonSI, new Insets(15, 15, 0, 0));

        StackPane root6 = new StackPane();
        root6.getChildren().addAll(backgroundViewSI, borderPaneSI, closeButtonSI);
          
        btnSignUP2R.setOnAction(e -> {
            primaryStage.setScene(SignupPape);

        });

        SignupPape = new Scene(root6, 500, 400);

        /////////////////////////////////////////////////Setting//////////////////////////////////////////////////////////////
        Image backgroundImageSetting = new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/089918d8-99ff-45de-a084-3fe85d0e3fcc/dg34rsu-29a3d144-dc3f-473e-a949-f73a4ba1ef7c.png/v1/fit/w_608,h_457,q_70,strp/flappy_bird_backdrop_by_lenaxux_dg34rsu-375w-2x.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDU3IiwicGF0aCI6IlwvZlwvMDg5OTE4ZDgtOTlmZi00NWRlLWEwODQtM2ZlODVkMGUzZmNjXC9kZzM0cnN1LTI5YTNkMTQ0LWRjM2YtNDczZS1hOTQ5LWY3M2E0YmExZWY3Yy5wbmciLCJ3aWR0aCI6Ijw9NjA4In1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0._FI7nnUO3ZCIz23z4_juaIbbiEa_LQd1lX6MK-0iUEE");
        ImageView backgroundViewSetting = new ImageView(backgroundImageSetting);
        backgroundViewSetting.setFitWidth(500);
        backgroundViewSetting.setFitHeight(400);

        Button settingsButton = new Button("Setting");
        settingsButton.setFont(Font.font("Arial", 20));
        settingsButton.setTextFill(Color.BLACK);
        settingsButton.setStyle("-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); -fx-font-weight: bold;");
        settingsButton.setLayoutY(100);
        HBox settingsBox = new HBox(settingsButton);
        settingsBox.setAlignment(Pos.CENTER);

        Image birdImage = new Image("file:src//image//IMG_0447.PNG");
        ImageView birdImageView = new ImageView(birdImage);
        birdImageView.setFitWidth(100);
        birdImageView.setFitHeight(100);

        StackPane birdPane = new StackPane();
        birdPane.getChildren().addAll(birdImageView);

        // **Account**8
        Button AccountButton = new Button("Account");
        AccountButton.setTextFill(Color.BLACK);
        AccountButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #87CEFA, #4682B4); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 16px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-border-width: 5px; "
                + "-fx-padding: 5px 5px;"
        );
        VBox AccountBox = new VBox(5, AccountButton);
        AccountBox.setAlignment(Pos.CENTER);

        // *high score***
        Button HighscoreButton = new Button("Highscore");
        HighscoreButton.setTextFill(Color.BLACK);
        HighscoreButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #87CEFA, #4682B4); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 16px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-border-width: 5px; "
                + "-fx-padding: 5px 5px;"
        );
        VBox HighscoreBox = new VBox(5, HighscoreButton);
        HighscoreBox.setAlignment(Pos.CENTER);

        // *Log out**
        Button LogoutButton = new Button("Logout");
        LogoutButton.setTextFill(Color.BLACK);
        LogoutButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #87CEFA, #4682B4); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 16px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 5px 5px;"
        );

        VBox LogoutBox = new VBox(5, AccountButton, HighscoreButton, LogoutButton);
        LogoutBox.setAlignment(Pos.CENTER);
        LogoutBox.setPadding(new Insets(10));

        // ====== supportButton ======
        ImageView supportIcon = new ImageView("https://cdn-icons-png.flaticon.com/512/4233/4233834.png");
        supportIcon.setFitWidth(20);
        supportIcon.setFitHeight(20);

        Button supportButton = new Button("Support");
        supportButton.setTextFill(Color.BLACK);
        supportButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 5px 5px;"
        );

        VBox supportBox = new VBox(5, supportIcon, supportButton);
        supportBox.setAlignment(Pos.CENTER);

        // ====== privacyButton ======
        ImageView privacyIcon = new ImageView("https://cdn-icons-png.flaticon.com/512/4196/4196401.png");
        privacyIcon.setFitWidth(20);
        privacyIcon.setFitHeight(20);

        Button privacyButton = new Button("privacy");
        privacyButton.setTextFill(Color.BLACK);
        privacyButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 5px 5px;"
        );

        VBox privacyBox = new VBox(5, privacyIcon, privacyButton);
        privacyBox.setAlignment(Pos.CENTER);

        // ====== exitButton ======
        ImageView exitIcon = new ImageView("https://cdn-icons-png.flaticon.com/128/5735/5735775.png");
        exitIcon.setFitWidth(20);
        exitIcon.setFitHeight(20);

        Button exitButton = new Button("exit");
        exitButton.setTextFill(Color.BLACK);
        exitButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 20px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 5; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 5px 5px;"
        );

        VBox exitBox = new VBox(5, exitIcon, exitButton);
        exitBox.setAlignment(Pos.CENTER);

        HBox bottomBox = new HBox(20, supportButton, privacyButton, exitButton);
        bottomBox.setAlignment(Pos.CENTER);
        bottomBox.setPadding(new Insets(10));

        VBox layout = new VBox(15, settingsBox, birdPane, LogoutBox, bottomBox);
        layout.setAlignment(Pos.TOP_CENTER);

        StackPane root4 = new StackPane();
        root4.getChildren().addAll(backgroundViewSetting, layout);

        Setting = new Scene(root4, 500, 400);

        ////////////////////////////////////////////Game/////////////////////////////////////////////////////////////////////
        //Game= new Scene(root7, 500, 400);
        
        
        
        
        
        
        
        
        //////////////////////////////////////////////Rank/////////////////////////////////////////////////////////
        class Player {

            String name;
            String id;
            int score;

            public Player(String name, String id, int score) {
                this.name = name;
                this.id = id;
                this.score = score;
            }
        }

        ObservableList<Player> players = FXCollections.observableArrayList(
                new Player("Remas", "0198", 3000),
                new Player("Murooj", "1234", 1500),
                new Player("Refal", "4321", 1300)
        );

        String bgImageUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/089918d8-99ff-45de-a084-3fe85d0e3fcc/dg34rsu-29a3d144-dc3f-473e-a949-f73a4ba1ef7c.png/v1/fit/w_608,h_457,q_70,strp/flappy_bird_backdrop_by_lenaxux_dg34rsu-375w-2x.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDU3IiwicGF0aCI6IlwvZlwvMDg5OTE4ZDgtOTlmZi00NWRlLWEwODQtM2ZlODVkMGUzZmNjXC9kZzM0cnN1LTI5YTNkMTQ0LWRjM2YtNDczZS1hOTQ5LWY3M2E0YmExZWY3Yy5wbmciLCJ3aWR0aCI6Ijw9NjA4In1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0._FI7nnUO3ZCIz23z4_juaIbbiEa_LQd1lX6MK-0iUEE";
        ImageView bgImageView = new ImageView(new Image(bgImageUrl, 500, 400, false, true));
        bgImageView.setFitWidth(500);
        bgImageView.setFitHeight(400);

        Image image = new Image("file:src//image//IMG_0447.PNG");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(60);
        imageView.setFitHeight(60);
        imageView.setPreserveRatio(true);
        imageView.setTranslateY(5);

        Label title = new Label("Rank");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");
        title.setPadding(new Insets(5, 20, 5, 20));

        BorderPane titleContainer = new BorderPane();
        titleContainer.setCenter(title);
        titleContainer.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-padding: 5px;");

        VBox titleBox5 = new VBox(5, imageView, titleContainer);
        titleBox5.setAlignment(Pos.CENTER);

        HBox header = new HBox(80);
        header.setAlignment(Pos.CENTER);
        Label nameHeader = new Label("Name");
        Label scoreHeader = new Label("Score");
        nameHeader.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        scoreHeader.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        header.getChildren().addAll(nameHeader, scoreHeader);

        VBox rankList = new VBox(10);
        rankList.setAlignment(Pos.TOP_CENTER);

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            HBox playerBox = new HBox(20);
            playerBox.setAlignment(Pos.CENTER);
            playerBox.setPadding(new Insets(8));
            playerBox.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-radius: 10px; -fx-border-radius: 10px;");

            Label rankLabel = new Label((i + 1) + ".");
            rankLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: black;");

            VBox nameContainer = new VBox();
            Label nameLabel = new Label(player.name);
            Label idLabel = new Label(player.id);
            nameLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

            if (i == 0) {
                nameLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #FFCC00; -fx-font-weight: bold;");
            } else if (i == 1) {
                nameLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #A8A8A8; -fx-font-weight: bold;");
            } else if (i == 2) {
                nameLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #9E6A3A; -fx-font-weight: bold;");
            }

            idLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: black; -fx-font-weight: bold;");

            nameContainer.getChildren().addAll(nameLabel, idLabel);

            Label scoreLabel = new Label(String.valueOf(player.score));
            scoreLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: black;");

            Region spacer = new Region();
            HBox.setHgrow(spacer, Priority.ALWAYS);

            if (i == 0) {
                ImageView crown = new ImageView(new Image("https://img.icons8.com/color/48/000000/crown.png"));
                crown.setFitWidth(15);
                crown.setFitHeight(15);
                HBox firstPlaceBox = new HBox(5, crown, nameContainer);
                playerBox.getChildren().addAll(rankLabel, firstPlaceBox, spacer, scoreLabel);
            } else {
                playerBox.getChildren().addAll(rankLabel, nameContainer, spacer, scoreLabel);
            }

            rankList.getChildren().add(playerBox);
        }

        ScrollPane scrollPane = new ScrollPane(rankList);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefHeight(170);
        scrollPane.setStyle("-fx-background: transparent; -fx-background-color: transparent;");
        scrollPane.setOpacity(0.8);

        VBox mainContainer = new VBox(15);
        mainContainer.setAlignment(Pos.TOP_CENTER);
        mainContainer.setPadding(new Insets(10));
        mainContainer.getChildren().addAll(titleBox5, header, scrollPane);
        mainContainer.setBackground(Background.EMPTY);

        Image arrowImage = new Image("file:src//image//arww.PNG");
        ImageView arrowImageView = new ImageView(arrowImage);
        arrowImageView.setFitWidth(50);
        arrowImageView.setFitHeight(50);
        arrowImageView.setTranslateY(20);

        Button homeButton = new Button();
        homeButton.setStyle("-fx-background-color: transparent;");
        homeButton.setGraphic(arrowImageView);
        homeButton.setOnAction(e -> {
            System.out.println("Back to Home Page");
            primaryStage.setScene(HomeScene);

        });

        StackPane.setAlignment(homeButton, Pos.BOTTOM_LEFT);
        StackPane.setMargin(homeButton, new Insets(15));

        StackPane root5 = new StackPane();
        root5.getChildren().addAll(bgImageView, mainContainer, homeButton);

        Rank = new Scene(root5, 500, 400);

        //////////////////////////////////////////Game over/////////////////////////////
        VBox layout5 = new VBox(10);
        layout5.setAlignment(Pos.CENTER);
        layout5.setStyle("-fx-padding: 20;");

        String bgImageUrl5 = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/089918d8-99ff-45de-a084-3fe85d0e3fcc/dg34rsu-29a3d144-dc3f-473e-a949-f73a4ba1ef7c.png/v1/fit/w_608,h_457,q_70,strp/flappy_bird_backdrop_by_lenaxux_dg34rsu-375w-2x.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDU3IiwicGF0aCI6IlwvZlwvMDg5OTE4ZDgtOTlmZi00NWRlLWEwODQtM2ZlODVkMGUzZmNjXC9kZzM0cnN1LTI5YTNkMTQ0LWRjM2YtNDczZS1hOTQ5LWY3M2E0YmExZWY3Yy5wbmciLCJ3aWR0aCI6Ijw9NjA4In1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0._FI7nnUO3ZCIz23z4_juaIbbiEa_LQd1lX6MK-0iUEE";
        Image bgImage5 = new Image(bgImageUrl5, 500, 400, false, true);
        BackgroundImage backgroundImage3 = new BackgroundImage(bgImage5, null, null, null, new BackgroundSize(500, 400, false, false, false, false));
        layout5.setBackground(new Background(backgroundImage3));

        HBox header5 = new HBox(10);
        header5.setAlignment(Pos.CENTER);

        ImageView hartIcon = new ImageView(new Image("file:src//image//HeartIcon.png"));
        hartIcon.setFitWidth(50);
        hartIcon.setFitHeight(50);
        hartIcon.setPreserveRatio(true);
        hartIcon.setTranslateX(-100);
        //hartIcon.setTranslateY(); 

        ImageView diamondIcon = new ImageView(new Image("file:src//image//dimo-removebg-preview.png"));
        diamondIcon.setFitWidth(25);
        diamondIcon.setFitHeight(25);
        diamondIcon.setPreserveRatio(true);
        diamondIcon.setTranslateX(50);

        ImageView settingsIcon = new ImageView(new Image("file:src//image//IMG_0461.PNG"));
        settingsIcon.setFitWidth(25);
        settingsIcon.setFitHeight(25);
        settingsIcon.setPreserveRatio(true);
        settingsIcon.setTranslateX(150);

        ImageView backIcon = new ImageView(new Image("file:src//image//rotionicon.png"));
        backIcon.setFitWidth(40);
        backIcon.setFitHeight(40);
        backIcon.setPreserveRatio(true);
        backIcon.setTranslateX(-180);
        backIcon.setTranslateY(130);

        ImageView homeIcon = new ImageView(new Image("file:src//image//HomeIcon.png"));
        homeIcon.setFitWidth(40);
        homeIcon.setFitHeight(40);
        homeIcon.setPreserveRatio(true);
        homeIcon.setTranslateX(0);
        homeIcon.setTranslateY(130);

        Label pointsLabel = new Label("100%");
        pointsLabel.setStyle("-fx-font-size: 16px;");
        pointsLabel.setTranslateX(53);

        header5.getChildren().addAll(hartIcon, diamondIcon, pointsLabel, settingsIcon, backIcon, homeIcon);

        Label titleLabel = new Label("Game Over");
        titleLabel.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        Label scoreTextLabel = new Label("Score:");

        Circle scoreCircle = new Circle(20);
        scoreCircle.setFill(Color.TRANSPARENT);
        scoreCircle.setStroke(Color.BLACK);
        scoreCircle.setStrokeWidth(2);

        Label scoreValueLabel = new Label("50");
        scoreValueLabel.setStyle("-fx-font-size: 20px; -fx-text-fill: black;");

        StackPane scoreBox = new StackPane(scoreCircle, scoreValueLabel);
        scoreBox.setAlignment(Pos.CENTER);

        Label rankingLabel = new Label("Ranking Playing Score");
        rankingLabel.setStyle("-fx-font-size: 20px;");

        List<Player> players3 = new ArrayList<>();
        players3.add(new Player("Remas", "3000", 50));
        players3.add(new Player("Murooj", "1500", 40));
        players3.add(new Player("Refal", "1300", 20));

        VBox rankList3 = new VBox(5);
        rankList3.setAlignment(Pos.TOP_CENTER);
        rankList3.setPadding(new Insets(10));

        for (int i = 0; i < players3.size(); i++) {
            Player player = players3.get(i);
            HBox playerBox = new HBox(20);
            playerBox.setAlignment(Pos.CENTER);
            playerBox.setPadding(new Insets(5));
            playerBox.setStyle("-fx-border-color: rgba(0, 0, 0, 0.5); -fx-border-width: 1px; -fx-background-radius:10px; -fx-border-radius: 10px; -fx-background-color: rgba(255, 255, 255, 0.7);");

            Label rankLabel = new Label((i + 1) + ".");
            rankLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: black;");

            VBox nameContainer = new VBox();
            Label nameLabel = new Label(player.name);
            Label idLabel = new Label(player.id);
            nameLabel.setStyle("-fx-font-size: 12px; -fx-font-weight: bold;");

            if (i == 0) {
                nameLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #FFCC00; -fx-font-weight: bold;");
            } else if (i == 1) {
                nameLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #A8A8A8; -fx-font-weight: bold;");
            } else if (i == 2) {
                nameLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #9E6A3A; -fx-font-weight: bold;");
            }

            idLabel.setStyle("-fx-font-size: 10px; -fx-text-fill: black; -fx-font-weight: bold;");

            nameContainer.getChildren().addAll(nameLabel, idLabel);

            Label playerScoreLabel = new Label(String.valueOf(player.score));
            playerScoreLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: black;");

            Region spacer = new Region();
            HBox.setHgrow(spacer, Priority.ALWAYS);

            if (i == 0) {
                ImageView crown = new ImageView(new Image("https://img.icons8.com/color/48/000000/crown.png"));
                crown.setFitWidth(15);
                crown.setFitHeight(15);
                HBox firstPlaceBox = new HBox(5, crown, nameContainer);
                playerBox.getChildren().addAll(rankLabel, firstPlaceBox, spacer, playerScoreLabel);
            } else {
                playerBox.getChildren().addAll(rankLabel, nameContainer, spacer, playerScoreLabel);
            }

            rankList3.getChildren().add(playerBox);
        }

        ScrollPane scrollPane1 = new ScrollPane(rankList3);
        scrollPane1.setFitToWidth(true);
        scrollPane1.setPrefHeight(80);
        scrollPane1.setStyle("-fx-background: transparent; -fx-background-color: transparent;");

        HBox nameScoreHeader = new HBox();
        Label nameHeaderLabel = new Label("Name");
        nameHeaderLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px; -fx-pref-width: 200px;");
        Label scoreHeaderLabel = new Label("Score");
        scoreHeaderLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px; -fx-pref-width: 100px;");
        nameScoreHeader.getChildren().addAll(nameHeaderLabel, scoreHeaderLabel);
        nameScoreHeader.setAlignment(Pos.CENTER);

        Button nextButton = new Button("Next");
        nextButton.setStyle(
                "-fx-background-color: linear-gradient(to bottom, #FFD700, #FFA500); "
                + "-fx-text-fill: black; "
                + "-fx-font-size: 15px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 15; "
                + "-fx-border-width: 3px; "
                + "-fx-padding: 10px 10px;"
        );
        nextButton.setOnAction(e -> {
            System.out.println("Next button clicked");
        });

        layout5.getChildren().addAll(header5, titleLabel, scoreTextLabel, scoreBox, rankingLabel, nameScoreHeader, scrollPane1, nextButton);

        GameOver = new Scene(layout5, 500, 400);

        
        /////////////////////////////////////////Event////////////////////////////////////
        
        
        playWithFriendsV.setOnMouseClicked(e -> {
            primaryStage.setScene(Rank);

        });

        ///LINK PAGE
        btnPlay.setOnAction(e -> {
            primaryStage.setScene(Game);
        });

        settingV.setOnMouseClicked(event -> {
            primaryStage.setScene(Setting);

        });

        settingVR.setOnMouseClicked(e -> {
            primaryStage.setScene(Setting);

        });

        btnLogInR.setOnAction(event -> {
            primaryStage.setScene(LogINPage);
            btnLogInR.setFocusTraversable(false);

        });
        
        

        homeIcon.setOnMouseClicked(e -> {
            primaryStage.setScene(HomeScene);

        });

        backIcon.setOnMouseClicked(e -> {
            primaryStage.setScene(Game);

        });

        arrowImageView.setOnMouseClicked(e -> {
            primaryStage.setScene(HomeScene);

        });
        
        LogoutButton.setOnAction(event -> {
            primaryStage.setScene(Registration);
             LogoutButton.setFocusTraversable(false);
        });

        /////////////////////////////////////////////////////////////////////////////////////     
        
        
        
        
        
        
//primay scen
        primaryStage.setScene(Registration);
        primaryStage.setTitle(" FlappyBirdGame");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
