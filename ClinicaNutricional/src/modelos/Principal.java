package modelos;

import javax.sound.midi.spi.MidiDeviceProvider;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico mediPredeter=new Medico();
		Paciente paciente0= new Paciente();
		ReglasNegocio misReglas=new ReglasNegocio();
		
		mediPredeter.setNombre("Victor");
		mediPredeter.setAltura(1.8);
		mediPredeter.setEdad(35);
		mediPredeter.setEspecialidad("Nutrición");
		mediPredeter.setPrecioConsulta(150000);
		mediPredeter.setPeso(90);
		
		paciente0.setNombre(JOptionPane.showInputDialog("Por favor ingrese el nombre del paciente"));
		paciente0.setEdad(misReglas.SolicitarEntero("Por favor ingrese la edad del paciente"));
		paciente0.setAltura(misReglas.SolicitarReal("Por favor ingrese la altura del paciente"));
		paciente0.setPeso(misReglas.SolicitarEntero("Por favor ingrese el peso del paciente"));
		paciente0.setMedicoTratante(mediPredeter);
		paciente0.setSexo(misReglas.SolicitarSexo());
		paciente0.setRUT(JOptionPane.showInputDialog("Por favor ingrese el RUT del paciente"));
		
		String mensaje="Paciente: "+paciente0.getNombre()+" \n"+
					   "Peso: "+paciente0.getAltura()+" \n"+
					   "IMC: "+paciente0.calcularIMC();
		
		JOptionPane.showMessageDialog(null, mensaje);
		
		System.out.println(paciente0.toString());
		
	}
	
	
	

}
