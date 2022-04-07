package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      Animacao a1 = new Animacao();
      
      
      for (int i = 0; i < (lombrigas.length); i++) {
    	 String cenas[] = new String[lombrigas[i].length()-6];
         cenas = a1.anima(lombrigas[i]);
         tk.gravaPasso("=====");
         for(int j = 0; j < cenas.length; j++) {
        	 tk.gravaPasso(cenas[j]);
         }
      }  
      tk.stop();
   }
}
