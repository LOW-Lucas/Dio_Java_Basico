public class MinhaClasse {
    public static void main(String[] args){
        int a = 5;
        final String b = "Palmeiras";
        
        System.out.println(Integer.toString(a)+" "+b);

        String primeironome = "Lucas";
        String segundoNome = "Silva";
        String nomeCompleto = NomeCompleto(primeironome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String NomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
