

public class SalaDeCinema {
    public Cliente[] cadeiras = new Cliente[0];
    
    
    public void show(){
        if(cadeiras.length == 0){
            System.out.print("[ ");
            System.out.println(" ]");
        }else{
        System.out.print("[ ");
        for(int i = 0; i <this.cadeiras.length; i++){
            if (this.cadeiras[i] == null){
            System.out.print(" - ");
            }else System.out.print(this.cadeiras[i]+" ");
        }
        System.out.println(" ]");}
    }
    
    public void init(int n){
        this.cadeiras = new Cliente[n];
        System.out.println("success");
    }
    
    public boolean reservar(String id, String fone, String indice){
        Cliente c1 = new Cliente (id, fone, indice);
        for (int i = 0; i<this.cadeiras.length; i++){
         
            if (Integer.parseInt(indice) >= this.cadeiras.length){
                System.out.println("Failure: cadeira inexistente");
                return false;
            }
            if (this.cadeiras[i] == null){
                continue;
            }
            else if (this.cadeiras[i].id.equals(id)){
                System.out.println("Failure: cliente ja esta no cinema");
                return false;
            }
            
            else if (this.cadeiras[Integer.parseInt(indice)] != null) {
                System.out.println("failure: cadeira ja esta ocupada");
                return false;
            }
            
        }
        
        if (this.cadeiras [Integer.parseInt(indice)] == null){
                this.cadeiras[Integer.parseInt(indice)] = c1;
                return true;
        }
        return true;
    }
    
    public boolean cancelar(String nome){
        for (int i = 0; i<=cadeiras.length;i++) {
            if (i == cadeiras.length){
                return false;
            }
            else if (this.cadeiras[i] == null){
                continue;
            }
            else if (this.cadeiras[i].id.equals(nome)){
                this.cadeiras[i] = null;
                return true;
            }     
        }
        return true;
    }
}