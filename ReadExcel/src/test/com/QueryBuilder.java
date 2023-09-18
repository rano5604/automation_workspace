package test.com;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.csv.CSVRecord;

public class QueryBuilder {
	
	String query;
	CSVRecord csvRecord;
	ArrayList<String> parameter = new ArrayList<String>();
	
	Pattern pattern;
	Matcher matcher;
	
	public QueryBuilder(String query,CSVRecord csvRecord){
		this.query=query;
		this.csvRecord=csvRecord;
	}

	Dictionary<String, String> dictionary = new Hashtable<>();


	public void parameterMatcher() {

		dictionary = new Hashtable<>();
		Pattern pattern = Pattern.compile("\\{\\w+\\}");
		Matcher matcher = pattern.matcher(query);
		int count = 0;
		while (matcher.find()) {
			count++;
			parameter.add(matcher.group());
		}
		
		if(csvRecord.size()==count)
		{
			for(int i=0;i<parameter.size();i++){
				for(int j=0;j<csvRecord.size();j++){
					if(parameter.get(i).substring(1,parameter.get(i).length()-1).matches(csvRecord.get(j)))
					{
						String p=parameter.get(i).substring(1,parameter.get(i).length()-1);
						dictionary.put(p,String.valueOf(j));
					}
						
				}
			}
		}
		else
			System.out.println("CSV having less parameter");

		System.out.println(dictionary);
	}

	String buildQuery(String query, CSVRecord csvRecord) {

		String seq;
		ArrayList<String> parameter1 = new ArrayList<String>();
		long doub = 0;
		int i;
		for (i = 0; i < csvRecord.size(); i++) {
			doub = 0;
			StringBuilder sb = new StringBuilder();
			try {
				doub = (long) Double.parseDouble(csvRecord.get(i));
			} catch (Exception e) {
				// TODO: handle exception
			}

			if (doub == 0) {

				sb.append("'");
				sb.append(csvRecord.get(i));
				sb.append("'");
				parameter1.add(sb.toString());
			} 
			else
			{
				sb.append(doub);
				parameter1.add(sb.toString());
			}
				
		}
		for (int j=0;j<csvRecord.size();j++)
		{
			
			seq=dictionary.get(parameter.get(j).substring(1,parameter.get(j).length()-1));
			query = query.replace(parameter.get(j), parameter1.get(Integer.parseInt(seq)));
		}
		//seq=dictionary.get(parameter.get(i).substring(1,parameter.get(i).length()-1));
		//query = query.replace(parameter.get(i).toString(), parameter1.get(Integer.valueOf(seq)));
		//query = query.replaceFirst("\\{\\w+\\}", parameter.get(0));
		return query;

	}


}
