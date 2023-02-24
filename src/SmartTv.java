public class SmartTv {
    /* Exercitando 
        Criar um exemplo de uma classe para representar uma Tv, onde:
        1 - Tenha características : ligada(boolean), canal(int) e volume(int)
        2 - Nossa TV poderá ligar e desiligar e assim mudar o estado ligada
        3 - Nossa tv aumentará o volume sempre de 1 em 1
        4 - Nossa Tv poderá mudar de canal de 1 em 1 ou definindo o número correspondente
    */

    boolean ligada = false;
    int volume = 20;
    int canal = 1;

    public void onOff(){
        this.ligada = !this.ligada;
    }

    public void aumentaVolume(){
        volume += 1;
    }

    public void diminuiVolume(){
        volume -= 1;
    }

    public void proxCanal(){
        canal += 1;
    }

    public void voltarCanal(){
        if(canal == 1)
            System.out.println("O canal não pode ser menor do que 0");
        else
            canal -=1;
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
}
