public class Main {
    public static void main(String[] args) {
        String arq = "teste.txt";

        String texto = "Eu gosto da Emanuelle";

        if(Arquivo.Write(arq, texto)){
            System.out.println("Arquivo salvo com sucesso!");
        }
        else
            System.out.println("Erro ao salvar o arquivo!");
    }
}