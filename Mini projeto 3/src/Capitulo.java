import java.util.Scanner; 

public class Capitulo{

    Personagem perso;
    int alterarEnergia1;
	Personagem vilao;
	int alterarEnergia2;
    String texto;
    String escolha1;
    String escolha2;
    Scanner input;

    Capitulo(Personagem perso, 
             int alterarEnergia1, 
             Personagem vilao, 
             int alterarEnergia2, 
             String texto, 
             String escolha1, 
             String escolha2, 
             Scanner input){

        this.perso = perso;
        this.alterarEnergia1 = alterarEnergia1;
		this.vilao = vilao;
        this.alterarEnergia2 = alterarEnergia2;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.input = input;
    }

    void mostrar(){
        perso.alterarEnergia(alterarEnergia1);
		vilao.alterarEnergia(alterarEnergia2);
        System.out.println(this.texto);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
    }

    int opcao(){
        int resultado = 0;
        if (this.escolha1 != null && this.escolha2 != null){
                String receba = input.nextLine();
                if(receba.equalsIgnoreCase(escolha1)){
                    resultado = 1;
                } else if(receba.equalsIgnoreCase(escolha2)) {
                    resultado = 2;
                }
        } 
        return resultado;
    }
}