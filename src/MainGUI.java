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
import java.util.Arrays;
import java.util.List;

  public class  MainGUI extends Object{
//	                 Initialize various variable required
			    	 public  static int count_like= 0,count_unlike;
			    	 public String     recipe_name;
			         public int        calorie ,imageIndex =0;;
			         public  JLabel     labelAa,labelAb,labelLike,labelUnlike /*,labelB,labelC,labelD,labelE*/;
			         private JFrame     frame;
			         private JPanel     panelA,panelB,panelC,panelD,panelE;   // PanelC is for Image 
//			         private JButton    likeButton,unlikeButton;               /*,buttonNext,buttonPrevious*/        !Not needed
			         private JLabel     img;
         
//List of Recipe's images     
 	List <String> images = Arrays.asList(
 	   	    	  "image/BBQ Spareribs.jpg",
 	       		  "image/Brokkolisuppe.jpg",
 	       		  "image/Feldsalat mit Granatapfel und Ziegenkäse im Speckmantel.jpg",
 	       		  "image/Gänsekeulen aus dem Bratschlauch.jpg",
 	       		  "image/Italienisches Focaccia Brot.jpg",
 	       		  "image/Rinderrouladen klassich.jpg",
 	       		  "image/Rote Linsen - Kokossuppe.jpg",
 	       		  "image/Soja Chicken Curry.jpg",
 	       		  "image/Vegetarische Spinat-Gemüse-Lasagne mit Tomatensoße.jpg"
 	       		  );
//List of Recipe's name	
 	List <String> name = Arrays.asList(
 			      "BBQ Spareribs",
 			      "Brokkolisuppe",
 			      "Feldsalat mit Granatapfel und Ziegenkäse im Speckmantel",
 			      "Gänsekeulen aus dem Bratschlauch",
 			      "Italienisches Focaccia Brot",
 			      "Rinderrouladen klassich",
 			      "Rote Linsen - Kokossuppe",
 			      "Soja Chicken Curry",
 			      "Vegetarische Spinat-Gemüse-Lasagne mit Tomatensoße"
 			      );
//List of calories of recipes	
 	List <Integer> calories = Arrays.asList(
	 			     121,
	 		         1222,
	 			     500,
	 			     233,
	 			     423,
	 			     7788,
	 			     234,
	 			     23423,
	 			     899
 			     );
            
//For the GUI Format
 	public MainGUI() {
// 		  Loading the images for various buttons
	   	  Icon likeIcon      = new ImageIcon(getClass().getResource("icons/likeButton.png")); 
		  Icon unlikeIcon    = new ImageIcon(getClass().getResource("icons/unlikeButton.png"));
		  Icon nextIcon      = new ImageIcon(getClass().getResource("icons/nextButton.png")); 
		  Icon previousIcon  = new ImageIcon(getClass().getResource("icons/previousButton.png")); 
//		  Initializing 
		      labelLike      = new JLabel();
		      labelUnlike    = new JLabel();
	          frame          = new JFrame();
	          
			  class cal{
//				    Inner class methods created to reduce repetition
					public  void calc() {
						// TODO Auto-generated method stub
						    calorie= calories.get(imageIndex%calories.size());
							recipe_name= name.get(imageIndex%name.size());
							labelAa.setText(recipe_name);
							labelAb.setText("CALORIES : "+calorie);
							labelAa.setFont(labelAa.getFont().deriveFont((float) 20.00));
						    labelAb.setFont(labelAb.getFont().deriveFont((float) 20.00));
						    
						    String image = images.get(imageIndex%images.size());
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
		  calorie= calories.get(imageIndex%calories.size());
		  recipe_name= name.get(imageIndex%name.size());	
		  labelAa  = new JLabel(recipe_name,SwingConstants.CENTER);
		  labelAb  = new JLabel(" CALORIES : "+calorie,SwingConstants.CENTER);
		  labelAa.setFont(labelAa.getFont().deriveFont((float) 20.00));
	      labelAb.setFont(labelAb.getFont().deriveFont((float) 20.00));
		  ImageIcon imgIcon = new ImageIcon(getClass().getResource(images.get(imageIndex%(images).size())));
		  img = new JLabel(imgIcon);
		 
		  panelD  = new JPanel();
		  panelD.setPreferredSize(new DimensionUIResource(150, 1000));
		  panelD.setLayout(new GridLayout(1,5));
		  panelD.setBackground(Color.WHITE);
		  
		  panelE  = new JPanel();
		  // panelE.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  panelE.setPreferredSize(new DimensionUIResource(1300,180));
		  panelE.setBackground(Color.WHITE);
		  
		  labelLike.setText("Likes: " + count_like ); 
		  
		  
		  
		  
//Counting and displaying  like function
		  JButton likeButton = new JButton(likeIcon);
		  likeButton.setBackground(Color.WHITE);
		  
		  likeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count_like++;
				System.out.println("Likes: " + count_like);
    			labelLike.setText( "Likes: " + count_like );
			}
		  });
		  
//Counting and displaying  unlike function		  
		 JButton unlikeButton = new JButton(unlikeIcon);
		 unlikeButton.setBackground(Color.WHITE);
		 
		 unlikeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count_unlike++;
				System.out.println("Unlikes: " + count_unlike);
				labelUnlike.setText("Unlikes: " + count_unlike);
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
					   imageIndex= images.size()-1;}
					call.calc();
			}
		  });
			  
			  
			  
	          
//Displaying recipe's name and calories      
			  panelA.add(labelAa);
			  panelA.add(labelAb); 
			  
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
}
