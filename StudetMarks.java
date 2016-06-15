package secondLesson.sanaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.TreeMap;


public class StudetMarks {

	public static void main(String[] args)
			throws Exception {/*
								 * java.io.File file = new
								 * java.io.File("C:/Users/Sanaz61/marks.txt");
								 * if (file.exists()) { System.out.println(
								 * "File already exists"); System.exit(1); }
								 * java.io.PrintWriter output = new
								 * java.io.PrintWriter(file);
								 * 
								 * // Write formatted output to the file
								 * output.print("Simon "); output.println(4);
								 * output.print("Anna "); output.println(10);
								 * output.print("Simon "); output.println(4);
								 * output.print("Anna "); output.println(9);
								 * output.print("Anna "); output.println(5);
								 * output.print("Edward "); output.println(10);
								 * output.close();
								 * 
								 */
		String sCurrentLine;
		TreeMap<String, ArrayList<Double[]>> rowMap = new TreeMap<String, ArrayList<Double[]>>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Sanaz61/marks.txt"))) {
			String colKey = null;
			while ((sCurrentLine = br.readLine()) != null) {

				String[] cols = sCurrentLine.split(" ");

				try {
					colKey = cols[0];
					Double[] colValues = new Double[cols.length - 1];
					for (int i = 1; i < cols.length; i++) {
						colValues[i - 1] = Double.parseDouble(cols[i]);
					}
					if (!rowMap.containsKey(colKey)) {
						rowMap.put(colKey, new ArrayList<Double[]>());
					}
					rowMap.get(colKey).add(colValues);
				} catch (NumberFormatException e) {
				}

			}
			System.out.println("Sort in alphabetic order");
			ArrayList<Double> list = new ArrayList<>();
			
			for (String key : rowMap.keySet()) {
				double sum = 0;
				Integer count = 0;
				double avg = 0;
				String row = key + "";

				for (Double[] rows : rowMap.get(key)) {
					for (Double col : rows) {
						sum += col;
						count++;
					}
				}
				avg = (sum / count);
				row += " " + count + " " + avg;			
				list.add(avg);
				System.out.println(row);			
			}
			System.out.println("Sort in merit order");
			
			Collections.sort(list);
			ListIterator<Double> listIterator = list.listIterator(list.size());
			while (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous());
			}
			

			

			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
