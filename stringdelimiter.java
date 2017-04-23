

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class stringdelimiter {
	
	//Adding new private varible
	private int ram;
	private String mohan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstNm = "", lastNm = "";
		String propFile = "c:\\data\\merchantNameTokens.properties";
		HashMap<String, String> hm = new HashMap<String, String>();
		String delimiter = "=";
		String fields[];

		FileReader fr;
		try {
			String line = "";
			fr = new FileReader(propFile);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				fields = line.split(delimiter);
				hm.put(fields[0].trim().toUpperCase(), fields[1].trim()
						.toUpperCase());
			}

			br.close();

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String merchantName = "hello ACCOUNT) ";
		String nameDelimiter = " ";

		String mrchNm = merchantName.toUpperCase().trim();

		int delimiterIndex = mrchNm.lastIndexOf(nameDelimiter);

		if (delimiterIndex > 0) {
			firstNm = mrchNm.substring(0, mrchNm.lastIndexOf(nameDelimiter))
					.trim();
			lastNm = mrchNm.substring(mrchNm.lastIndexOf(nameDelimiter),
					mrchNm.length()).trim();

			if (hm.keySet().contains(lastNm)) {
				System.out.println("working   : -- " + lastNm + "    " + hm.get(lastNm) );
			}
		}
	}

}
