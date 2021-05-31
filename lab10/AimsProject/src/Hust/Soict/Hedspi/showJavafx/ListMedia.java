package src.Hust.Soict.Hedspi.showJavafx;
import Media.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class ListMedia extends Application {
 
  @Override
  public void start(Stage stage) {

        Book bk1 = new Book(2,"Star Wars", "Science Fiction", 88.7f);
        Book bk2 = new Book(4,"Terminator 2: Judgment Day", "Action Movie", 111.9f);
        Book bk3 = new Book(6,"Inception", "Action Movie",33.2f);
        Book bk4 = new Book(8,"One Piece", "Action Movie",70.8f);
        Book bk5 = new Book(10,"Dragon","Action Movie",323.9f); 
 
 
      // Một danh sách
      ObservableList<Book> books = FXCollections.observableArrayList(bk1, bk2, bk3,bk4,bk5);
 
      // Tạo một ListView
      ListView<Book> listView = new ListView<Book>(books);
 
      // Chỉ cho phép lựa chọn 1 dòng trên danh sách.
      listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

      // Cho phép lựa chọn nhiều dòng trên danh sách.
      listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
 
 
      StackPane root = new StackPane();
      root.getChildren().add(listView);
 
      stage.setTitle("ListMedia");
 
      Scene scene = new Scene(root, 700, 400);
      stage.setScene(scene);
      stage.show();
  }
 
  public static void main(String[] args) {
      launch(args);
  }
}