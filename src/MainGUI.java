/*
 * Name        : Mukhiya , Harsh Bhushan 
 * Matrikel Nr.: 1400120
 * Semester    : 3
 * */
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;  
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

  public class  MainGUI{
//	                 Initialize various variable required
			    	 public  boolean  like_label,unlike_label;
			    	 public String     recipe_name;
			         public int        calorie ,imageIndex =0;;
			         public  JLabel     labelAa,labelAb,labelLike/*,labelB,labelC,labelD,labelE*/;
			         private JFrame     frame;
			         private JPanel     panelA,panelB,panelC,panelD,panelE;   // PanelC is for Image 
//			         private JButton    likeButton,unlikeButton;               /*,buttonNext,buttonPrevious*/        !Not needed
			         private JLabel     img;
			         public static ArrayList<Recipe> recipes = new ArrayList<Recipe>();
//For the GUI Format
 	public MainGUI() {

// 		  Loading the images for various buttons
	   	  Icon likeIcon      = new ImageIcon(getClass().getResource("icons/likeButton.png")); 
		  Icon unlikeIcon    = new ImageIcon(getClass().getResource("icons/unlikeButton.png"));
		  Icon nextIcon      = new ImageIcon(getClass().getResource("icons/nextButton.png")); 
		  Icon previousIcon  = new ImageIcon(getClass().getResource("icons/previousButton.png")); 
//		  Initializing 
		      labelLike      = new JLabel();
//		      labelUnlike    = new JLabel();
	          frame          = new JFrame();
	      
			  class cal{
//				    Inner class methods created to reduce repetition
					public  void calc() {
						   
						// TODO Auto-generated method stub
						    calorie=recipes.get(imageIndex%recipes.size()).calories;
							recipe_name=recipes.get(imageIndex%recipes.size()).name;
							String image = recipes.get(imageIndex%recipes.size()).image;
							boolean b = recipes.get(imageIndex%recipes.size()).labellike;
							if(b==true) {
								labelLike.setText("Liked");
							}else {
								labelLike.setText("Unliked");
							}
							labelAa.setText(recipe_name);
							labelAb.setText("CALORIES : "+calorie);
							labelAa.setFont(labelAa.getFont().deriveFont((float) 20.00));
						    labelAb.setFont(labelAb.getFont().deriveFont((float) 20.00));
						    
							ImageIcon imgIcon = new ImageIcon(getClass().getResource(image));
							img.setIcon(imgIcon);
					}
				  }
		       cal  call  = new cal();
		              
//Constructing GUI format	
		/*
		 * Designing the various panel for the GUI panelA,-B,-C,-D,-E.
		 * panelA  = Top side of GUI to display Recipe's name and calories
		 * panelB  = Left side of GUI to display previous button
		 * panelC  = To display the image
		 * panelD  = Right side of the GUI to display next button
		 * PanelE  = Button side of GUI for like and dislike button
		 * */
	              
		  panelA  = new JPanel();
		  panelA.setPreferredSize(new DimensionUIResource(1300, 120));
		  panelA.setLayout(new GridLayout(0,1));
		  panelA.setBackground(Color.WHITE);
		  
		  panelB  = new JPanel();
		  panelB.setBorder(BorderFactory.createEmptyBorder());
		  panelB.setPreferredSize(new DimensionUIResource(150, 1000));
		  panelB.setLayout(new GridLayout(1,1));
		  panelB.setBackground(Color.WHITE);
		  
		  panelC  = new JPanel();
		  panelC.setPreferredSize(new DimensionUIResource(1000,1000));
		  panelC.setLayout(new GridLayout(0,1));
		  panelC.setBackground(Color.WHITE);
		  
//		  Loading the initial image ,recipe's name and calories
		  calorie=recipes.get(imageIndex%recipes.size()).calories;
		  recipe_name= recipes.get(imageIndex%recipes.size()).name;	
		  boolean b = recipes.get(imageIndex%recipes.size()).labellike;
			if(b==true) {
				labelLike.setText("Liked");
			}else {
				labelLike.setText("Unliked");
			}
		  labelAa  = new JLabel(recipe_name,SwingConstants.CENTER);
		  labelAb  = new JLabel(" CALORIES : "+calorie,SwingConstants.CENTER);
		  labelAa.setFont(labelAa.getFont().deriveFont((float) 20.00));
	      labelAb.setFont(labelAb.getFont().deriveFont((float) 20.00));
		  ImageIcon imgIcon = new ImageIcon(getClass().getResource(recipes.get(imageIndex%recipes.size()).image));
		  img = new JLabel(imgIcon);
		 
		  panelD  = new JPanel();
		  panelD.setPreferredSize(new DimensionUIResource(150, 1000));
		  panelD.setLayout(new GridLayout(1,5));
		  panelD.setBackground(Color.WHITE);
		  
		  panelE  = new JPanel();
		  // panelE.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  panelE.setPreferredSize(new DimensionUIResource(1300,180));
		  panelE.setBackground(Color.WHITE);
		  
//		  labelLike.setText("Likes: " + count_like ); 
		  
//Counting and displaying  like function
		  JButton likeButton = new JButton(likeIcon);
		  likeButton.setBackground(Color.WHITE);
		  
		  likeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				like_label= true;
				recipes.get(imageIndex%recipes.size()).labellike=like_label;;
    			labelLike.setText("Liked");
			}
		  });
		  
