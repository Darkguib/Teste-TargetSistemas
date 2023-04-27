public class Fibonnaci {
    public void calcuaSequencia(int x){
        int primeiro = 0;
        int segundo = 1;
        int soma = 0;
        for(int i = 0; i <= x; i++){
           soma = primeiro + segundo;
           primeiro = segundo;
           segundo = soma;
           if(x == soma){
               System.out.println("Está dentro da sequência!");
               break;
           }
           else if(x < soma){
               System.out.println("Não está dentro da sequência!");
               break;
           }
        }

    }

}
