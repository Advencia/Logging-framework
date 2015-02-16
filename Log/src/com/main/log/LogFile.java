package com.main.log;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class LogFile extends JFrame {
	
	private JTextArea displayText;

	public LogFile (String msg){
		
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("monFichier.txt")));
			writer.write(msg); 
			writer.write("\n"); 
			openWindow();
			writer.close(); 
			System.out.println("log fichier OK");
		} 
		catch (Exception e) {
			e.printStackTrace();
			}		
	}
	
	public void openWindow(){
        setTitle("Log fichier");
        setSize(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getParent());

        displayText = new JTextArea(readFile("C:\\Utilisateurs\\coane_000\\Bureau\\Eclipse\\Workspace\\Log\\monFichier.txt"));
         
        // AJOUT DANS LA FENETRE
        add(displayText,BorderLayout.CENTER);

        setVisible(true);
    }
	
	 public String readFile(String file){
	        String lines = "";
	        String line;
	        try{	            
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	             
	            while( (line = reader.readLine()) != null )
	                lines += line+"\n";
	        }
	        catch( Exception e ){
	            lines = "Une erreur s'est produite durant la lecture du flux : "+e.getMessage();
	        }   
	        return lines;
	    }    
}	

