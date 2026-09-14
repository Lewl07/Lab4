package leo.lab04;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label daysOnTrip = new Label("Number of days on the trip: ");
        Label amountOfAirfare = new Label("Amount of airfare, if any: ");
        Label amountCarRentalFees = new Label("Amount of car rental fees, if any: ");
        Label numOfMiles = new Label("Number of miles driven, if a private vehicle was used: ");
        Label parkingFees = new Label("Amount of parking fees, if any: ");
        Label taxiCharges = new Label("Amount of taxi charges, if any: ");
        Label conferenceFees = new Label("Conference or seminar registration fees, if any: ");
        Label lodgingCharges = new Label("Lodging charges, per night: ");
    }

    public static void main(String[] args) {
        launch();
    }

}