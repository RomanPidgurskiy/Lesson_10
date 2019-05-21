package ua.lviv.lgs.Lesson_3;

import java.util.Arrays;

public class Application3 {

	

	public static void main(String[] args) {
		
		
		int cout = 0;
		String[] sentence = " abc abcde abcdef abcde abc abc abcdef abcde abc adcdef.".split(" ");
		
		for (String str : sentence) {
			cout++;	
		}
     System.out.println("Кількість слів  у реченні  " + cout);
     
     
     String[] text = "Abc abcde abcdef. Abcde abc abc. Abcdef abcde abc.".split("\\.");
      cout = 0;
     for (String str : text) {
			cout++;	
		}
     System.out.println("Кількість речень в тексті  " + cout);
     
     
     
     Arrays.sort(sentence);

     String maxWord = "", word = "";
     int maxCount = 0, count = 1;

     for (String s : sentence) {
    	 
         if (s.equals(word)) {
        	 
             count++;
         } else {
             if (count > maxCount) {
                 maxCount = count;
                 maxWord = word;
             }
             word = s;
             count = 1;
         }
     }

     if (count > maxCount) {
         maxCount = count;
         maxWord = word;
     }

     System.out.println("Cлово найчастіше зустрічається в реченні: " + maxWord + " кількість раз " + maxCount );
   
     
	}

}
