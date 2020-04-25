import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectGrade {
	static String grade="ѧϰͨ87�֣�����76�֣�Ӣ��96��";
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
			}//if����
		}//for����
		average=sum/doubleNum;
		
		System.out.println("byStringSplit����:");
		System.out.println("�����Ŀ�ܳɼ�Ϊ:"+sum);
		System.out.println("�����Ŀƽ���ɼ�Ϊ:"+average);
	}//byStringSplit()����

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
		}//while����
			average=sum/integerNum;
			
			System.out.println("byStringTonkenizer����:");
			System.out.println("�����Ŀ�ܳɼ�Ϊ:"+sum);
			System.out.println("�����Ŀƽ���ɼ�Ϊ:"+average);
	}//byStringTonkenizer()����

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
		}//while����
		average=sum/doubleNum;
		
		System.out.println("byPatternMatch����:");
		System.out.println("�����Ŀ�ܳɼ�Ϊ:"+sum);
		System.out.println("�����Ŀƽ���ɼ�Ϊ:"+average);
	}//byPatternMatch()����
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byStringSplit();
		byStringTonkenizer();
		byPatternMatch();
	}
}
