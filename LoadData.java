
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import weka.core.Instances;


public class LoadData {
	
	private static LoadData myLoadData = new LoadData();

	public LoadData() {
	
	}

	public static LoadData getLoadData() {
		return myLoadData;
	}
	
	public ArrayList<Instances> cargarDatos(String[] args) throws IOException{
		
		 if( args.length < 1 ){
				System.out.println("\t1. Path del fichero de entrada: datos en formato .arff");
			}
			
	            // 1.2. Open the file
			ArrayList<Instances> datalist= new ArrayList<Instances>();      
		    FileReader fi1=null;
			FileReader fi2=null;
			FileReader fi3=null;
			try {
				fi1= new FileReader(args[0]); //Fichero -> train.arff
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: Revisar path del fichero de datos: "+args[0]);
			}
			try {
				fi2= new FileReader(args[1]); //Fichero -> dev.arff
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: Revisar path del fichero de datos: "+args[1]);
			}
			try {
				fi3= new FileReader(args[2]); //Fichero -> test.arff
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: Revisar path del fichero de datos: "+args[2]);
			}
			// 1.3. Load the instances
			Instances data1=null;
			Instances data2=null;
			Instances data3=null;
			try {
				data1 = new Instances(fi1);
				datalist.add(data1);
				data2 = new Instances(fi2);
				datalist.add(data2);
				data3 = new Instances(fi3);
				datalist.add(data3);
			} catch (IOException e) {
				System.out.println("ERROR: Revisar contenido del fichero de datos: "+args[0]);
				System.out.println("ERROR: Revisar contenido del fichero de datos: "+args[1]);
				System.out.println("ERROR: Revisar contenido del fichero de datos: "+args[2]);
			}
			// 1.4. Close the file
			try {
				fi1.close();
				fi2.close();
				fi3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		return datalist;
	}
	

	
	

}
