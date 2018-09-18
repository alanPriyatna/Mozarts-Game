import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class no21{
	public static void main (String[] args){
		try{
			File f = new File ("m1.txt");
			BufferedReader b = new BufferedReader(new FileReader(f));
			String strMeasuresPerLine = "";
			int index = 0;
			int minuet[][] = new int[16][11];
			int trio[][] = new int[16][6];
			int choices[] = new int[32];
			int randomIndex;
			while((strMeasuresPerLine = b.readLine())!=null){
				String[] values = strMeasuresPerLine.split(" ");
				randomIndex = (int)(Math.random()* (values.length-1-0)+0);
				choices[index] = Integer.parseInt(values[randomIndex]);
				
				for(int i = 0; i < values.length; i++){
					if(index<=15){
						minuet[index][i] = Integer.parseInt(values[i]);
					}
					else{
						trio[index-16][i] = Integer.parseInt(values[i]);					
					}
				}
				index++;
			}
			
		
			
			for(int i = 0; i<16; i++){
				for(int j =0; j<11; j++){
					System.out.print(minuet[i][j]+" ");
				}
				System.out.println();
			}
			
			for(int i = 0; i<16; i++){
				for(int j =0; j<6; j++){
					System.out.print(trio[i][j]+" ");
				}
				System.out.println();
			}
			
			for(int i =0; i< 32; i++){
				System.out.println(choices[i]);
			}
			
		} catch(IOException e){{
			e.printStackTrace();
		}}
	}
}
