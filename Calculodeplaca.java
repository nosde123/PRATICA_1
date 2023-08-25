importar java. util. Scanner;

classe pública  Principal {
    public static void main(String[] args) {
        Scanner  = novo Scanner(System.em);

        Sistema. fora. print("Digite a placa do carro: ");
        String placa = scanner. nextLine();

        Sistema. fora. print("Digite o ano de fabricação: ");
        int anoFabricacao = scanner. próximoInt();

        Validar situação do carro
        String situacaoCarro = "";
        se (anoFabricacao <= 2010) {
            situacaoCarro = "Carro Velho";
        } senão se (anoFabricacao >= 2011 && anoFabricacao <=  2021 ) {
            situacaoCarro = "Carro Semi novo";
        } senão se (anoFabricacao == 2022) {
            situacaoCarro = "Carro Novo";
        }

        Substituir vogais por *
        String placaCensurada = placa. replaceAll("[aeiouAEIOU]", "*");

        Sistema. fora. println("Situação do carro: " + situacaoCarro);
        Sistema. fora. printf("Ano de fabricação: %d%n", anoFabricação); // Formatação sem casas decimais
        Sistema. fora. println("Placa censurada: " + placaCensurada);
    }
}
@nosde123
 
