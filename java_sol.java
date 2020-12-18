import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			String s1=in.next(), s2=in.next(), s3=in.next();
			String tmp="";
			for(int i=0; i<(int)s3.length(); ++i) {
				if(s3.charAt(i)-'0'>=0&&s3.charAt(i)-'0'<=9)
					tmp+=s3.charAt(i);
				for(int j=0; j<(int)s1.length(); ++j)
					if(Character.toLowerCase(s3.charAt(i))==s1.charAt(j)) {
						if(Character.isUpperCase(s3.charAt(i)))
							tmp+=Character.toUpperCase(s2.charAt(j));
						else
							tmp+=s2.charAt(j);
					}
			}
			out.println(tmp);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
