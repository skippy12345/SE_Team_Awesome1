package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class sceneContainer 
{

	Stage stage;
	
	HBox loginPane; 
	Scene LoginScene;
	
	HBox ClockInOutPane;
	Scene ClockInOutScene;
	
	HBox BreakfastPane; 
	Scene BreakfastScene; 
	
	HBox BreakfastMasterpiecesPane; 
	Scene BreakfastMasterpiecesScene;
	
	HBox CountryFavoritesPane; 
	Scene CountryFavoriteScene; 
	
	HBox FamousBenedictsPane; 
	Scene FamousBenedictsScene; 
	
	HBox HealthyChoicesPane;
	Scene HealthyChoicesScene;
	
	AnchorPane HomePane;
	Scene HomeScene;
	
	HBox HotOffTheGriddlePane;
	Scene HotOffTheGriddleScene;
	
	HBox MexicanCuisinePane;
	Scene MexicanCuisineScene; 
	
	HBox MenuOptionsPane;
	Scene MenuOptionsScene;
	
	HBox OmeletsPane; 
	Scene OmeletsScene;
	
	HBox SkilletsPane; 
	Scene SkilletsScene; 
	
	HBox StartersPane;
	Scene StartersScene; 
	
	AnchorPane ToppingsPane;
	Scene ToppingsScene; 
	
	HBox BeveragesPane;
	Scene BeveragesScene;
	
	HBox SaladsPane;
	Scene SaladsScene;
	
	HBox BreakfastSandwichesPane;
	Scene BreakfastSandwichesScene; 
	
	HBox ClassicSandwichesPane;
	Scene ClassicSandwichesScene;
	
	HBox LunchOptionsPane;
	Scene LunchOptionsScene;
	
	HBox PaninisPane;
	Scene PaninisScene;
	
	HBox QuesadillasPane;
	Scene QuesadillasScene;
	
	HBox SpecialtySandwichesPane;
	Scene SpecialtySandwichesScene;
	
	HBox TwoHandedBurgersPane;
	Scene TwoHandedBurgersScene;
	
	HBox WrapsPane;
	Scene WrapsScene;
	
	HBox OrderPane;
	Scene OrderScene;
	
	
	sceneContainer() // constructor 
	{
		stage = new Stage(); 
		
		try {
			loginPane = FXMLLoader.load(getClass().getResource("FXML_Login.fxml"));
		} catch (IOException e) {
			System.out.println("The Login FXML did not load correctly"); 
			e.printStackTrace();
		} 
		
		try {
			ClockInOutPane = FXMLLoader.load(getClass().getResource("Clock.fxml"));
		} catch (IOException e) {
			System.out.println("The Clock FXML did not load correctly"); 
			e.printStackTrace();
		}
		try {														
			BreakfastPane = FXMLLoader.load(getClass().getResource("FXML_Breakfast.fxml"));
		} catch (IOException e) {
			System.out.println("The BreakfastScene FXML did not load correctly"); 
			e.printStackTrace();
		}
		 
		try {
			BreakfastMasterpiecesPane = FXMLLoader.load(getClass().getResource("FXML_BreakfastMasterpieces.fxml"));
		} catch (IOException e) {
			System.out.println("The BreakfastMasterpieces FXML did not load correctly"); 
			e.printStackTrace();
		}
		try {
			BreakfastSandwichesPane  = FXMLLoader.load(getClass().getResource("FXML_BreakfastSandwiches.fxml"));
			} catch (IOException e) {
			System.out.println("The Breakfast Sandwiches FXML did not load correctly");
			e.printStackTrace();
			}
		
		try {
			CountryFavoritesPane = FXMLLoader.load(getClass().getResource("FXML_CountryFavorites.fxml"));
		} catch (IOException e) {
			System.out.println("The CountryFavorites FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			FamousBenedictsPane = FXMLLoader.load(getClass().getResource("FXML_FamousBenedicts.fxml"));
		} catch (IOException e) {
			System.out.println("The Famous Benedict FXML did not load correctly");
			e.printStackTrace();
		}
		
		try {
			HomePane  = FXMLLoader.load(getClass().getResource("FXML_Home.fxml"));
		} catch (IOException e) {
			System.out.println("Home FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			HotOffTheGriddlePane  = FXMLLoader.load(getClass().getResource("FXML_HotOffTheGriddle.fxml"));
		} catch (IOException e) {
			System.out.println("HotOffTheGriddleScene did not load correctly");
			e.printStackTrace();
		}
		try {
			MenuOptionsPane  = FXMLLoader.load(getClass().getResource("FXML_MenuOptions.fxml"));
		} catch (IOException e) {
			System.out.println("MenuOptions did not load correctly");
			e.printStackTrace();
		}
		
		try {
			MexicanCuisinePane  = FXMLLoader.load(getClass().getResource("FXML_MexicanCuisine.fxml"));
		} catch (IOException e) {
			System.out.println("Home MexicanCuisinePane did not load correctly");
			e.printStackTrace();
		}
		try {
			OmeletsPane  = FXMLLoader.load(getClass().getResource("FXML_Omelets.fxml"));
		} catch (IOException e) {
			System.out.println("Home OmeletsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			SkilletsPane  = FXMLLoader.load(getClass().getResource("FXML_Skillets.fxml"));
		} catch (IOException e) {
			System.out.println("Home SkilletsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			StartersPane  = FXMLLoader.load(getClass().getResource("FXML_Starters.fxml"));
		} catch (IOException e) {
			System.out.println("Home StartersPane did not load correctly");
			e.printStackTrace();
		}
		try {
			ToppingsPane  = FXMLLoader.load(getClass().getResource("FXML_Toppings.fxml"));
		} catch (IOException e) {
			System.out.println("Home ToppingsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			BeveragesPane  = FXMLLoader.load(getClass().getResource("FXML_Beverages.fxml"));
		} catch (IOException e) {
			System.out.println("Home BeveragesPane did not load correctly");
			e.printStackTrace();
		}
		try {
			SaladsPane  = FXMLLoader.load(getClass().getResource("FXML_Salads.fxml"));
		} catch (IOException e) {
			System.out.println("Home SaladsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			HealthyChoicesPane  = FXMLLoader.load(getClass().getResource("FXML_HeathlyChoices2.fxml"));
		} catch (IOException e) {
			System.out.println("The Healthy Choices FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			ClassicSandwichesPane  = FXMLLoader.load(getClass().getResource("FXML_ClassicSandwiches.fxml"));
		} catch (IOException e) {
			System.out.println("The Classic Sandwiches FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			LunchOptionsPane  = FXMLLoader.load(getClass().getResource("FXML_LunchOptions.fxml"));
		} catch (IOException e) {
			System.out.println("The Lunch Options FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			PaninisPane  = FXMLLoader.load(getClass().getResource("FXML_Paninis.fxml"));
		} catch (IOException e) {
			System.out.println("The Paninis FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			QuesadillasPane  = FXMLLoader.load(getClass().getResource("FXML_Quesadillas.fxml"));
		} catch (IOException e) {
			System.out.println("The Quesadillas FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			SpecialtySandwichesPane  = FXMLLoader.load(getClass().getResource("FXML_SpecialtySandwiches.fxml"));
		} catch (IOException e) {
			System.out.println("The Specialty Sandwiches FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			TwoHandedBurgersPane  = FXMLLoader.load(getClass().getResource("FXML_TwoHandedBurgers.fxml"));
		} catch (IOException e) {
			System.out.println("The Two Handed Burgers FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			WrapsPane  = FXMLLoader.load(getClass().getResource("FXML_Wraps.fxml"));
		} catch (IOException e) {
			System.out.println("The Wraps FXML did not load correctly");
			e.printStackTrace();
		}
		
		try {
			OrderPane = FXMLLoader.load(getClass().getResource("FXML_Order.fxml"));
		} catch (IOException e) {
			System.out.println("The Order FXML did not load correctly");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		HealthyChoicesScene = new Scene(HealthyChoicesPane, 600, 600);
		
		MenuOptionsScene = new Scene(MenuOptionsPane, 700, 600);
		
		LoginScene = new Scene(loginPane, 600, 600); 
		ClockInOutScene = new Scene(ClockInOutPane, 700, 702);
		BreakfastScene = new Scene(BreakfastPane, 600, 600);
		BreakfastMasterpiecesScene = new Scene(BreakfastMasterpiecesPane, 600, 600);
		CountryFavoriteScene = new Scene(CountryFavoritesPane, 600, 600);
		FamousBenedictsScene = new Scene(FamousBenedictsPane, 600, 600);
		BreakfastSandwichesScene = new Scene(BreakfastSandwichesPane, 600, 600);
		SpecialtySandwichesScene = new Scene(SpecialtySandwichesPane, 600, 600);
		TwoHandedBurgersScene = new Scene(TwoHandedBurgersPane, 600, 600);
		ClassicSandwichesScene = new Scene(ClassicSandwichesPane, 600, 600);
		PaninisScene = new Scene(PaninisPane, 600, 600);
		WrapsScene = new Scene(WrapsPane, 600, 600);
		QuesadillasScene = new Scene(QuesadillasPane, 600, 600);
		HomeScene = new Scene(HomePane, 600, 600);
		HotOffTheGriddleScene = new Scene(HotOffTheGriddlePane, 600, 600);
		MexicanCuisineScene = new Scene(MexicanCuisinePane, 600, 600);
		OmeletsScene = new Scene(OmeletsPane, 600, 600);
		SkilletsScene = new Scene(SkilletsPane, 600, 600);
		StartersScene = new Scene(StartersPane, 600, 600);
		ToppingsScene = new Scene(ToppingsPane, 600, 600);
		BeveragesScene = new Scene(BeveragesPane, 600, 600);
		SaladsScene = new Scene(SaladsPane, 600, 600);
		LunchOptionsScene = new Scene(LunchOptionsPane, 600, 600);
		OrderScene = new Scene(OrderPane, 600, 600);
		}
	
	
	
	public void loadScene(Scene scene, String sceneTitle)
	{
		stage.setScene(scene); 
		stage.setTitle(sceneTitle);
		stage.show(); 
	}
	
	public void DisplayLoginScene()
	{
		stage.setScene(LoginScene); 
		stage.setTitle("Login Here");
		stage.show();
	}
	public void DisplayClockInOutScene()
	{
		stage.setScene(ClockInOutScene);
		stage.setTitle("Clock in here");
		stage.show();
	}
	public void DisplayBreakfastScene()
	{
		stage.setScene(BreakfastScene); 
		stage.setTitle("Breakfast Items"); 
		stage.show(); 
	}
	public void DisplayBreakfastMasterpiecesScene()
	{
		stage.setScene(BreakfastMasterpiecesScene); 
		stage.setTitle("Breakfast Master Piece Items"); 
		stage.show(); 
	}
	public void DisplayCountryFavoriteScene()
	{
		stage.setScene(CountryFavoriteScene); 
		stage.setTitle("CountryFavorite Piece Items"); 
		stage.show(); 
	}
	public void DisplayFamousBenedictsScene()
	{
		stage.setScene(FamousBenedictsScene); 
		stage.setTitle("Famous Benedicts Scene Piece Items"); 
		stage.show();
	}
	public void DisplayHealthyChoices()
	{
		stage.setScene(HealthyChoicesScene); 
		stage.setTitle("Healthy Choices Scene Piece Items"); 
		stage.show();
	}
	public void DisplayHome()
	{
		stage.setScene(HomeScene); 
		stage.setTitle("Home Scene Piece Items"); 
		stage.show();
	}
	public void DisplayHotOffTheGriddleScene()
	{
		stage.setScene(HotOffTheGriddleScene); 
		stage.setTitle("Display Hot Off The Griddle Scene"); 
		stage.show();
	}
	public void DisplayMexicanCuisineScene()
	{
		stage.setScene(MexicanCuisineScene); 
		stage.setTitle("Display Mexican Cuisine Scene"); 
		stage.show();
	}
	public void DisplayOmeletsScene()
	{
		stage.setScene(OmeletsScene); 
		stage.setTitle("Display Omelet Scene"); 
		stage.show();
	}
	public void DisplaySkilletsScene()
	{
		stage.setScene(SkilletsScene); 
		stage.setTitle("Display Skillets Scene"); 
		stage.show();
	}
	public void DisplayStartersScene()
	{
		stage.setScene(StartersScene); 
		stage.setTitle("Display Starters Scene"); 
		stage.show();
	}
	public void DisplayToppingsScene()
	{
		stage.setScene(ToppingsScene); 
		stage.setTitle("Display Toppings Scene"); 
		stage.show();
	}
	
	public void DisplayMenuOptionsScene()
	{
		stage.setScene(MenuOptionsScene); 
		stage.setTitle("Display Menu Options Scene"); 
		stage.show();
	}
	
	public void DisplayBeveragesScene()
	{
		stage.setScene(BeveragesScene); 
		stage.setTitle("Display Beverages Scene"); 
		stage.show();
	}
	public void DisplaySaladsScene()
	{
		stage.setScene(SaladsScene); 
		stage.setTitle("Display Salads Scene"); 
		stage.show();
	}
	public void DisplayBreakfastSandwichesScene()
	{
		stage.setScene(BreakfastSandwichesScene); 
		stage.setTitle("Display BreakfastSandwiches Scene"); 
		stage.show();
	}

	public void DisplaySpecialtySandwichesScene()
	{
		stage.setScene(SpecialtySandwichesScene); 
		stage.setTitle("Display SpecialtySandwiches Scene"); 
		stage.show();
	}
	public void DisplayTwoHandedBurgersScene()
	{
		stage.setScene(TwoHandedBurgersScene); 
		stage.setTitle("Display TwoHandedBurgers Scene"); 
		stage.show();
	}
	public void DisplayClassicSandwichesScene()
	{
		stage.setScene(ClassicSandwichesScene); 
		stage.setTitle("Display ClassicSandwiches Scene"); 
		stage.show();
	}
	public void DisplayPaninisScene()
	{
		stage.setScene(PaninisScene); 
		stage.setTitle("Display Paninis Scene"); 
		stage.show();
	}
	public void DisplayWrapsScene()
	{
		stage.setScene(WrapsScene); 
		stage.setTitle("Display Wraps Scene"); 
		stage.show();
	}
	public void DisplayQuesadillasScene()
	{
		stage.setScene(QuesadillasScene); 
		stage.setTitle("Display Quesadillas Scene"); 
		stage.show();
	}
	public void DisplayLunchOptionsScene()
	{
		stage.setScene(LunchOptionsScene); 
		stage.setTitle("Display LunchOptions Scene"); 
		stage.show();
	}
	
	public void DisplayOrderScene()
	{
		stage.setScene(OrderScene); 
		stage.setTitle("Display Order Scene"); 
		stage.show();
	}
	
}
