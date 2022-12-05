package excelUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GravaExcel {

	public <T> void gravandoExcel(String excelFilePath, String excelName) throws IOException {
		// objeto de pasta de trabalho
		XSSFWorkbook workbook = new XSSFWorkbook();

		// objeto de planilha
		XSSFSheet spreadsheet = workbook.createSheet(excelName);

		// criando um objeto de linha
		XSSFRow row;

		Map<String, Object[]> entity = new TreeMap<String, Object[]>();

		entity.put("1", new Object[] { "Idade", "Nome", "UF" });

		entity.put("2", new Object[] { "10", "M.Bean", "SP" });

		entity.put("3", new Object[] { "12", "Zeca", "MG" });

		entity.put("4", new Object[] { "13", "Alfredo", "RIO" });

		entity.put("5", new Object[] { "31", "Rodolfo", "MA" });

		entity.put("6", new Object[] { "32", "Clarencio", "BH" });

		Set<String> keyid = entity.keySet();

		int rowid = 0;

		// writing the data into the sheets...

		for (String key : keyid) {

			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = entity.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}

		// .xlsx is the format for Excel Sheets...
		// writing the workbook into the file...
		FileOutputStream out = new FileOutputStream(new File(excelFilePath));

		workbook.write(out);
		out.close();
	}
	

}
