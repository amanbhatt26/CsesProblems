import java.util.Collections;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
class CreatingStrings{
	
	private static void recurse(List<String> moves, StringBuilder sb, int index){
		
		if(index == sb.length()){
			moves.add(sb.toString());
			return;
		}
		Set<Character> seen = new HashSet();
		for(int i=index;i<sb.length();i++){
			if(seen.contains(sb.charAt(i))) continue;
			seen.add(sb.charAt(i));	
				char temp = sb.charAt(index);
				sb.setCharAt(index,sb.charAt(i));
				sb.setCharAt(i,temp);

				recurse(moves, sb, index+1);
				temp = sb.charAt(index);
				sb.setCharAt(index,sb.charAt(i));
				sb.setCharAt(i,temp);
	
			
			
		}	
	}
	public static void main(String args[]) throws IOException {
		BufferedReader sc = new BufferedReader( new InputStreamReader(System.in));	

		PrintWriter pr = new PrintWriter(System.out);
		String str  = sc.readLine();
		
		char[] charArray = str.toCharArray();
		
		Arrays.sort(charArray);
		
		StringBuilder sb = new StringBuilder(new String(charArray));
		
					
		List<String> moves = new ArrayList();
		
		recurse(moves, sb, 0);
		Collections.sort(moves);
		pr.println(moves.size());
		Iterator<String> iter = moves.iterator();
		while(iter.hasNext()) pr.println(iter.next());
		pr.close();
		
	}
}
