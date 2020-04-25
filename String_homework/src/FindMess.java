
public class FindMess {
   public static void main(String args[]) {
      String mess = "书名:乌尔班大炮操作技巧 ,出版时间:1453.05.29,"+
                     "出版社:伊斯坦布尔出版社,价格:999.9元,页数:666页";
      if(mess.indexOf("大炮")!=-1) 
      { //判断mess中是否含有"大炮"
          System.out.println("图书信息包含有\"大炮\"");
      }
      
      int index=mess.indexOf(":", mess.indexOf(":")+1);//mess调用indexOf(String s,int start)返回mess中第2个冒号的位置
      String date = mess.substring(index+1,index+11);
      System.out.println(date);
      
      int pricePosition= mess.indexOf("价格");//mess调用indexOf(String s)返回首次出现"价格"的位置
      int endPosition=mess.indexOf("元");   
      String priceMess = mess.substring(pricePosition+3,endPosition);
      System.out.println("图书价格:"+priceMess);
      double price=Double.parseDouble(priceMess);
      if(price>=29) {
         System.out.println("图书价格"+price+"大于或等于29元");
      }  
      else {
         System.out.println("图书价格"+price+"小于29元");
      }
      
      index = mess.lastIndexOf(":", mess.length()-1);//mess调用lastIndexOf(String s,int start)返回最后一个冒号位置
      endPosition=mess.lastIndexOf("页");
      String pageMess = mess.substring(index+1,endPosition); 
      int p = Integer.parseInt(pageMess);
      if(p>=360) {
         System.out.println("图书的页数"+p+"大于或等于360");
      }  
      else {
         System.out.println("图书的页数"+p+"小于360");
      }
   }
}

