package com.javaworld.practice;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.javaworld.environment.Environment;


public class ConditionalCompilation {
	private static final Logger log = Logger.getLogger( ConditionalCompilation.class.getName() );
	
	public static void main(String[] args) {
		try{
            Class.forName("com.javaworld.library");
            //return new OSJ6();
        }catch(Exception e){
        	if (Environment.DEBUG) {
        		log.log(Level.SEVERE, "com.javaworld.library class missing!");
        	}
        	//fall back
            //return new OSJ5();
        }

	}

}


