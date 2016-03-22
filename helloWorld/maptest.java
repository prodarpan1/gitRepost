import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;


public class maptest {

	public static void main(String[] args) {
		String val= "85302024038648|8041|Wilson&amp; Chiropractic &amp; &apos; helloSpo|&quot;VENTURA&quot;|&quot;000&quot;|06|930013506|US|498895000116921&#37;|498895&#37;|4008";
		String xmlParse = args[0];
		final String TEST_FILE_FS = "\\|";
		HashMap<String,String> xmlMap = new HashMap<String,String>();
		
		String line = "";
		FileReader fr;
		try {
			
			String[] flds = null;
			fr = new FileReader(xmlParse);
			BufferedReader br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null) {
				flds = line.split(TEST_FILE_FS);
				xmlMap.put(flds[0], flds[1]);
			}
			
			br.close();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//String val = "85302024038648|8041|Wilson&amp; Chiropractic &amp; &apos; helloSpo|VENTURA|000|06|930013506|US|498895000116921|498895|4008";
		String newVal = "";
/*		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("&amp;", "&");
		hm.put("&apos;", "\"");
		hm.put("hello", "hi");*/
		
		Iterator itr = xmlMap.keySet().iterator();
		while(itr.hasNext())
		{
			String key   = (String) itr.next();
			String value =  xmlMap.get(key);
			
			if(val.contains(key))
			{
				val = val.replaceAll(key, value);
			}
		}

		
		System.out.println("New Value  :-   " + val );
	}
}