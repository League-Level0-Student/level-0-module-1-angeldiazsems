package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You set up the passcode and the secret * You want to leave a message on one of the Mac computers so that only your friend can read it.
 message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
public static void main(String[] args) {
	
	// 0. Make a main method and put steps 1-5 inside it
	
		// 1. Set a password in a String variable
		String password  = "password"; 
	
		// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String input  = JOptionPane.showInputDialog("GIVE ME A SECRET MESSAGE!???!?!?!?");
		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
		//    if they can guess the passcode
String input1 = JOptionPane.showInputDialog("GIVE ME A  SUPER SECRET PASSWORDTO GET IN");
		// 4. If their guess matches the password, show them the secret message
if (input1.equals (password))
{

                             JOptionPane.showMessageDialog(null, input+"");                     
                              
                              
                              
}  
                     
		
		
else {
	
	JOptionPane.showMessageDialog(null, "intRUDEr");
	
	
}
		
		
		
		





















		// 5. If the password does not match, pop-up "INTRUDER!!"



}
	
}
