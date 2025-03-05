package PilasColas;
public class Cola {
    private int n;
    private int inicio;
    private int fin;
    private long array[];;
    public Cola(int n){
        this.array = new long[n];
        this.inicio=0;
        this.fin=0;
        this.n=n;
    }
    public void insert(long e){
        if(!isFull()){
            this.array[fin]=e;
            this.fin++;
        }
        else{
            System.out.println("Cola Llena!!!");
        }
    }
    public long remove(){
        if(!isEmpty()){
            long n = array[this.inicio];
            this.inicio++;
            return n;
        }
        else{
            System.out.println("Cola Vacia!!!");
        }
        return 0l;
    }
    public long peek(){
        if(!isEmpty()){
            long n = array[this.inicio];
            return n;
        }
        else{
            System.out.println("Pila Vacia!!!");
        }
        return 0l;
    }
    public boolean isEmpty(){
        if(this.fin==inicio){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(this.fin==this.n){
            return true;
        }
        return false;
    }
    public void mostrar(){
        for(int i=this.inicio;i<this.n;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Cola c= new Cola(3);
        c.insert(1l);
        c.insert(2l);
        c.insert(3l);
        c.mostrar();
        System.out.println("");
        System.out.println(c.remove());
        System.out.println("");
        c.mostrar();
        System.out.println("");
        System.out.println(c.peek());
        System.out.println("");
        c.mostrar();
    }
    
}
