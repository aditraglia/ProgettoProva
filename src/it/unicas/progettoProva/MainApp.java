package it.unicas.progettoProva;

import it.unicas.progettoProva.model.Colleghi;
import it.unicas.progettoProva.view.ColleghiOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    private ObservableList<Colleghi> colleghiData = FXCollections.observableArrayList();

    public MainApp(){
        // Add some sample data
        colleghiData.add(new Colleghi("Hans", "Muster"));
        colleghiData.add(new Colleghi("Ruth", "Mueller"));
        colleghiData.add(new Colleghi("Heinz", "Kurz"));
        colleghiData.add(new Colleghi("Cornelia", "Meier"));
        colleghiData.add(new Colleghi("Werner", "Meyer"));
        colleghiData.add(new Colleghi("Lydia", "Kunz"));
        colleghiData.add(new Colleghi("Anna", "Best"));
        colleghiData.add(new Colleghi("Stefan", "Meier"));
        colleghiData.add(new Colleghi("Martin", "Mueller"));
    }


    public ObservableList<Colleghi> getColleghiData(){return  colleghiData;}


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ColleghiApp");

        initRootLayout();

        showColleghiOverview();
    }

    /**
     * Initializes the root layout
     */
    public void initRootLayout(){
        try{
            //Load root layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            this.primaryStage.getIcons().add(new Image("file:resources/images/icon.png"));

            rootLayout = (BorderPane) loader.load();

            //Show the scene containing the root layout
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Shows the colleghi overview inside the root layout
     */

    public void showColleghiOverview(){
        try{
            //Load colleghi overview
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ColleghiOverview.fxml"));
            AnchorPane colleghiOverview = (AnchorPane) loader.load();

            //Set colleghi overview into the center of root layout
            rootLayout.setCenter(colleghiOverview);

            //Give the controller access to the main app.
            ColleghiOverviewController controller = loader.getController();
            controller.setMainApp(this);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Returns the main Stage
     * @return
     */

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
