package excelUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LendoExcel {

	public void LerExcel(String diretorio) throws IOException {

		FileInputStream fileInputStream = new FileInputStream(new File(diretorio));

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

		XSSFSheet planilha = xssfWorkbook.getSheetAt(0);

		Iterator<Row> linhas = planilha.rowIterator();

		while (linhas.hasNext()) {
			String ln = "";
			
			Row linha = linhas.next();

			Iterator<Cell> celulas = linha.iterator();

			while (celulas.hasNext()) {
				Cell celula = celulas.next();
				
				switch (celula.getCellType()) {
				case STRING:
					ln+= celula.getStringCellValue();
					break;
					
				case NUMERIC:
					ln+= celula.getNumericCellValue();
					break;	

				default:
					break;
				}
			}
			System.out.println(ln);
		}

	}
}
