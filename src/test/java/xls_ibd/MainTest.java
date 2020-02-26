package xls_ibd;

import java.io.File;

import net.mike.xls_ibd.service.Parser;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Hallo Test");
		/**
		 * загружаем файл
		 * считываем количество полей
		 * формируем нужную таблицу sql
		 * вставляем в нее значения из считанного файла 
		 * 
		 * 
		 * 
		 * 
		 * **/
		//загрузка файла
		
		//File myfile  = new File("/home/snake2/temp/price2302MU.xls");
		
		Parser p = new Parser();
		System.out.println(p.parse("/home/snake2/temp/price2302MU.xls"));
		

	}

}
