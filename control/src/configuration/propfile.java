package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import tray.script;

public class propfile {
	static Properties proper = new Properties();;
	public static void main(String[] args) {
		Propertiesfile();
		writeppts();
		Propertiesfile();
	}
	
	// GETTING DATA FROM PROPERTIES FILE
	public static void Propertiesfile(){
		proper = new Properties();
		try {
			
			InputStream intake = new FileInputStream("C:\\Users\\Public\\Downloads\\control\\src\\configuration\\config.properties");
			proper.load(intake);
			// String big = proper.getProperty("browser");
			script.browser = proper.getProperty("browser");
			System.out.println("YOUR BROWSER IS:"+script.getBrowser());
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// WRITING DATA TO PROPERTIES FILE
	public static void writeppts(){
		try {
			
			OutputStream writer = new FileOutputStream("C:\\Users\\Public\\Downloads\\control\\src\\configuration\\config.properties");
			proper.setProperty("browser", "Chrome");
			proper.setProperty("TestStatus", "PASS");
			proper.store(writer, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
