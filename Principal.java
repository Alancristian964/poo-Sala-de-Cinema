
import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaDeCinema sala = new SalaDeCinema();
        String[] comando;
        
        
        System.out.println("Bem vindo a sala de Cinema!"
                
                + "\n       Os comando são:"
                + "\ninit: Para iniciar um cinema.             ex: init 5"
                + "\nshow: para mostrar detalhes do cinema."
                + "\nreservar: Para reservar um lugar.         ex: reservar Allan 9200 1"
                + "\ncancelar: Para cancelar uma reserva.      ex: cancelar allan"
                + "\nend: Para sair.\n");
        
        while(true){
            comando = sc.nextLine().split(" ");
            
            if(comando[0].equals("end")){
                System.out.println("  Até a proxima :)");
                break;
            }
            
            switch(comando[0]){
                case ("init"):
                    if (comando.length!=2){
                        System.out.println("Adicione init e em seguida um valor");
                    }else{sala.init(Integer.parseInt(comando[1]));}
                    break;
                    
                case ("show"):
                    sala.show();
                    break;
                    
                case "reservar":
                    if (comando.length!=4){
                        System.out.println("tente novamente");
                    }else if (sala.reservar(comando[1], comando[2],comando[3])){
                        System.out.println("success");
                    } 
                    break;
                    
                case ("cancelar"):
                    if (comando.length!=2){
                        System.out.println("tente novamente");
                    }else if (sala.cancelar(comando[1])){
                        System.out.println("success");
                    } else {
                        System.out.println("failure: cliente nao esta no cinema");
                    }
                    break;
                    
                default:
                    System.out.println("Tente novamente");
            }
        }
    }
}
