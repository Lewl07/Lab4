// https://github.com/Lewl07/Lab4.git

package leo.lab04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 * https://github.com/Lewl07/Lab4.git
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        
        Label daysOnTrip = new Label("Number of days on the trip: ");
        TextField daysOnTripTxt = new TextField();
        gridPane.add(daysOnTrip, 0, 0);
        gridPane.add(daysOnTripTxt, 1, 0);
        
        Label amountOfAirfare = new Label("Amount of airfare, if any: ");
        TextField amountOfAirfareTxt = new TextField();
        gridPane.add(amountOfAirfare, 0, 1);
        gridPane.add(amountOfAirfareTxt, 1, 1);
        
        Label amountCarRentalFees = new Label("Amount of car rental fees, if any: ");
        TextField amountCarRentalFeesTxt = new TextField();
        gridPane.add(amountCarRentalFees, 0, 2);
        gridPane.add(amountCarRentalFeesTxt, 1, 2);
        
        Label numOfMiles = new Label("Number of miles driven, if a private vehicle was used: ");
        TextField numOfMilesTxt = new TextField();
        gridPane.add(numOfMiles, 0, 3);
        gridPane.add(numOfMilesTxt, 1, 3);
        
        Label parkingFees = new Label("Amount of parking fees, if any: ");
        TextField parkingFeesTxt = new TextField();
        gridPane.add(parkingFees, 0, 4);
        gridPane.add(parkingFeesTxt, 1, 4);
        
        Label taxiCharges = new Label("Amount of taxi charges, if any: ");
        TextField taxiChargesTxt = new TextField();
        gridPane.add(taxiCharges, 0, 5);
        gridPane.add(taxiChargesTxt, 1, 5);
        
        Label conferenceFees = new Label("Conference or seminar registration fees, if any: ");
        TextField conferenceFeesTxt = new TextField();
        gridPane.add(conferenceFees, 0, 6);
        gridPane.add(conferenceFeesTxt, 1, 6);
        
        Label lodgingCharges = new Label("Lodging charges, per night: ");
        TextField lodgingChargesTxt = new TextField();
        gridPane.add(lodgingCharges, 0, 7);
        gridPane.add(lodgingChargesTxt, 1, 7); 
        
        Button calculateBtn = new Button("Calculate");
        gridPane.add(calculateBtn, 1, 8);
        
        calculateBtn.setOnAction(event -> 
        {
            
        });
        
        Scene scene = new Scene(gridPane, 600, 400);
        stage.setTitle("Business Trip");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }

}