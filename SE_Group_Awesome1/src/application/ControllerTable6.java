package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ControllerTable6 implements Initializable {
	
	@FXML 
	public Button MenuOptions1;
	
	@FXML 
	public Button CurrentOrder;
	
	@FXML 
	public Button Back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		MenuOptions1.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
			}
		});
		
		CurrentOrder.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				
			}
		});
		Back.setOnAction(new EventHandler<ActionEvent> ()
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Main.Scenes.DisplayLoginScene();
				//Main.dbconnect. 	
			}
		});

		
}
}
