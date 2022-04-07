package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      Animacao a1 = new Animacao();
      
      
      for (int i = 0; i < (lombrigas.length); i++) {
    	 String cenas_do_aq[] = new String[lombrigas[i].length()-6];
         cenas_do_aq = a1.anima(lombrigas[i]);
         tk.gravaPasso("=====");
         for(int j = 0; j < cenas_do_aq.length; j++) {
        	 tk.gravaPasso(cenas_do_aq[j]);
         }
      }  
      tk.stop();
   }
}
