package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Bob = "Bobs real name is Bobadfrenswnfkajfurebvdbz the third";
String Joe = "Joe knows what billy knows and billy knows what ben knows and ben knows that hilly knows what Joe, billy, and ben knew, because he is going to brainwash them, so they will forgot everything";
String Tyler = "Tyler is actually a alien from outer space and he is brainwashing humans, using them to gain information from the FBI, and he plans to lanuch the Earth invasion next tuesday after he goes to chuck-e-cheese for the last time";

		// 2. Ask the user to enter a name. Store their answer in a variable.
 String input =JOptionPane.showInputDialog("Enter a name (Bob, Joe, or Tyler)");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (input .equals ("Bob")) {
	
	JOptionPane.showMessageDialog(null, Bob+"");
	
}
                          
          
if (input .equals ("Joe")) {
	
	JOptionPane.showMessageDialog(null, Joe+"");
	
}
                      
                          
if (input .equals ("Tyler")) {
	
	JOptionPane.showMessageDialog(null, Tyler+"");
	
}
                              
                
		
		
		
		
		
 
	



}
}

