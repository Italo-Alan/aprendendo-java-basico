public class Usuario {
    public static void main(String[] args) throws Exception {
        //Estamos aqui criando uma classe
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // smartTv.onOff();
        // System.out.println("Novo status da Tv: " + smartTv.ligada);
        
        // smartTv.onOff();
        // System.out.println("Novo status da Tv: " + smartTv.ligada);

        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
