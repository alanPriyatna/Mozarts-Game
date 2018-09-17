import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class no21{
	public static void main (String[] args) throws IOException{
		try{
			File f = new File ("m1.txt");
			BufferedReader b = new BufferedReader(new FileReader(f));
			String strMeasuresPerLine = "";
			int index = 0;
			int indexTrio =0;
			int minuet[][] = new int[16][11];
			int trio[][] = new int[16][6];
			while((strMeasuresPerLine = b.readLine())!=null){
				String[] values = strMeasuresPerLine.split(" ");
				
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
			
		} catch(IOException e){{
			e.printStackTrace();
		}}
	}
}
