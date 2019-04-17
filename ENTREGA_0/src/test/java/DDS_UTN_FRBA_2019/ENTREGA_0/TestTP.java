package DDS_UTN_FRBA_2019.ENTREGA_0;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestTP {
	
	@Test
	public void testObtenerSugerencias()throws Exception{
		
		Prenda pantalon1= new Prenda();
		Prenda pantalon2= new Prenda();
		Prenda remera= new Prenda();
		Prenda calzado= new Prenda();
		Prenda accesorio= new Prenda();
		CreadorDeSugerencias sugeridor= new CreadorDeSugerencias();
		
		
		pantalon1.setTipo("pantalon");
		pantalon2.setTipo("pantalon");
		remera.setTipo("remera");
		calzado.setTipo("calzado");
		accesorio.setTipo("accesorio");
		pantalon1.setDescripcion("Pantalon achupinado rojo");
		pantalon2.setDescripcion("jeans");
		remera.setDescripcion("camisa verde");
		accesorio.setDescripcion("reloj");
		calzado.setDescripcion("nike");
		
		
		
		
		List<Prenda> prendas= new ArrayList<Prenda>(Arrays.asList(pantalon1, pantalon2, remera, calzado, accesorio));
		
		sugeridor.ArmarSugerencias(prendas);
		
		Assert.assertEquals("[jeans, nike, camisa verde,  ]", sugeridor.getSugerencias().get(1).sugerencia());
		
		
	}
	
	
	@Test
	public void testTirarExcepcion()throws Exception{
		CreadorDeSugerencias sugeridor= new CreadorDeSugerencias();
		
		Prenda pantalon1= new Prenda();
		Prenda pantalon2= new Prenda();
		Prenda remera= new Prenda();
		
		pantalon1.setTipo("pantalon");
		pantalon2.setTipo("pantalon");
		remera.setTipo("remera");
		pantalon1.setDescripcion("Pantalon achupinado rojo");
		pantalon2.setDescripcion("jeans");
		remera.setDescripcion("camisa verde");
		

		List<Prenda> prendas= new ArrayList(Arrays.asList(pantalon1, pantalon2,remera));
			try {
				sugeridor.ArmarSugerencias(prendas);
			}catch (NoHayPrendasSuficientesException e) {return;} fail();}
			
	}
	
	
	
	


