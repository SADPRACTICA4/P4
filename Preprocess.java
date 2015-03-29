
import java.io.IOException;
import java.util.ArrayList;

import weka.core.Instances;

public class Preprocess {
	 public static void main(String[] args) throws Exception  { 
	        System.out.println ("&&&&&%%%%%&&&&&&    PRACTICA 4 - SAD     %%%&&&&&&&&&&&"); 
	        	ArrayList<Instances> loadData = new ArrayList<Instances>();
	    		try {
					loadData = LoadData.getLoadData().cargarDatos(args);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		Instances instancesTrain = loadData.get(0); //Instancias de train.arff
	    		Instances instancesDev = loadData.get(1); //Instancias de dev.arff
	    		Instances instancesTest = loadData.get(2); //Instancias de test.arff
	    		
	    		//Lineas de comando para ver que se ha cargado correctamente
	    		//Borrar cuando lo comprobeis
	    		
	    		System.out.println("$$$$   Archivo -> train.arff Primera Instacia$$$$$$$$");
	    		System.out.println(instancesTrain.instance(0).toString());
	    		System.out.println("$$$$   Archivo -> dev.arff  Primera Instacia$$$$$$$$");
	    		System.out.println(instancesDev.instance(0).toString());
	    		System.out.println("$$$$   Archivo -> test.arff  Primera Instacia$$$$$$$$");
	    		System.out.println(instancesTest.instance(0).toString());
	    	
	    		
	    		
	    		
}
}
	
