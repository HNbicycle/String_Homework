import java.util.StringTokenizer;

public class FoundPrice {
	   public static void main(String args[]) {
	      String s="�����:9.8Ԫ��ѧϰͨ����Ա:0.9Ԫ ѧϰͨ����ҵ���ѹ���:999Ԫ ����:666Ԫ";
	      String s2="�����:9.8ѧϰͨ����Ա:0.9ѧϰͨ����ҵ���ѹ���:999����:666";
	      
	      String regex="[^0123456789.]" ; //ƥ������ֵ�������ʶ
	      String regex2="[0123456789.]" ;
	      String digitMess=s.replaceAll(regex,"*");
	      String digitMess2=s2.replaceAll(regex2,"*");
	      
	      System.out.println(digitMess);
	      
	      StringTokenizer fenxi=new StringTokenizer(digitMess,"*");//����fenxi,��*���ָ���ǽ���digitMess�еĵ���
	      StringTokenizer fenxi2=new StringTokenizer(digitMess2,"*");
	      
	      int number= fenxi.countTokens();   //fenxi����countTokens()�������ص�������
	      double sum=0;
	      
	      while(fenxi.hasMoreTokens()) {
	          String str=fenxi.nextToken();//fenxi����nextToken()�������ص���
	          String str2=fenxi2.nextToken();
	          
	          System.out.print(str+"\t");
	          System.out.println(str2);
	          
	          sum=sum+Double.parseDouble(str);
	      }
	      System.out.println("����СƱ�е���Ʒ���ࣺ"+number+"��"); 
	      System.out.println("����СƱ�еļ۸��ܶ"+sum+"Ԫ");
	    } 
	}
