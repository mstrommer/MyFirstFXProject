module at.ac.fhcampuswien.myfirstfxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens at.ac.fhcampuswien.myfirstfxproject to javafx.fxml;
    exports at.ac.fhcampuswien.myfirstfxproject;
}