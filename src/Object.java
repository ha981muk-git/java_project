import java.util.ArrayList;
//package rrg;

public class Object {

	public static void main(String[] args) 
	{
			ArrayList <Recipe> recipes = new ArrayList();
		//New Recipe
		String ingredients1[] = {"5 EL: Zucker, braun", "3 EL: Paprikapulver, edels��", "1 EL: Salz", "1 EL: Pfeffer", "1 EL: Paprikapulver, scharf", 
									"1 EL: Chillipulver", "1 EL: Zwiebelpulver", "1 EL: Knoblauchpulver", "300 ml: Orangensaft", "100 ml: Whiskey (Jack Daniels)",
									"150 ml: Ketchup", "1 EL: Worcestersauce", "2 EL: Marinade (von dem Rub)", "2 EL: Honig", "50 ml: BBQ-Sauce", "6 kg: Rippchen (Loin Ribs)" };

		Recipe BBQSapreribs = new Recipe();
		BBQSapreribs.name = "BBQ Spareribs";
		BBQSapreribs.flag = 0;
		BBQSapreribs.calories = 0;
		BBQSapreribs.ingredients = ingredients1;
		//https://www.chefkoch.de/rezepte/2338561372249308/Koestliche-BBQ-Spareribs-fuer-Smoker-und-Backofen-mit-Sosse-und-Gewuerzmischung.html
		recipes.add(BBQSapreribs);
		//New Recipe
		String ingredients2[] = {"550 g: Mehl", "350 g: Wasser", "0,5 W�rfel: Frischhefe", "1 TL: Zucker", "1,5 TL: Salz"
									, "12 EL: Oliven�l", "Oliven�l zum Bestreichen der Backform", "1 EL: Polentagrie�, oder Hart- bzw. Weichweizengrie�",
									"1 Handvoll	Datteltomaten", "1 Handvoll: Oliven, schwarze, entsteint", "0,5Paket: Schafsk�se", "1 TL: Thymian",
									"1 EL: Butter, weich", "2 Zehe/n: Knoblauch", "0,5 TL: Salz", "8: frische Basilikumbl�tter zum Garnieren"};
		// 12EL Oliven�l anstelle von 3x 4 EL
		Recipe FocacciaBrot = new Recipe();
		FocacciaBrot.name = "Italienisches Focaccia Brot";
		FocacciaBrot.flag = 1;
		FocacciaBrot.calories = 0;
		FocacciaBrot.ingredients = ingredients2;
		//https://www.chefkoch.de/rezepte/2942941446565480/Selbstgemachtes-Italienisches-Focaccia-Brot.html
		recipes.add(FocacciaBrot);
		//New Recipe
		String ingredients3[] = {"150 g: Feldsalat", "1 mittel-gro�er: Granatapfel", "1 kleines Glas: Kapern", "100 g: Cashewkerne, natur", "3 EL: Zucker",
									"4 EL: �l", "2 EL: Balsamico, wei�", "1 TL: Honig", "1 TL: Senf, mittelscharf", "Salz und Pfeffer", "4 St�ck: Ziegenk�se",
									"4 Scheiben: Bacon"};
		
		Recipe Feldsalat = new Recipe();
		Feldsalat.name = "Feldsalat mit Granatapfel und Ziegenk�se im Speckmantel";
		Feldsalat.flag = 0;
		Feldsalat.calories = 0;
		Feldsalat.ingredients= ingredients3;
		//https://www.chefkoch.de/rezepte/2947671447010302/Feldsalat-mit-Granatapfel-und-Ziegenkaese-im-Speckmantel.html
		recipes.add(Feldsalat);
		//New Recipe
		String ingredients4[] = {"8: Rinderrouladen", "5: Zwiebel(n)", "4: Gew�rzgurke(n)", "4 EL: Senf, mittelscharfer", "12 Scheibe/n: Fr�hst�cksspeck",
									"2 EL: Butterschmalz", "1 St�ck(e): Knollensellerie", "1: M�hre(n)", "0.5 Stange/n: Lauch", "0,5 Flasche: Rotwein","Salz und Pfeffer",
									"0,5 Liter:	Rinderfond, kr�ftiger", "1TL: Speisest�rke", "1 Schuss:	Gurkenfl�ssigkeit"};
		
		Recipe Rinderrouladen = new Recipe();
		Rinderrouladen.name = "Rinderrouladen klassich";
		Rinderrouladen.flag = 0;
		Rinderrouladen.calories = 830; // pro Portion
		Rinderrouladen.ingredients = ingredients4;
		//https://www.chefkoch.de/rezepte/2133281343053838/Rinderrouladen-klassisch.html?portionen=8
		recipes.add(Rinderrouladen);
		//New Recipe
		String ingredients5[]= {"2: Knoblauchzehe(n)", "2: Zwiebel(n)", "2 EL: �l", "175g: Linsen, rote", "1 Dose: Tomate(n)", "1 Dose:	Kokosmilch", "600ml: Gem�sebr�he",
								"2TL: Chilipulver", "1 TL: Kurkuma", "Salz und Pfeffer", "Koriander, gemahlen"};
		Recipe Kokossuppe = new Recipe();
		Kokossuppe.name = "Rote Linsen - Kokossuppe";
		Kokossuppe.flag = 2;
		Kokossuppe.calories = 619; //pro Portion
		Kokossuppe.ingredients = ingredients5;
		//https://www.chefkoch.de/rezepte/1387481243796887/Rote-Linsen-Kokossuppe.html
		recipes.add(Kokossuppe);
		//New Recipe
		String ingredients6[] = {"600g: Blattspinat, TK mit Rahm", "2 gro�e	Karotte(n)", "7 mittel gro�e Champignons", "1 gro�e	Zwiebel(n)", "5 EL	Milch", "ca. 100 g: Kr�uterfrischk�se",
									"1 EL: Gem�sebr�hepulver", "2 Knoblauchzehe(n)", "Salz und Pfeffer", "Chilipulver", "3 EL: Butter", "2 EL: Mehl", "500 ml: Tomaten, passierte", "150 ml: s��e Sahne", "1 Paket: Lasagneplatte(n)" 
									,"200g: K�se, gerieben"};
		
		Recipe Gem�seLasagne = new Recipe();
		Gem�seLasagne.name = "Vegetarische Spinat-Gem�se-Lasagne mit Tomatenso�e";
		Gem�seLasagne.flag = 1;
		Gem�seLasagne.calories = 0;
		Gem�seLasagne.ingredients = ingredients6;
		//https://www.chefkoch.de/rezepte/2114131340630587/Vegetarische-Spinat-Gemuese-Lasagne-mit-Tomatensosse.html
		recipes.add(Gem�seLasagne);
		//New Recipe
		String ingredients7[] = {"8: G�nsekeule(n)", "4: �pfel", "6: Zwiebel(n)", "1 Handvoll: Backpflaume(n)", "1 gro�e: Birne(n)", "3 TL:	Majoran, getrocknet oder frisch", "3 TL: Thymian, getrocknet oder frisch", "3 TL: Salz"
									,"1 TL:	Pfeffer, schwarz", "100 ml:	Wei�wein", "300 ml: Wasser", "100 ml: Rotwein, f�r die So�e"};
		
		Recipe Gansekeulen = new Recipe();
		Gansekeulen.name = "G�nsekeulen aus dem Bratschlauch";
		Gansekeulen.flag = 0;
		Gansekeulen.calories = 0;
		Gansekeulen.ingredients = ingredients7;
		//https://www.chefkoch.de/rezepte/2272051362682812/Gaensekeulen-aus-dem-Bratschlauch.html?portionen=8
		recipes.add(Gansekeulen);
		//New Recipe
		String ingredients8 [] = {"500 g: Brokkoli", "2: gro�e Kartoffel(n)", "1 Liter:	Gem�sebr�he", "	Salz und Pfeffer", "100 ml:	Sahne oder Pflanzensahne"};
		
		Recipe Brokkolisuppe = new Recipe();
		Brokkolisuppe.name = "Brokkolisuppe";
		Brokkolisuppe.flag = 2;
		Brokkolisuppe.calories = 147; //pro Portion
		Brokkolisuppe.ingredients = ingredients8;
		//https://www.chefkoch.de/rezepte/642141165243156/Brokkolisuppe.html
		recipes.add(Brokkolisuppe);
		//New Recipe
		String ingredients9[] = {"300g: Sojaschnetzel", "1 Liter: Gem�sebr�he", "2 Dosen: Kokosmilch", "3TL: rote Currypaste", "0,5 Tuben: Tomatenmark", "2: Zwiebeln", "4: Knoblauchtzehen",
									"1 St�ck: Ingwer ( ca. daumenlang)", "4: Nelken", "2TL: Salz", "1TL Pfeffer", "2TL: Kurkuma", "2TL: Currypulver", "2TL: Kreutzk�mmel", "einige Mandeln, gehobelt und ger�stet",
									"10 Stiele: Koriander und/oder Basilikum","nach Ermessen Reis oder Naan Brote" };
		Recipe SojaChicken = new Recipe();
		SojaChicken.name = "Soja Chicken Curry";
		SojaChicken.flag = 2;
		SojaChicken.calories = 0;
		SojaChicken.ingredients = ingredients9;
		//https://www.chefkoch.de/rezepte/3274371486501413/Veganes-Soja-Chicken-Korma.html
		recipes.add(SojaChicken);
	

} 
	}