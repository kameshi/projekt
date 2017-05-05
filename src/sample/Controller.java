package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

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
    protected ChoiceBox<String> warunkiAChB;
    @FXML
    protected ChoiceBox<String> rodzajNChB;

    private TextField[] field = {pojemnoscT, mocT, wagaT, maksymalnaPT, szerokooscOT, sredniaPWT, temperaturaNT};

    Obsluga obsluga = new Obsluga();

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

        UnaryOperator<TextFormatter.Change> filter = change -> {
            String text = change.getText();

            if (text.matches("[0-9]*+[.]*")) {
                return change;
            }

            return null;
        };
        TextFormatter<String> textFormatter = new TextFormatter<>(filter);
        for(int i = 0; i < 7; i++)
        {
            //field[i].setTextFormatter(textFormatter);
        }
    }

    @FXML
    protected void symulujOnA()
    {
        System.out.println(field[0].getText());
        obsluga.dodajDane(0,pojemnoscT.getText());
        obsluga.dodajDane(1,mocT.getText());
        obsluga.dodajDane(2,wagaT.getText());
        obsluga.dodajDane(3,maksymalnaPT.getText());
        obsluga.dodajDane(4,szerokooscOT.getText());
        obsluga.dodajDane(5,sredniaPWT.getText());
        obsluga.dodajDane(6,temperaturaNT.getText());
        obsluga.dodajDane(7,rodzajOChB.getValue());
        obsluga.dodajDane(8,warunkiAChB.getValue());
        obsluga.dodajDane(9,rodzajNChB.getValue());
    }

    @FXML
    protected  void zapiszOnA()
    {

    }

    @FXML
    protected  void zakonczOnA()
    {

    }

    public void pojemnoscOnA() {
    }
}
