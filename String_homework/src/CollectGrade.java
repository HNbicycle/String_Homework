import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectGrade {
	static String grade="学习通87分，物理76分，英语96分";
	int i=1;	
	
	 static void byStringSplit() {
		double sum=0;
		double average=0;

		String regex="[^0123456789.]" ;
		String[] split=grade.split(regex);
		
		int doubleNum=0;
		for(int i=0;i<split.length;i++) {
			if(!"".equals(split[i])) {
				sum=sum+Integer.parseInt(split[i]);
				doubleNum++;
			}//if结束
		}//for结束
		average=sum/doubleNum;
		
		System.out.println("byStringSplit方法:");
		System.out.println("三项科目总成绩为:"+sum);
		System.out.println("三项科目平均成绩为:"+average);
	}//byStringSplit()结束

	static void byStringTonkenizer() {
		double sum=0;
		double average=0;
		
		String regex="[^0123456789]" ;
		String digitMess=grade.replaceAll(regex,"*"); 
		StringTokenizer tokenizer=new StringTokenizer(digitMess,"*");
		int integerNum=0;
		
		while(tokenizer.hasMoreTokens()) {
			sum=sum+Integer.parseInt(tokenizer.nextToken());
			integerNum++;
		}//while结束
			average=sum/integerNum;
			
			System.out.println("byStringTonkenizer方法:");
			System.out.println("三项科目总成绩为:"+sum);
			System.out.println("三项科目平均成绩为:"+average);
	}//byStringTonkenizer()结束

	static void byPatternMatch() {
		double sum=0;
		double average=0;
		
		String regex="[0123456789]+" ;
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(grade);
		
		System.out.println(m);
		
		int doubleNum=0;
		while(m.find()) {
			sum=sum+Double.parseDouble(m.group());
			doubleNum++;
		}//while结束
		average=sum/doubleNum;
		
		System.out.println("byPatternMatch方法:");
		System.out.println("三项科目总成绩为:"+sum);
		System.out.println("三项科目平均成绩为:"+average);
	}//byPatternMatch()结束
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byStringSplit();
		byStringTonkenizer();
		byPatternMatch();
	}
}
