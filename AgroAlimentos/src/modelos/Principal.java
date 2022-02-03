package modelos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductoFresco pf1=crearFresco("2022-11-02", "2022-01-02", "123213", "Colombia");
		ProductoFresco pf2=crearFresco("2022-11-24", "2022-01-15", "34123421", "Colombia");
		
		ProductoRefrigerado pr1=new ProductoRefrigerado("2022-12-02", "312312", "Colombia", "2021-12-23");
		ProductoRefrigerado pr2=new ProductoRefrigerado("2022-12-22", "312333", "Colombia", "2021-12-11");
		ProductoRefrigerado pr3=new ProductoRefrigerado("2022-10-12", "312333", "Colombia", "2021-12-11");

		CongeladoAire ca1=new CongeladoAire();
		ca1.setCantDioxido(20.0);
		ca1.setCantNitrogeno(30.0);
		ca1.setCantOxigeno(30.0);
		ca1.setCantVapor(20.0);
		ca1.setFechaCaducidad("2023-05-10");
		ca1.setFechaEnvasado("2021-05-10");
		ca1.setLote("423423");
		ca1.setPaisOrigen("Colombia");
		ca1.setTemperaturaMante(-5.5);
		
		CongeladoNitro cN1=new CongeladoNitro();
		cN1.setTiempoSegundos(30);
		cN1.setMetodoUso("Tradicional");
		cN1.setFechaCaducidad("2023-05-10");
		cN1.setFechaEnvasado("2021-05-10");
		cN1.setLote("423423");
		cN1.setPaisOrigen("Colombia");
		cN1.setTemperaturaMante(-10.2);
		
		String respuesta="Frescos1: "+pf1.toString()+" \n"+
						 "Frescos2: "+pf2.toString()+" \n "+
						 "Refrigerado 1: "+pr1.toString();
		
		System.out.println(respuesta);
	}

	public static ProductoFresco crearFresco(String fechaC,String fechaE,String lote,String pais) {
		ProductoFresco f1=new ProductoFresco();
		f1.setFechaCaducidad(fechaC);
		f1.setFechaEnvasado(fechaE);
		f1.setLote(lote);
		f1.setPaisOrigen(pais);
		return f1;
	}
	
}
