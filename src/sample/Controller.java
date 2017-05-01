package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    protected TextField pojemnoscT;
    @FXML
    protected TextField mocT;
    @FXML
    protected TextField wagaT;
    @FXML
    protected TextField maksymalnaPT;
    @FXML
    protected TextField szerokooscOT;
    @FXML
    protected TextField sredniaPWT;
    @FXML
    protected TextField temperaturaNT;
    @FXML
    protected ChoiceBox<String> rodzajOChB;
    @FXML
    protected ChoiceBox warunkiAChB;
    @FXML
    protected ChoiceBox rodzajNChB;

    private String[] dane = new String[9];

    @FXML
    public void initialize() {
        ObservableList<String> rodzajOL = FXCollections.observableArrayList();
        rodzajOL.add("letnie");
        rodzajOL.add("zimowe");
        rodzajOL.add("wielosezonowe");
        rodzajOChB.setItems(rodzajOL);

        ObservableList<String> warunkiAL = FXCollections.observableArrayList();
        warunkiAL.add("deszcz");
        warunkiAL.add("śnieg");
        warunkiAL.add("słońce");
        warunkiAL.add("gołoleć");
        warunkiAChB.setItems(warunkiAL);

        ObservableList<String> rodzajNL = FXCollections.observableArrayList();
        rodzajNL.add("asfalt");
        rodzajNL.add("beton");
        rodzajNL.add("błoto");
        rodzajNL.add("piasek");
        rodzajNL.add("trawnik");
        rodzajNChB.setItems(rodzajNL);

    }

    @FXML
    protected void symulujOnA()
    {
        dane[0] = pojemnoscT.getText();
        dane[1] = mocT.getText();
        dane[2] = wagaT.getText();
        dane[3] = maksymalnaPT.getText();
        dane[4] = szerokooscOT.getText();
        dane[5] = sredniaPWT.getText();
        dane[6] = temperaturaNT.getText();

    }

    @FXML
    protected  void zapiszOnA()
    {

    }

    @FXML
    protected  void zakonczOnA()
    {

    }
}
