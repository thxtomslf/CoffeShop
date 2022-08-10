module com.example.shop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shop to javafx.fxml;
    exports com.example.shop;
    exports com.example.shop.Controllers;
    opens com.example.shop.Controllers to javafx.fxml;
}