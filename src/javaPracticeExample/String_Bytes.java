/*There are 3 variant of getBytes() method.
public byte[] getBytes()  
public byte[] getBytes(Charset charset)  
public byte[] getBytes(String charsetName)throws UnsupportedEncodingException   */ 

package javaPracticeExample;

import java.io.UnsupportedEncodingException;

public class String_Bytes {

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		String s1= "ABCDEFG";
		
		byte[] br = s1.getBytes();
		
		for(int i=0;i<br.length;i++)
		{ 
		System.out.println(br[i]);
		}
	
	}

}
