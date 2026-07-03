package Config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datahoraformatada {

	public String dataFormatada() {
		// 1º método da class datahoraFormatada
		
		LocalDate data = LocalDate.now();
		DateTimeFormatter dataformartada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String databr = data.format(dataformartada);
		
		
		
		return "Data: "+databr;
		
	}
	
	
	public String horaFormatada() {
		
		
		
		
		
		
	}
	
	
	
	
	public String datahoraFormatada() {
		
		LocalDateTime datahora = LocalDateTime.now();
		DateTimeFormatter datahoraformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String datahorabr = datahora.format(datahoraformatada);
		
		
		return "Data hora: " + datahoraformatada;
	}
} 


