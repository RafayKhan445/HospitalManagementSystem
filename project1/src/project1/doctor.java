package project1;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class doctor {

	Stage stage;
	Scene scene;
	TextField txtcnic=new TextField();
    int i=0;
  doctor(){
	  stage= new Stage();
		stage.setTitle("Clinic Doctors");
		stage.setHeight(500);
		stage.setWidth(700);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	private void addComponents() {
		// TODO Auto-generated method stub
		Text text = new Text("dr rafay");
		text.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,FontPosture.REGULAR,18));
		text.setX(150);
		text.setY(100);
		  GridPane g=new GridPane();
		  Text s=new Text("\t \t   \t   \tDOCTORS INFORMATION");
			s.setStyle("-fx-font: normal bold 24px 'serif' ");
			Text t=new Text("\nDr.Rafay Ahmed Khan \n(MBBS,Cardiologists, DOW University)");
			t.setStyle("-fx-font: normal bold 20px 'serif' ");
			Text u=new Text("\nDr.Usman Shinwari \n(MBBS,Ophthalmologists, Jinnah University)");
			u.setStyle("-fx-font: normal bold 20px 'serif' ");
			Text v=new Text("\nDr.Noman Asghar \n(Gastroenterologists, Agha Khan University)");
			v.setStyle("-fx-font: normal bold 20px 'serif' ");
			Text w=new Text("\nDr.Ajay Kumar \n(MBBS,Cardiologists KMDC University)");
			w.setStyle("-fx-font: normal bold 20px 'serif' ");
			Text x=new Text("\nDr.Shaheen Shah \n(Cardiologist, DOW University)");
			x.setStyle("-fx-font: normal bold 20px 'serif' ");
			g.add(s,0,0);
			g.add(t,0,1);
			g.add(u,0,2);
			g.add(v,0,3);
			g.add(w,0,4);
			g.add(x,0,5);
			  
			    Image image = new Image("file:/C:\\Users\\Rafay Khan\\eclipse-workspace\\project1\\images\\doc.jpg");
			    ImageView imageView = new ImageView(image); 
			    BackgroundSize bsize =new BackgroundSize(800, 400, true, true, true, true);
			    g.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
			    
			   
			
			    scene=new Scene(g);
		
	}
}
