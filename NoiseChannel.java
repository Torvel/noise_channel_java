import java.util.Random;

/**
 * 
 * @author Jose Torres Velasco
 * @since 2013
 * @version 1.0
 *
 * This class represents a channel with noise in a communication between two
 * systems. NoiseChannel class, provides two methods to introduce a percent of
 * error in a received param (int or float). 
 */
public class NoiseChannel {

	private double probabError;
	Random rnd;
	
	public NoiseChannel(double p){
		probabError=p;
		rnd = new Random();
	}
	
	/**
	 * Introduces to the received parameter the error percent indicated in the 
	 * constructor.
	 * @param integer
	 * @return
	 */
    public  int  addNoiseToInt(int integer) {
        
        int mascara = 0;
        
        for(int i=0;i<32;i++){
      	  if(rnd.nextDouble()>probabError){
      		  mascara |=1;
      	  }
      	  mascara <<=1;
        }
        // ^ represents binary function XOR
        return integer^mascara;
      }
    
    
	/**
	 * Introduces to the received parameter the error percent indicated in the 
	 * constructor.
	 * @param b
	 * @return
	 */
    public  int  addNoiseToByte(byte b) {
        
        byte mascara = 0;
        
        for(int i=0;i<32;i++){
      	  if(rnd.nextDouble()>probabError){
      		  mascara |=1;
      	  }
      	  mascara <<=1;
        }
        // ^ represents binary function XOR
        return b^mascara;
      }
	
}
