package Week3Day4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		JSONParser p = new JSONParser();
		try
		{
			
			JSONArray jsonArray = (JSONArray)p.parse(new FileReader("C:\\Users\\ustjavafsdb218\\Downloads\\EmployeeData.json"));
			Iterator it = jsonArray.iterator();
			
			String s[] = {"id","name","email","password","about","token","country","location","lng","lat","dob","gender"};
			
			int row = 0, col = 0;
			HSSFWorkbook wb = new HSSFWorkbook();
			FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\ustjavafsdb218\\Downloads\\Data.xls"));
			Sheet s1 = wb.createSheet("Sheet1");
			
			Row r = s1.createRow(row);
			Cell c = r.createCell(col);
			for(int i=0;i<s.length; ++i)
			{
				c = r.createCell(i);
				c.setCellValue(s[i]);
			}
				
			
			while(it.hasNext())
			{
				col = -1;
				r = s1.createRow(++row);
				c = r.createCell(++col);
				//System.out.println(it.next());
				JSONObject jsonObject = (JSONObject)it.next();
				long id = (long) jsonObject.get("id");
				c.setCellValue(id);
				c = r.createCell(++col);
				String name = (String) jsonObject.get("name");
				c.setCellValue(name);
				c = r.createCell(++col);
				String email = (String) jsonObject.get("email");
				c.setCellValue(email);
				c = r.createCell(++col);
				String pass = (String) jsonObject.get("password");
				c.setCellValue(pass);
				c = r.createCell(++col);
				String about = (String) jsonObject.get("about");
				c.setCellValue(about);
				c = r.createCell(++col);
				String token = (String) jsonObject.get("token");
				c.setCellValue(token);
				c = r.createCell(++col);
				String country = (String) jsonObject.get("country");
				c.setCellValue(country);
				c = r.createCell(++col);
				String location = (String) jsonObject.get("location");
				c.setCellValue(location);
				c = r.createCell(++col);
				long lng = (long) jsonObject.get("lng");
				c.setCellValue(lng);
				c = r.createCell(++col);
				long lat = (long) jsonObject.get("lat");
				c.setCellValue(lat);
				c = r.createCell(++col);
				String dob = (String) jsonObject.get("dob");
				c.setCellValue(dob);
				c = r.createCell(++col);
				long gender = (long) jsonObject.get("gender");
				c.setCellValue(gender);
				
					
			}
			wb.write(fo);
			fo.close();
			System.out.println("Written");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
