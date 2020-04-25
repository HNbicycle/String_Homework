import java.util.StringTokenizer;

public class FoundPrice {
	   public static void main(String args[]) {
	      String s="蝾螈眼:9.8元，学习通程序员:0.9元 学习通的作业提醒功能:999元 服了:666元";
	      String s2="蝾螈眼:9.8学习通程序员:0.9学习通的作业提醒功能:999服了:666";
	      
	      String regex="[^0123456789.]" ; //匹配非数字的正则表达识
	      String regex2="[0123456789.]" ;
	      String digitMess=s.replaceAll(regex,"*");
	      String digitMess2=s2.replaceAll(regex2,"*");
	      
	      System.out.println(digitMess);
	      
	      StringTokenizer fenxi=new StringTokenizer(digitMess,"*");//创建fenxi,用*做分隔标记解析digitMess中的单词
	      StringTokenizer fenxi2=new StringTokenizer(digitMess2,"*");
	      
	      int number= fenxi.countTokens();   //fenxi调用countTokens()方法返回单词数量
	      double sum=0;
	      
	      while(fenxi.hasMoreTokens()) {
	          String str=fenxi.nextToken();//fenxi调用nextToken()方法返回单词
	          String str2=fenxi2.nextToken();
	          
	          System.out.print(str+"\t");
	          System.out.println(str2);
	          
	          sum=sum+Double.parseDouble(str);
	      }
	      System.out.println("购物小票中的商品种类："+number+"种"); 
	      System.out.println("购物小票中的价格总额："+sum+"元");
	    } 
	}
