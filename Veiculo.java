/*
* @author Lara Danielly da Silva Oliveira
*/
package entities;


public abstract class Veiculo implements IVeiculo{
    private String placa;
    private String modelo;
    private float valorDiaria;
   

    public Veiculo(String placa, String modelo, float valorDiaria ){
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public float getValorDiaria(){
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria){
        this.valorDiaria = valorDiaria;
    }

    
    @Override
    public abstract float valorAluguel(int qtdDias);

}
//instanciar tipos especificos ao inves de genericos
//abstração utilizada para ter um tipo generico
//metodos abstratos, sao herdados e obrigam aos filhos a porem logicas no metodo
