

public class Cliente {
        public String id;
        public String fone;
        public String indice;
        
    public Cliente(String id, String fone, String indice){
        this.id = id;
        this.fone = fone;
        this.indice = indice;
    }
    
    public String toString(){
        String x = this.id+":"+this.fone;
        return x;
    }
} 