//Counting and displaying  unlike function		  
		 JButton unlikeButton = new JButton(unlikeIcon);
		 unlikeButton.setBackground(Color.WHITE);
		 
		 unlikeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				unlike_label = false;
				recipes.get(imageIndex%recipes.size()).labellike=unlike_label;
				labelLike.setText("Unliked");
			}
		 });
		 
// Constructing the next button
		 JButton nextButton = new JButton(nextIcon);
		 nextButton.setBackground(Color.WHITE);
		 nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				imageIndex++;
				call.calc();
			}
		  });
		  
//Constructing the previous button
		  JButton previousButton = new JButton(previousIcon);
	      previousButton.setBackground(Color.WHITE);
			  
			  previousButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(imageIndex>0) {
					   imageIndex--;
					}else if(imageIndex==0) {
					   imageIndex= recipes.size()-1;}
					call.calc();
			}
		  });
	          
//Displaying recipe's name and calories      
			  panelA.add(labelAa);
			  panelA.add(labelAb);
			  panelA.add(labelLike);
			  
//Adding buttons in panel
			  panelE.add(unlikeButton);
			  panelE.add(likeButton);
			  panelD.add(nextButton);
			  panelB.add(previousButton);
			  panelC.add(img);
			  
//Putting the labels in Frame				  
			  frame.add(panelA, BorderLayout.NORTH);
			  frame.add(panelB, BorderLayout.WEST);
			  frame.add(panelC, BorderLayout.CENTER);
			  frame.add(panelD, BorderLayout.EAST);
			  frame.add(panelE, BorderLayout.SOUTH); 
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  frame.setTitle("Recipe");
			  frame.pack();
			  frame.setVisible(true);
	  }
 	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//New Recipe
		String ingredients1[] = {"5 EL: Zucker, braun", "3 EL: Paprikapulver, edelsüß", "1 EL: Salz", "1 EL: Pfeffer", "1 EL: Paprikapulver, scharf", 
								 "1 EL: Chillipulver", "1 EL: Zwiebelpulver", "1 EL: Knoblauchpulver", "300 ml: Orangensaft", "100 ml: Whiskey (Jack Daniels)",
								 "150 ml: Ketchup", "1 EL: Worcestersauce", "2 EL: Marinade (von dem Rub)", "2 EL: Honig", "50 ml: BBQ-Sauce", "6 kg: Rippchen (Loin Ribs)" };

		Recipe BBQSapreribs = new Recipe();
		BBQSapreribs.name        = "BBQ Spareribs";
		BBQSapreribs.image = "image/BBQ Spareribs.jpg";
		BBQSapreribs.labellike = true;
		BBQSapreribs.flag        = 0;
		BBQSapreribs.calories    = 0;
		BBQSapreribs.ingredients = ingredients1;
		//https://www.chefkoch.de/rezepte/2338561372249308/Koestliche-BBQ-Spareribs-fuer-Smoker-und-Backofen-mit-Sosse-und-Gewuerzmischung.html
        recipes.add(BBQSapreribs);
		//New Recipe
		String ingredients2[] = {"550 g: Mehl", "350 g: Wasser", "0,5 Würfel: Frischhefe", "1 TL: Zucker", "1,5 TL: Salz",
								 "12 EL: Olivenöl", "Olivenöl zum Bestreichen der Backform", "1 EL: Polentagrieß, oder Hart- bzw. Weichweizengrieß",
								 "1 Handvoll	Datteltomaten", "1 Handvoll: Oliven, schwarze, entsteint", "0,5Paket: Schafskäse", "1 TL: Thymian",
								 "1 EL: Butter, weich", "2 Zehe/n: Knoblauch", "0,5 TL: Salz", "8: frische Basilikumblätter zum Garnieren"};
		// 12EL Olivenöl anstelle von 3x 4 EL
		Recipe FocacciaBrot = new Recipe();
		FocacciaBrot.name = "Italienisches Focaccia Brot";
		
		FocacciaBrot.image  =  "image/Italienisches Focaccia Brot.jpg";
		FocacciaBrot.labellike=false;
		FocacciaBrot.flag = 1;
		FocacciaBrot.calories = 0;
		FocacciaBrot.ingredients = ingredients2;
		//https://www.chefkoch.de/rezepte/2942941446565480/Selbstgemachtes-Italienisches-Focaccia-Brot.html
		recipes.add(FocacciaBrot);
		//New Recipe
		String ingredients3[] = {"150 g: Feldsalat", "1 mittel-großer: Granatapfel", "1 kleines Glas: Kapern", "100 g: Cashewkerne, natur", "3 EL: Zucker",
							     "4 EL: Öl", "2 EL: Balsamico, weiß", "1 TL: Honig", "1 TL: Senf, mittelscharf", "Salz und Pfeffer", "4 Stück: Ziegenkäse",
								 "4 Scheiben: Bacon"};
		
		Recipe Feldsalat = new Recipe();
		Feldsalat.name = "Feldsalat mit Granatapfel und Ziegenkäse im Speckmantel";
		Feldsalat.image  = "image/Feldsalat mit Granatapfel und Ziegenkäse im Speckmantel.jpg";
		Feldsalat.labellike=true;
		Feldsalat.flag = 0;
		Feldsalat.calories = 0;
		Feldsalat.ingredients= ingredients3;
		//https://www.chefkoch.de/rezepte/2947671447010302/Feldsalat-mit-Granatapfel-und-Ziegenkaese-im-Speckmantel.html
		recipes.add(Feldsalat);
		//New Recipe
		String ingredients4[] = {"8: Rinderrouladen", "5: Zwiebel(n)", "4: Gewürzgurke(n)", "4 EL: Senf, mittelscharfer", "12 Scheibe/n: Frühstücksspeck",
									"2 EL: Butterschmalz", "1 Stück(e): Knollensellerie", "1: Möhre(n)", "0.5 Stange/n: Lauch", "0,5 Flasche: Rotwein","Salz und Pfeffer",
									"0,5 Liter:	Rinderfond, kräftiger", "1TL: Speisestärke", "1 Schuss:	Gurkenflüssigkeit"};
		
		Recipe Rinderrouladen = new Recipe();
		Rinderrouladen.name = "Rinderrouladen klassich";
		Rinderrouladen.image = "image/Rinderrouladen klassich.jpg";
		Rinderrouladen.labellike=false;
		Rinderrouladen.flag = 0;
		Rinderrouladen.calories = 830; // pro Portion
		Rinderrouladen.ingredients = ingredients4;
		//https://www.chefkoch.de/rezepte/2133281343053838/Rinderrouladen-klassisch.html?portionen=8
		recipes.add(Rinderrouladen);
		//New Recipe
		String ingredients5[]= {"2: Knoblauchzehe(n)", "2: Zwiebel(n)", "2 EL: Öl", "175g: Linsen, rote", "1 Dose: Tomate(n)", "1 Dose:	Kokosmilch", "600ml: Gemüsebrühe",
								"2TL: Chilipulver", "1 TL: Kurkuma", "Salz und Pfeffer", "Koriander, gemahlen"};
		Recipe Kokossuppe = new Recipe();
		Kokossuppe.name = "Rote Linsen Kokossuppe";
		Kokossuppe.image = "image/Rote Linsen - Kokossuppe.jpg";
		Kokossuppe.labellike=true;
		Kokossuppe.flag = 2;
		Kokossuppe.calories = 619; //pro Portion
		Kokossuppe.ingredients = ingredients5;
		//https://www.chefkoch.de/rezepte/1387481243796887/Rote-Linsen-Kokossuppe.html
		recipes.add(Kokossuppe);

		//New Recipe
		String ingredients7[] = {"8: Gänsekeule(n)", "4: Äpfel", "6: Zwiebel(n)", "1 Handvoll: Backpflaume(n)", "1 große: Birne(n)", "3 TL:	Majoran, getrocknet oder frisch", "3 TL: Thymian, getrocknet oder frisch", "3 TL: Salz"
									,"1 TL:	Pfeffer, schwarz", "100 ml:	Weißwein", "300 ml: Wasser", "100 ml: Rotwein, für die Soße"};
		
		Recipe Gansekeulen = new Recipe();
		Gansekeulen.name = "Gänsekeulen aus dem Bratschlauch";
		Gansekeulen.image= "image/Gänsekeulen aus dem Bratschlauch.jpg";
		Gansekeulen.labellike=true;
		Gansekeulen.flag = 0;
		Gansekeulen.calories = 0;
		Gansekeulen.ingredients = ingredients7;
		//https://www.chefkoch.de/rezepte/2272051362682812/Gaensekeulen-aus-dem-Bratschlauch.html?portionen=8
		recipes.add(Gansekeulen);
		//New Recipe
		String ingredients8 [] = {"500 g: Brokkoli", "2: große Kartoffel(n)", "1 Liter:	Gemüsebrühe", "	Salz und Pfeffer", "100 ml:	Sahne oder Pflanzensahne"};
		
		Recipe Brokkolisuppe = new Recipe();
		Brokkolisuppe.name = "Brokkolisuppe";
		Brokkolisuppe.image =   "image/Brokkolisuppe.jpg";
		Brokkolisuppe.labellike=true;
		Brokkolisuppe.flag = 2;
		Brokkolisuppe.calories = 147; //pro Portion
		Brokkolisuppe.ingredients = ingredients8;
		//https://www.chefkoch.de/rezepte/642141165243156/Brokkolisuppe.html
		recipes.add(Brokkolisuppe);
		//New Recipe
		String ingredients9[] = {"300g: Sojaschnetzel", "1 Liter: Gemüsebrühe", "2 Dosen: Kokosmilch", "3TL: rote Currypaste", "0,5 Tuben: Tomatenmark", "2: Zwiebeln", "4: Knoblauchtzehen",
									"1 Stück: Ingwer ( ca. daumenlang)", "4: Nelken", "2TL: Salz", "1TL Pfeffer", "2TL: Kurkuma", "2TL: Currypulver", "2TL: Kreutzkümmel", "einige Mandeln, gehobelt und geröstet",
									"10 Stiele: Koriander und/oder Basilikum","nach Ermessen Reis oder Naan Brote" };
		Recipe SojaChicken = new Recipe();
		SojaChicken.name = "Soja Chicken Curry";
		SojaChicken.image =  "image/Soja Chicken Curry.jpg";
		SojaChicken.labellike=true;
		SojaChicken.flag = 2;
		SojaChicken.calories = 0;
		SojaChicken.ingredients = ingredients9;
		//https://www.chefkoch.de/rezepte/3274371486501413/Veganes-Soja-Chicken-Korma.html
		recipes.add(SojaChicken);
		//New Recipe
		String ingredients6[] = {"600g: Blattspinat, TK mit Rahm", "2 große	Karotte(n)", "7 mittel große Champignons", "1 große	Zwiebel(n)", "5 EL	Milch", "ca. 100 g: Kräuterfrischkäse",
									"1 EL: Gemüsebrühepulver", "2 Knoblauchzehe(n)", "Salz und Pfeffer", "Chilipulver", "3 EL: Butter", "2 EL: Mehl", "500 ml: Tomaten, passierte", "150 ml: süße Sahne", "1 Paket: Lasagneplatte(n)" 
									,"200g: Käse, gerieben"};
		
		Recipe GemüseLasagne = new Recipe();
		GemüseLasagne.name = "Vegetarische Spinat-Gemüse-Lasagne mit Tomatensoße";
		GemüseLasagne.image="image/Vegetarische Spinat-Gemüse-Lasagne mit Tomatensosse.jpg";
		GemüseLasagne.labellike=false;
		GemüseLasagne.flag = 1;
		GemüseLasagne.calories = 0;
		GemüseLasagne.ingredients = ingredients6;
		//https://www.chefkoch.de/rezepte/2114131340630587/Vegetarische-Spinat-Gemuese-Lasagne-mit-Tomatensosse.html
	    recipes.add(GemüseLasagne);
	    
	    
	    
	    // Extra Recipes von diesen Wochen 15.12.2021
	    
	     String ingredients10[]
	    	    = {"750g: Rhabarber (möglichst rot)",
                   "500-750ml: Wasser",
                   "200g: Zucker",
                   "1/2 Zitrone (Saft)"};
	    
	     Recipe RhabarberSirup      = new Recipe();
	     RhabarberSirup.name        = "Erfrischender und einfacher Rhabarber-Sirup";
	     RhabarberSirup.image       = "image/Einfaches-Rezept-Rhabarber-Sirup-kalorienarm-kochen-mit-Booklet-und-Etiketten-zum-Ausdrucken.jpg";
	     RhabarberSirup.labellike   = true;
	     RhabarberSirup.flag        = 0;
	     RhabarberSirup.calories    = 50;
	     RhabarberSirup.ingredients = ingredients10;
	     recipes.add(RhabarberSirup);
	     
	     String ingredients11[] = 
	    	    {"Feine Küchenreibe",
	    		 "Springform 26 cm",
	    		 "Backpapier",
	    		 "600g: Möhren (gerieben 450 g)",
	    		 "220g : Apfelmus",
	    		 "4EL: Rapsöl",
	    		 "4TL: Apfelessig",
	    		 "2TL: Vanille-Extrakt",
	    		 "100g: Zucker (braun, weiß oder gemischt)",
	    		 "300g: Dinkelmehl, Type 630",
	    		 "1TL: Zimt (nach Bedarf)",
	    		 "1TL: Salz",
	    		 "1,5 TL : Backpulver",
	    		 "1,5 TL : Natron",
	    		 "150g : fettarmen Frischkäse",
	    		 "1TL: Zitronensaft",
	    		 "30g: Puderzucke"};
	    
	     Recipe Moehrenkuchen =  new Recipe();
	     Moehrenkuchen.name = "Saftiger und kalorienarmer Möhrenkuchen mit Frischkäse-Frosting";
	     Moehrenkuchen.image= "image/Saftiger-und-kalorienarmer-Moehrenkuchen-mit-Frischkaese-Frosting-einfaches-und-veganes-Karottenkuchen-Rezept.jpg";
	     Moehrenkuchen.labellike=true;
	     Moehrenkuchen.flag = 0;
	     Moehrenkuchen.calories= 220;
	     Moehrenkuchen.ingredients=ingredients11;
	     recipes.add(Moehrenkuchen);
	     
	     String ingredients13[] =
			    	    {"200g: Buttermilch",
			    		 "1 Ei",
			    		 "1 TL: Vanille-Extrakt",
			    		 "1 Prise Salz",
			    		 "125 g: Mehl ",
			    		 "10 g : Backpulver",
			    		 "20 g : Zucker",
			    		 "1 EL : Rapsöl zum Ausbacken"};
	    
	     
	     Recipe ButtermilchPfannkuchen =  new Recipe();
	     ButtermilchPfannkuchen.name= "Super fluffige Buttermilch-Pfannkuchen mit Früchten";
	     ButtermilchPfannkuchen.image="image/Kalorienarme-und-fluffige-Buttermilch-Pfannkuchen-mit-Fruechten-einfaches-Rezept-fuer-Pancakes-mit-wenig-Zutate.jpg";
	     ButtermilchPfannkuchen.labellike=true;
	     ButtermilchPfannkuchen.flag=0;
	     ButtermilchPfannkuchen.calories=100;
	     ButtermilchPfannkuchen.ingredients=ingredients13;
	     recipes.add(ButtermilchPfannkuchen);
	     
	     String ingredients14[] = {
				     "2 Bio-Zitronen",
				     "80 g : Zucker",
				     "2 Eier",
				     "6 Stück Wiener Torteletts"}; 
	     
	     Recipe LemonCurdTarts = new Recipe();
	     LemonCurdTarts.name="Fettarme Lemon Curd Tarts";
	     LemonCurdTarts.image="image/Zitronen-Tarte-au-Citron-leckere-Torteletts-mit-kalorienarmer-und-fettarmer-Zitronen-Creme-Lemon-Curd-Kuchen-ohne-Butte.jpg";
	     LemonCurdTarts.labellike=true;
	     LemonCurdTarts.flag=0;
	     LemonCurdTarts.calories=160;
	     LemonCurdTarts.ingredients=ingredients14;
	     recipes.add(LemonCurdTarts);
	     
	     String ingredients15[] = {
		    		 "150 g : Knödelbrot / Semmelwürfel",
		    		 "200 ml : fettarme Milch",
		    		 "1 EL : Olivenöl",
		    		 "1 kleine Zwiebel",
		    		 "1 Zehe Knoblauch",
		    		 "300 g : fein gehackter Spinat (aus der Tiefkühlung)",
		    		 "1 Ei",
		    		 "1 TL : Mehl",
		    		 "2 TL : Semmelbrösel (nach Bedarf mehr)"};
	     
	     Recipe Spinatknoedel = new Recipe();
	     Spinatknoedel.name="Spinatknödel wie in Südtirol ";
	     Spinatknoedel.image="image/Spinatknödel-wie-in-Südtirol-mit-Parmesan-und-Salbeibutter-einfach-fluffig.jpg";
	     Spinatknoedel.labellike=true;
	     Spinatknoedel.flag=0;
	     Spinatknoedel.calories=165;
	     Spinatknoedel.ingredients=ingredients15;
	     recipes.add(Spinatknoedel);
	     
	     String ingredients16[] = {
			     "4 mittelgroße Bananen, ohne Schale ca. 300 g",
			     "40 g: Apfelmus",
			     "1 Ei",
			     "50 g : Zucker",
			     "1 TL: Backpulver",
			     "1 TL : Natron",
			     "1 Prise Salz",
			     "140 g : Dinkelmehl (Type 630)",
			     "40 g : Walnusskerne",
			     "20 g : Light-Butter",
			     "2 TL : Vanille-Extrakt, Vanille gemahlen (optional)",
			     "1 TL :Zimt (optional)"};
	     
	    
	     Recipe Bananenbrot = new Recipe();
	     Bananenbrot.name="Leichtes Bananenbrot mit Walnüssen";
	     Bananenbrot.image="image/Kalorienarmes-Bananenbrot-mit-Walnüssen-saftig-und-fluffig.jpg";
	     Bananenbrot.labellike=true;
	     Bananenbrot.flag=0;
	     Bananenbrot.calories=125;
	     Bananenbrot.ingredients=ingredients16;
	     recipes.add(Bananenbrot);
	     
	     String ingredients18[]= {
	    		 "3 Äpfel (z.B. Elstar )",
	    		 "2 Eier" ,
	    		 "80 g : Zucker (für den Teig)",
	    		 "1 TL : abgeriebene Limettenschale",
	    		 "1 Prise Salz",
	    		 "80 ml fettarme Milch",
	    		 "110 g : Dinkelmehl (Type 630)",
	    		 "12 g : Backpulver",
	    		 "1 EL : Zucker (zum Bestreuen + Zimt nach Bedarf)",
	    		 "1 TL :Puderzucker (optional, zum Bestäuben)"
	    		 
	     };
	     Recipe Apfelkuchen = new Recipe();
	     Apfelkuchen.name="Saftiger Apfelkuchen";
	     Apfelkuchen.image="image/Apfelkuchen-kalorienarm-fettarm-saftig.jpg";
	     Apfelkuchen.labellike=true;
	     Apfelkuchen.flag=0;
	     Apfelkuchen.calories=150;
	     Apfelkuchen.ingredients=ingredients18;
	     recipes.add(Apfelkuchen);
	     String ingredients17[] = {
	    		" 1 Avocado (ca. 250 g)",
	    		 "8-10 Cherrytomaten (ca. 100 g)",
	    		 "1 Knoblauchzehe",
	    		 "1-2 TL : Limettensaft",
	    		 "Salz",
	    		 "Chiliflocken"};
	     
	     
	     Recipe Guacamole = new Recipe();
	     Guacamole.name="Super einfache und schnelle Guacamole";
	     Guacamole.image="image/Einfacher-Guacamole-Dip.jpg";
	     Guacamole.labellike=true;
	     Guacamole.flag=0;
	     Guacamole.calories=190;
	     Guacamole.ingredients=ingredients17;
	     recipes.add(Guacamole);
	    new MainGUI();
	}
}
