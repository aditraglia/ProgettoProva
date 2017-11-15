package it.unicas.progettoProva.view;

import it.unicas.progettoProva.MainApp;
import it.unicas.progettoProva.model.Colleghi;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * Created by Antonio on 03/11/2017.
 */
public class ColleghiOverviewController {

    @FXML
    private TableView<Colleghi> colleghiTable;
    @FXML
    private TableColumn<Colleghi, String> nomeColumn;
    @FXML
    private  TableColumn<Colleghi, String> cognomeColumn;

    @FXML
    private Label nomeLabel;
    @FXML
    private Label cognomeLabel;
    @FXML
    private Label telefonoLabel;

    //Reference to the main application
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method
     */
    public ColleghiOverviewController(){}

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded
     */
    /*@FXML
    private void initialize(){
        //Initialize the colleghi table with the two columns.
        nomeColumn.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        cognomeColumn.setCellValueFactory(cellData -> cellData.getValue().cognomeProperty());
    }*/

    /**
     * Is called by the main application to give a reference back to itself
     *
     * @param  mainApp
     */
    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;

        //Add observable list data to the table
        colleghiTable.setItems(mainApp.getColleghiData());
    }
}


