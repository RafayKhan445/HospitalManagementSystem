package project1;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
 
	Stage stage;
	Scene scene;
	@Override
	public void start(Stage s) throws Exception {
		// TODO Auto-generated method stub
		stage = s;
		stage.setTitle("Hospital Management System");
		stage.setHeight(600);
		stage.setWidth(900);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
private void addComponents() {
		// TODO Auto-generated method stub
	Font f;
	f= Font.font("Calibri",FontWeight.BOLD, 14);
	Label select=new Label("Select:");
	select.setStyle("-fx-font: normal bold 24px 'serif'");
	Button btn1=new Button("Doctors");
	Button btn2=new Button("Laboratory");
	Button btn3=new Button("Appointment");
	Button btn4=new Button("Pharmacy");
    btn1.setPrefSize(150, 50);
	btn2.setPrefSize(150, 50);
	btn3.setPrefSize(150, 50);
	btn4.setPrefSize(150, 50);
	btn1.setFont(f);
	btn2.setFont(f);
	btn3.setFont(f);
	btn4.setFont(f);
	btn1.setStyle("-fx-background-color: #D8FCF5; -fx-textfill: Red;");
	btn2.setStyle("-fx-background-color: D8FCF5; -fx-textfill: red;");
	btn3.setStyle("-fx-background-color: D8FCF5; -fx-textfill: red;");
	btn4.setStyle("-fx-background-color: D8FCF5; -fx-textfill: red;");
	
    GridPane g=new GridPane();
    g.setAlignment(Pos.BASELINE_CENTER);
	Text t=new Text("\t The Clinic Hospital \n \t  Select Any Option ");
	t.setStyle("-fx-font: normal bold 36px 'serif' ");
	
	
	VBox vb=new VBox();
	//hb.setStyle("-fx-background-color: MAROON;");
	vb.setPadding(new Insets(140,120,0,40));
    vb.getChildren().addAll(btn1,btn2,btn3,btn4);
	vb.setSpacing(10);
	
    BorderPane bd=new BorderPane();
   // bd.setStyle("-fx-background-color: MAROON;");
   
    bd.setTop(t);
    bd.setAlignment(t,Pos.CENTER);
  
 
    bd.setCenter(vb);
   // bd.setStyle("-fx-background-image: url('pic_1528453509.jpg'); "
    //		+ "-fx-background-position: center center; "
    	//	+ "-fx-background-repeat: stretch;");
    //Setting image
    Image image = new Image("file:/C:\\Users\\Rafay Khan\\eclipse-workspace\\project1\\images\\h.jpg");    
    //Setting the image view 
    ImageView imageView = new ImageView(image); 
    BackgroundSize bsize =new BackgroundSize(800, 400, true, true, true, true);
    bd.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
    
   
	scene=new Scene(bd);
	//scene.getStylesheets().add("Mystyle.css");
	

	btn1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			
			new doctor();
		}
		
		
		
		
		
	});
	btn2.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Show.low = "3000";
			Show.high = "4200";
			Show.medium = "5000";
			new lab();
		}
		
		
		
		
		
	});
	btn3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Show.low = "500";
			Show.high = "800";
			Show.medium = "1200";
			new appointment();
		}
		
		
		
		
		
	});
	btn4.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			new medicines();
		}
		
		
		
		
		
	});
	
	

	}






public static void main(String[] args) {
	// TODO Auto-generated method stub
launch(args);
}


}