package com.practice.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileAsStream {

		public static void main(String[] args) throws Exception {
				
				Path path = Paths.get("app.txt");
				
				Stream<String> fs = Files.lines(path);
				fs.filter(s-> s.contains("Hyderabad")).forEach(System.out::println);;
			
		}
}
