
public class FindMess {
   public static void main(String args[]) {
      String mess = "����:�ڶ�����ڲ������� ,����ʱ��:1453.05.29,"+
                     "������:��˹̹����������,�۸�:999.9Ԫ,ҳ��:666ҳ";
      if(mess.indexOf("����")!=-1) 
      { //�ж�mess���Ƿ���"����"
          System.out.println("ͼ����Ϣ������\"����\"");
      }
      
      int index=mess.indexOf(":", mess.indexOf(":")+1);//mess����indexOf(String s,int start)����mess�е�2��ð�ŵ�λ��
      String date = mess.substring(index+1,index+11);
      System.out.println(date);
      
      int pricePosition= mess.indexOf("�۸�");//mess����indexOf(String s)�����״γ���"�۸�"��λ��
      int endPosition=mess.indexOf("Ԫ");   
      String priceMess = mess.substring(pricePosition+3,endPosition);
      System.out.println("ͼ��۸�:"+priceMess);
      double price=Double.parseDouble(priceMess);
      if(price>=29) {
         System.out.println("ͼ��۸�"+price+"���ڻ����29Ԫ");
      }  
      else {
         System.out.println("ͼ��۸�"+price+"С��29Ԫ");
      }
      
      index = mess.lastIndexOf(":", mess.length()-1);//mess����lastIndexOf(String s,int start)�������һ��ð��λ��
      endPosition=mess.lastIndexOf("ҳ");
      String pageMess = mess.substring(index+1,endPosition); 
      int p = Integer.parseInt(pageMess);
      if(p>=360) {
         System.out.println("ͼ���ҳ��"+p+"���ڻ����360");
      }  
      else {
         System.out.println("ͼ���ҳ��"+p+"С��360");
      }
   }
}

