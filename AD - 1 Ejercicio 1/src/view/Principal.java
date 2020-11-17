package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.GestFchAD;
import model.Chasis;
import model.Coche;

public class Principal {
	

	
	
	
	private static void escritura(){
			
		List<Chasis> C1 = Arrays.asList(new Chasis(367281,"Acero",9000.53),
										new Chasis(689457,"Aluminio",7056.03));
		List<Chasis>C2 = Arrays.asList(new Chasis(685778,"Acero",9000.53));
		List<Chasis>C3 = Arrays.asList(new Chasis(568524,"Acero Inox",8100.14));
		List<Chasis>C4 = Arrays.asList(new Chasis(121514,"Acero",5240.12));
		List<Chasis>C5 = Arrays.asList(new Chasis(111257,"Aluminio",3479.23));
		
		List<Coche> lista = new ArrayList<Coche>();
		
		lista.add(new Coche(1222,"Volvo",C1));
		lista.add(new Coche(1222,"Seat",C2));
		lista.add(new Coche(1222,"Mercedes",C3));
		lista.add(new Coche(1222,"Seat",C4));
		lista.add(new Coche(1222,"Citroen",C5));
		
		GestFchAD.writeDataObject(FILE_NAME, lista);
		
	
	}

	
	
	
	
	
}
