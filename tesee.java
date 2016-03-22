import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;


public class tesee {

	public static void main(String arg[])
	{
		
		HashSet hset = func();
		
		
/*		String str1 = "A Hello  how  Are  you  ";
		String first1 = str1.toUpperCase().trim();
		String atlFirst1 = "";
		String tempfirst1= first1;
		String last1 = "";
		int indexNo = first1.indexOf(" ");
		
		while (indexNo > 0)
		{
			atlFirst1 = first1.substring(0,indexNo +1).trim();
			last1 = first1.substring(tempfirst1.indexOf(" ")+1);
			System.out.println("Print1 indexOf(' ')   " + indexNo );
			System.out.println("Print1 |"+ atlFirst1 +   "|" +  last1 + "|");
			
			tempfirst1 = atlFirst1;
			indexNo = last1.indexOf(" ");
			
		}*/
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("\n\n\n------------------------------\n\n\n");
			
		String str = " A Hello how Are you  ";  //
		
		String first = str.toUpperCase().trim();
		String atlFirst = "";
		String tempfirst= first;
		String last = "";
		String actuallast= "";
		String actualfirst= "";
		int lastIndex = first.lastIndexOf(" ");
		
		while(lastIndex > 0){
			atlFirst = tempfirst.substring(0,lastIndex).trim();
			last = first.substring(tempfirst.lastIndexOf(" ")+1);
			System.out.println("Print1 lastIndexOf(' ')   " + lastIndex );
			System.out.println("Print1 |"+ atlFirst +   "|" +  last + "|");
			
			al.add(last);
			//lhm.put(last, atlFirst);		
			tempfirst = atlFirst;
			lastIndex = atlFirst.lastIndexOf(" ");
			
		}
			
		int i =0; 
		//String abc= "";
		for( i = al.size()-1 ; i>=0 ;i --)
		{			
			//System.out.println(al.get(i));
			if(hset.contains(al.get(i)))
			{
			System.out.println("Working ----"  + al.get(i));
			System.out.println("last word ---- " +first.substring(0, first.lastIndexOf(al.get(i))));
			actuallast = al.get(i);
			break;
			}
		}
		
		if(actuallast != null)
		{
			
		}
		
/*		for(int i = lhm.size() -1 ; i >= 0 ; i--)
		{
			System.out.println(lhm.keySet());
		}
		
		for (int j = 0 ; j <  lhm.size() ;j++)
		{
			System.out.println(lhm.keySet());
		}*/
		
		/*
		String mrchNm = "Hello  how  Are  you  ";
		
	//	System.out.println("lastindex  " +  mrchNm.lastIndexOf(" "));
	//	System.out.println("lastindex  " +  mrchNm.lastIndexOf(" ",11));
	//	System.out.println("lastindex  " +  mrchNm.lastIndexOf(" "));
		
		String strMrchNm = mrchNm.toString().toUpperCase().trim();
		String altMrchNm = strMrchNm.substring(0, strMrchNm.lastIndexOf(" ")+1).trim();
		String lastToken = strMrchNm.substring(strMrchNm.lastIndexOf(" ")+1);
		System.out.println("Print1 lastIndexOf(' ')" + strMrchNm.lastIndexOf(" ") );
		System.out.println("Print1 |"+ altMrchNm +   "|" +  lastToken + "|");
		
		String altMrchNm1 = altMrchNm.substring(0, altMrchNm.lastIndexOf(" ")+1).trim();
		String lastToken1 = strMrchNm.substring(altMrchNm.lastIndexOf(" ")+1);
		System.out.println("Print1 lastIndexOf(' ')" + altMrchNm.lastIndexOf(" ") );
		System.out.println("Print2 |"+ altMrchNm1 +   "|" +  lastToken1 + "|");
		
		String altMrchNm2 = altMrchNm1.substring(0, altMrchNm1.lastIndexOf(" ")+1).trim();
		String lastToken2 = strMrchNm.substring(altMrchNm1.lastIndexOf(" ")+1);	
		System.out.println("Print1 lastIndexOf(' ')" + altMrchNm1.lastIndexOf(" ") );
		System.out.println("Print3 |"+ altMrchNm2 +   "|" +  lastToken2 + "|");
		
		String altMrchNm3 = altMrchNm2.substring(0, altMrchNm2.lastIndexOf(" ")+1).trim();
		String lastToken3 = strMrchNm.substring(altMrchNm2.lastIndexOf(" ")+1);	
		System.out.println("Print1 lastIndexOf(' ')" + altMrchNm2.lastIndexOf(" ") );
		System.out.println("Print4 |"+ altMrchNm3 +   "|" +  lastToken3 + "|");
		
		
		
		
		
		
			
		if(hset.contains(lastToken) || hset.contains(lastToken1) || hset.contains(lastToken2))
		{
			System.out.println("working1212");
		}
		
		
		System.out.println("altMrchNm  " +  altMrchNm);
		System.out.println("altMrchNm1  " +  altMrchNm1);
		System.out.println("altMrchNm2  " +  altMrchNm2);
		System.out.println("lastToken  "+ lastToken);
		*/
	}
	
	
	
	public static HashSet func()
	{
		HashSet hs = new HashSet();
		hs.add("RAM");
		hs.add("MOHAN");
		hs.add("MOHAN1");
		hs.add("MOHAN2");
		hs.add("HOW ARE YOU");
		hs.add("MOHAN3");
		hs.add("MOHAN4");
		hs.add("ARE YOU");
		hs.add("YOU");
		System.out.println(hs);
		
		return hs;
		
	}
	
}
