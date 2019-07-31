package storyteller;

public class Storyteller {
    public static void main(String[] args) {
// TODO Auto-generated method stub


        
        //comeca intro
        Narrador.getIntro();
                
        Pessoa jogador = new Pessoa();

                    jogador.setNome(Caixa.retorna("Qual o seu primeiro nome?\n\n"));
                    jogador.setIdade(Integer.parseInt(Caixa.retorna("Qual sua idade?\n\n")));
 


    	//comeca historia
		Historia historia = new Historia(5);
               
		Evento e1 = new Evento(Textos.getTextos(), "Olho o corpo", "Vou embora");
		Evento e2 = new Evento(Textos.getTextos(), "copo", "piano", "veneno");
		Evento e3 = new Evento(Textos.getTextos(), "c ta maluco", "oloco meu", "oloquinho meu");
		Evento e4 = new Evento(Textos.getTextos(), "botao 1", "botao 2", "botao 3");
                                     Evento e5 = new Evento(Textos.getTextos(jogador), "socar o assassino", "chorar","gritar");
                                   

		
		historia.addHistoria(e1);
		historia.addHistoria(e2);
		historia.addHistoria(e3);
		historia.addHistoria(e4);
                                    historia.addHistoria(e5);
                

		
                
		historia.getHistoria();




    }
    
}