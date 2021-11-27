
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



     public class  MainGUI {
    	 public static int count_like= 0,count_unlike;
    	
    	 private String recipe_name;
         private int calorie ,imageIndex = 0;
         public  JLabel labelAa,LabelAb,labelLike,labelUnlike/*,labelB,labelC,labelD,labelE*/;
         private  JFrame frame;
         private  JPanel panelA,panelB,panelC,panelD,panelE; // PanelC is for Image 
         private  JButton likeButton,unlikeButton/*,buttonNext,buttonPrevious*/;
         private JLabel img;
         Recipe recipe = new Recipe();
         List <Recipe> mList = new ArrayList<>();
	     //List <Recipe> mList1 = new ArrayList(rec);
         //List <Object> oList = new ArrayList(rec);
         
         
         
         public String NameList(List <Recipe> m,int index) {
        	 int n = m.size();
        	 String rName;
        	 rName    =  m.get((index+0)%m.size()).name;
     
        	 return rName;
         }
         
         public int CalorieList(List <Recipe> m,int index) {
        	 int n = m.size();
        	 
        	 int rCalorie;
        	 rCalorie    =  m.get((index+0)%m.size()).calories;
     
        	 return rCalorie;
         }
         
         public List<Recipe> GetList(List <Recipe> m){
        	 List<Recipe> nList  = new ArrayList<Recipe>(m);
        	 return (nList);
        	 
         }
         /*
         public <Recipe> List<Rec> asList(final Class<T> clazz) {
        	    List<T> values = (List<T>) this.value;
        	    values.forEach(clazz::cast);
        	    return values;
        	}
        	*/
         
          
          
	     public MainGUI() {
	    	 
	    	 
	      
	   	  Icon likeIcon      = new ImageIcon(getClass().getResource("src/../icons/likeButton.png")); 
		  Icon unlikeIcon    = new ImageIcon(getClass().getResource("src/../icons/unlikeButton.png"));
		  Icon nextIcon      = new ImageIcon(getClass().getResource("src/../icons/nextButton.png")); 
		  Icon previousIcon  = new ImageIcon(getClass().getResource("src/../icons/previousButton.png")); 
	      labelLike = new JLabel();
	      labelUnlike = new JLabel();
	      
	      
	      
	      //ArrayList<Recipe> guiArrayList  = new ArrayList(recipes);
	     // Object obj = new Object();
	   
	      
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
	      
	        //oakpane
		  frame = new JFrame();
		//  labelA  = new JLabel("Number of likes clicks : 0");
	//
		 /*
		  
		  JButton likeButton = new JButton(likeIcon);
		  //buttonLike.addActionListener(this);
		  label1  = new JLabel("Number of likes clicks : 0");
		  
		  //buttonLike = new JButton("Like");
		  
		  
		  JButton unlikeButton = new JButton(unlikeIcon);
		 // buttonUnlike.addActionListener(this);
		  label2  = new JLabel("Number of unlike clicks : 0");
		  
		  //buttonUnlike = new JButton("Dislike");)
		  
		  
		  
		  JButton nextButton = new JButton(nextIcon);
		  
		  JButton previousButton = new JButton(previousIcon);
		  
		  */
		 // Icon iconLike = new ImageIcon(getClass().getResource("likeButton.png")); 
		  //JButton buttonLike = new JButton(iconLike);
		  panelA  = new JPanel();
		  //panelA.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  panelA.setPreferredSize(new DimensionUIResource(1300, 120));
		  panelA.setLayout(new GridLayout(0,1));
		  panelA.setBackground(Color.WHITE);
		  
		  
		  panelB  = new JPanel();
		  panelB.setBorder(BorderFactory.createEmptyBorder());
		  panelB.setPreferredSize(new DimensionUIResource(150, 1000));
		  panelB.setLayout(new GridLayout(1,1));
		  panelB.setBackground(Color.WHITE);
		  
		 
		  
		  panelC  = new JPanel();
		  //panelC.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  panelC.setPreferredSize(new DimensionUIResource(1000,1000));
		  panelC.setLayout(new GridLayout(0,1));
		  panelC.setBackground(Color.WHITE);
		  
		  ImageIcon imgIcon = new ImageIcon(getClass().getResource(images.get(imageIndex%images.size())));
		  
		   img = new JLabel(imgIcon);
		  panelC.add(img);
		  //panelC.remove(img);
		 
		  
		  
		  panelD  = new JPanel();
		  //panelD.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  panelD.setPreferredSize(new DimensionUIResource(150, 1000));
		  panelD.setLayout(new GridLayout(1,5));
		  panelD.setBackground(Color.WHITE);
		  
		  panelE  = new JPanel();
		 // panelE.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		  panelE.setPreferredSize(new DimensionUIResource(1300,180));
		  
		  panelE.setBackground(Color.WHITE);
		  
		  
		  
		  
		  labelLike.setText("Likes: " + count_like ); 
		  
		  JButton likeButton = new JButton(likeIcon);
		  //likeButton.addActionListener(this);
		  likeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count_like++;
				System.out.println("Likes: " + count_like);
    			labelLike.setText("Likes: " + count_like );
    			
				
			}
			
		 
		  });
		  likeButton.setBackground(Color.WHITE);
		  //likeButton.addActionListener(this);
		  //buttonLike.addActionListener(this);
		  //label1  = new JLabel("Number of likes clicks : 0");
		  
		  //buttonLike = new JButton("Like");
		  
		  
		 JButton unlikeButton = new JButton(unlikeIcon);
		 unlikeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count_unlike++;
				System.out.println("Unlikes: " + count_unlike);
    			labelUnlike.setText("Unlikes: " + count_unlike);
			}
			 
		 });
		 //unlikeButton.addActionListener(this);
		 unlikeButton.setBackground(Color.WHITE);
		 //unlikeButton.addActionListener(this);
		 // buttonUnlike.addActionListener(this);
		 // label2  = new JLabel("Number of unlike clicks : 0");
		  
		  //buttonUnlike = new JButton("Dislike");)
		  
		  
		  
		 JButton nextButton = new JButton(nextIcon);
		 nextButton.setBackground(Color.WHITE);
		  nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				imageIndex++;
				
				//recipe_name = NameList(GetList(recipes), imageIndex);
				
				//calorie = CalorieList(GetList(null), imageIndex);
				//calorie = recipe.calories;
				//recipe_name = recipe.name;
				//recipe_name = mList.get((imageIndex+0)%mList.size()).name;
				//calorie = mList.get((imageIndex+0)%mList.size()).calories;
				//recipe_name = mList.get((imageIndex+0)%mList.size()).name;
				//calorie = mList.get((imageIndex+0)%mList.size()).calories;
				
				String image = images.get(imageIndex%images.size());
				ImageIcon imgIcon = new ImageIcon(getClass().getResource(image));
				img.setIcon(imgIcon);
			}
			  
		  });
		  JButton previousButton = new JButton(previousIcon);
		  previousButton.setBackground(Color.WHITE);
		  
		  previousButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(imageIndex>0) {
						imageIndex--;
					}else if(imageIndex==0) {
					imageIndex=	images.size()-1;
					}
					
					String image = images.get(imageIndex%images.size());
					ImageIcon imgIcon = new ImageIcon(getClass().getResource(image));
					img.setIcon(imgIcon);
				}
				  
			  });
		  
		  
		 // Icon iconLike = new ImageIcon(getClass().getResource("likeButton.png")); 
		  //JButton buttonLike = new JButton(iconLike);
		  
		  labelAa  = new JLabel("                                                    Recipe's name : "+ recipe_name);
		  LabelAb  = new JLabel("                                                    Calories      : "+calorie);
		  labelAa.setFont(labelAa.getFont().deriveFont((float) 20.00));
		  LabelAb.setFont(LabelAb.getFont().deriveFont((float) 20.00));
		  panelA.add(labelAa);
		  panelA.add(LabelAb);
		  
		 
		  panelE.add(unlikeButton);
		  panelE.add(likeButton);
		  
		  panelD.add(nextButton);
		  //panelB.add(pic);
		  panelB.add(previousButton);
		  //panel.add(label1);
		  //panel.add(label2);
		  
		  
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
	
		new MainGUI();
		
	
	}
}
