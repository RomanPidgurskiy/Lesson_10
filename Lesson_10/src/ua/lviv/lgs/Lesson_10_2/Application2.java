package ua.lviv.lgs.Lesson_10_2;

public class Application2 {
	
      public static void main(String[] args) {
    	
    	  char[] LoudLetters =  new char[]{'�','�','�','�','�','�','�','�','�','�'};
    	  String strTemp;
    	  String str = "���� ���������  ������ ��� ���� ������ ��������� � ������ ����, ��� "
    	  		+ "��������� ����� ������� ��������� �������, "
    	  		+ "�� ����������� ������ ���� ���������� ����� ����������.";
    
     for (int i=0; i<LoudLetters.length; i++) {
    	 strTemp = str.replace(LoudLetters[i], '-'); str = strTemp;
     }
    	  
    	      	  
    	  System.out.println(str);
   }



}
