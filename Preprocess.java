
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
	/*Metodo creado por Rada; Calcula el indice de la clase minoritaria para un conjunto de instancias*/
	public double clase Minoritaria(Instances data){
		HashMap <Double,Integer> mapa= new HashMap<Double, Integer> ();
		//Recorro las instancias almacenandolas en el mapa
		for(int i=0;i<newdatatrain.numInstances();i++){
			double valor=newdatatrain.instance(i).classValue();
			if(mapa.containsKey(valor)){
				Iterator<Double> keySetIterator = mapa.keySet().iterator();
				int cont=0;
				while(keySetIterator.hasNext()){
				  Double key = keySetIterator.next();
				  cont=mapa.get(key);
				}
				
				mapa.replace(valor, cont, cont+1);
			}
			else{
				mapa.put(valor, 1);
			}
		}
		//Creo una collecion de enteros con las apariciones de la clase
		Collection<Integer> valors=mapa.values();
		//obtengo el menor valos de las apariciones
		int min=Collections.min(valors,null);
		double clasemin = 0;
		Iterator<Double> keySetIterator = mapa.keySet().iterator(); 
		//Recorro el mapa en busca de la key del menor valor en apariciones
		while(keySetIterator.hasNext()){
		  Double key = keySetIterator.next();
		  int cont=mapa.get(key);
		  if(cont==min){
			  clasemin=key;
		  }
		} 
		//imprimo el mapa
		System.out.println(mapa.toString());
		//Devuelvo el indice de la clase minoritaria
		return clasemin;
	}
}
	
