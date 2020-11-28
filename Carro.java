/*
* @author Lara Danielly da Silva Oliveira
*/
package entities;

public class Carro extends Veiculo{

    public Carro(String modelo, String placa, float valorDiaria){
        super(placa, modelo, valorDiaria);
    }

    @Override
    public float valorAluguel(int qtdDias){
        return qtdDias * super.getValorDiaria();
    }  
}
