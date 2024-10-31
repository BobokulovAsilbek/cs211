package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Button buttonOk = new Button("OK");


        GridPane gridPane = new GridPane();

        Scene scene = new Scene(gridPane, 200, 250);
        stage.setScene(scene);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(15, 15, 15, 15));
        Label login = new Label("Login");
        TextField loginT = new TextField();
        Label password = new Label("Password");
        PasswordField passwordField = new PasswordField();
        CheckBox checkBox = new CheckBox("Remember me");
        Button loginB = new Button("Login");
        Button cancel = new Button("Cancel");
        gridPane.setHgap(10);
        gridPane.setVgap(20);
        gridPane.add(login, 0, 0);
        gridPane.add(loginT, 0, 0);
        gridPane.add(password, 0, 0);
        gridPane.add(passwordField, 0, 0);
        gridPane.add(checkBox, 0, 0);
        gridPane.add(loginB, 0, 0);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}




//modeule info java
module RMS {
    requires javafx.controls;
    requires javafx.graphics;
    requires java.desktop;
    opens org.example;
}

//pom xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>untitled</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>22</maven.compiler.source>
        <maven.compiler.target>22</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>22.0.1</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>22.0.1</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>22</source>
                    <target>22</target>
                    <compilerArgs>--enable-preview</compilerArgs>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
