import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
String digits;
double dNum;
public void setup()  
{            
    noLoop();
	//digits = e.substring(2,12);
	//dNum = Double.parseDouble(digits);
	//System.out.println(dNum); //displays 7.182818284E9
	for( int j = 2; j <= 100; j++){
    	digits = e.substring(j,j+10);
    	dNum = Double.parseDouble(digits);
	}

	if(isPrime(dNum) == true){
		System.out.println(digits);
	}

}  
public void draw()  
{   
	//not needed for this assignment
}

public boolean isPrime(double dNum)  
{   
    //to be finished later

    for( int i = 2; i <= Math.sqrt(dNum); i++){
		if(dNum%i == 0){  
		    return false;
		}
	}
	return true;

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
