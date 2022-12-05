package excelUtils;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		
		GravaExcel gravaExcel = new GravaExcel();
		gravaExcel.gravandoExcel("GravandoArquivo.xlsx", "Excel-Teste1");
		
		
		LendoExcel lendoExcel = new LendoExcel();
		lendoExcel.LerExcel("C:\\Usando-Apache-POI\\davy\\GravandoArquivo.xlsx");
		

	}

}
