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
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class appointment {

	Stage stage;
	Scene scene;
	TextField txtcnic=new TextField();
    int i=0;
  appointment(){
	  stage= new Stage();
		stage.setTitle("The Clinic Appointment");
		stage.setHeight(500);
		stage.setWidth(500);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	private void addComponents() {
		// TODO Auto-generated method stub
		Text text = new Text("The Clinic Hospital");
		text.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,FontPosture.REGULAR,18));
		text.setX(150);
		text.setY(100);
		
		Font f;
		f= Font.font("Calibri",FontWeight.BOLD, 14);
	
		Label name=new Label("Name");
		TextField txtname=new TextField();
		Label phone=new Label("Phone No.");
		TextField txtphone=new TextField();
		Tooltip phonetip = new Tooltip("e.g: 0300-1234567");
		txtphone.setTooltip(phonetip);
		Label cnic=new Label("CNIC:");
		Tooltip cnictip = new Tooltip("e.g: 45101-12345670-8");
		txtcnic.setTooltip(cnictip);
		Label date =new Label("Date:");
		DatePicker datepicker=new DatePicker();
		RadioButton bclass=new RadioButton("Guslshan Branch");
		RadioButton eclass=new RadioButton("Nazimabad");
		RadioButton local=new RadioButton("Saddar Branch");
		
		ToggleGroup group=new ToggleGroup();
		bclass.setToggleGroup(group);
		eclass.setToggleGroup(group);
		local.setToggleGroup(group);
		
		Label from=new Label("Doctor");
		ComboBox<String> cmb = new ComboBox<>();
		cmb.setItems(FXCollections.observableArrayList("Dr.Rafay","Dr.Usman","Dr.Ajay","Dr.Noman","Dr.Shaheen"));
		
		Label timings=new Label("Timings:");
		RadioButton rb1 = new RadioButton("9:45PM");
		RadioButton rb2 = new RadioButton("3:45PM");
		RadioButton rb3 = new RadioButton("6:45PM");
		RadioButton rb4 = new RadioButton("11:45PM");
		RadioButton rb5 = new RadioButton("1:45PM");
		RadioButton rb6 = new RadioButton("9:45PM");
		ToggleGroup gp=new ToggleGroup();
		rb1.setToggleGroup(gp);
		rb2.setToggleGroup(gp);
		rb3.setToggleGroup(gp);
		rb4.setToggleGroup(gp);
		rb5.setToggleGroup(gp);
		rb6.setToggleGroup(gp);
		
		Button confirmdetails=new Button("Confirm Details");
		Button print=new Button("Print Reciept");
		confirmdetails.setStyle("-fx-background-color: Grey; -fx-textfill: white;");
		print.setStyle("-fx-background-color: Grey; -fx-textfill: white;");
		confirmdetails.setFont(f);
		print.setFont(f);
		
		name.setFont(f);
		phone.setFont(f);
		cnic.setFont(f);
		date.setFont(f);
		timings.setFont(f);
		from.setFont(f);
		//to.setFont(f);
		bclass.setFont(f);
		eclass.setFont(f);
		local.setFont(f);
		rb1.setFont(f);
		rb2.setFont(f);
		rb3.setFont(f);
		rb4.setFont(f);
		rb5.setFont(f);
		rb6.setFont(f);
		
        GridPane grid=new GridPane(); 
		grid.setAlignment(Pos.BASELINE_CENTER);
		Image image = new Image("file:/C:\\Users\\dell\\Desktop\\u.jpg");    
	    ImageView imageView = new ImageView(image); 
	    BackgroundSize bsize =new BackgroundSize(500, 500, true, true, true, true);
	    grid.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
		////grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(10);
		grid.setHgap(10);
		
		grid.add(name, 0, 3);
		grid.add(txtname, 1, 3);
	
		grid.add(phone, 0, 4);
		grid.add(txtphone, 1, 4);
		
		grid.add(cnic, 0, 5);
		grid.add(txtcnic, 1, 5); 
		
		grid.add(date, 0, 6);
		grid.add(datepicker, 1, 6);
		
		grid.add(bclass, 0, 7);
		grid.add(eclass, 1, 7);
		grid.add(local, 1, 7);
		GridPane.setMargin(local, new Insets(0,0,0,105));
		
		grid.add(from, 0, 8);
		grid.add(cmb, 1, 8);
		//grid.add(to, 2, 8);
		//grid.add(cmb1, 3, 8);
		
		grid.add(timings, 0, 9);
		grid.add(rb1, 1, 9);
		grid.add(rb2, 1, 10);
		grid.add(rb3, 1,11);
		grid.add(rb4, 1, 9);
		GridPane.setMargin(rb4, new Insets(0,0,0,70));
		grid.add(rb5, 1, 10);
		GridPane.setMargin(rb5, new Insets(0,0,0,70));
		grid.add(rb6, 1,11);
		GridPane.setMargin(rb6, new Insets(0,0,0,70));
		
		grid.add(confirmdetails, 0, 12);
		grid.add(print, 1, 12);

		
		confirmdetails.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				
				int c = 0;
				if(c==1)
				{
					Alert msg =new Alert(AlertType.INFORMATION);
					msg.setHeaderText("Invalid Format");
					msg.setContentText("Invalid Information");
					msg.show();
					stage.hide();
				}
				else
				{
					try
					{
						Show.name = txtname.getText();
						Show.phone = txtphone.getText();
						Show.cnic = txtcnic.getText();
						Show.date = datepicker.getValue().toString();
						if(bclass.isSelected())
						{
							Show.type = "Gulshan Branch";
							Show.price = Show.high;
						}
						if(eclass.isSelected())
						{
							Show.type = "Nazimabad";
							Show.price = Show.low;
						}
						if(local.isSelected())
						{
							Show.type = "Saddar Branch";
							Show.price = Show.medium;
						}
						Show.From = cmb.getValue();
			//			Show.to = cmb1.getValue();
						if(Show.From.equals(Show.to))
						{
							i = 1;
						}
						
						if(rb1.isSelected())
							Show.timings += rb1.getText()+".  " ;
						else if(rb2.isSelected())
							Show.timings += rb2.getText()+".";
						else if(rb1.isSelected())
							Show.timings += rb3.getText()+".  " ;
						else if(rb2.isSelected())
							Show.timings += rb4.getText()+".";
						else if(rb1.isSelected())
							Show.timings += rb5.getText()+".  " ;
						else if(rb2.isSelected())
							Show.timings += rb6.getText()+".";
						;
						Show.checkRoute(i);
						i=0;
					}
					catch(NullPointerException e)
					{
						Alert msg =new Alert(AlertType.INFORMATION);
						msg.setHeaderText("Empty Fields");
						msg.setContentText("Please Fill Out All Fields");
						msg.show();
					}
				}
			}});
		
		print.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
			
				try
				{
					Filing f = new Filing();
					f.writeDetails();
					new Show();
					stage.hide();
				}
				catch(NullPointerException e)
				{
					Alert msg =new Alert(AlertType.ERROR);
					msg.setHeaderText("Error");
					msg.setContentText("Please Confirm your Details");
					msg.show();
				}
				catch (IOException e) {
				}
				
			}
			
		});
		
		
		scene=new Scene(grid);
		

		
		
		
}
}
	