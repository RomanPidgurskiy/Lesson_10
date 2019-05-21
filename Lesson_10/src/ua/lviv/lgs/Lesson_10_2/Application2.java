package ua.lviv.lgs.Lesson_10_2;

public class Application2 {
	
      public static void main(String[] args) {
    	
    	  char[] LoudLetters =  new char[]{'а','я','о','у','ю','е','є','и','і','ї'};
    	  String strTemp;
    	  String str = "Мова англійська  отримує все більш широке поширення з кожним днем, нею "
    	  		+ "розмовляє більша частина населення планети, "
    	  		+ "що автоматично робить його міжнародною мовою спілкування.";
    
     for (int i=0; i<LoudLetters.length; i++) {
    	 strTemp = str.replace(LoudLetters[i], '-'); str = strTemp;
     }
    	  
    	      	  
    	  System.out.println(str);
   }



}
