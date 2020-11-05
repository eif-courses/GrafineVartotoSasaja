package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;

import javax.swing.*;


public class MainWindowController {
  @FXML
  private Button button;

  @FXML
  private MenuItem close_menu_item;

  @FXML
  private ColorPicker colorPicker;


  @FXML
  private DatePicker datePicker;

  @FXML
  void mygtukasPaspaustas(ActionEvent event) {
    button.setStyle("-fx-background-color: blue");
  }

  @FXML
  void uzdaryti(ActionEvent event) {
    JOptionPane.showMessageDialog(null, "Uzdareme");
  }
}
