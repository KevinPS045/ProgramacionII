package PilasColas;
public class Pila {
    private int n;
    private int top;
    private long array[];;
    public Pila(int n){
        this.array = new long[n];
        this.top=-1;
        this.n=n;
    }
    public void push(long e){
        if(!isFull()){
            this.top++;
            this.array[top]=e;
        }
        else{
            System.out.println("Pila Llena!!!");
        }
    }
    public long pop(){
        if(!isEmpty()){
            long n = array[top];
            this.top--;
            return n;
        }
        else{
            System.out.println("Pila Vacia!!!");
        }
        return 0l;
    }
    public long peek(){
        if(!isEmpty()){
            long n = array[top];
            return n;
        }
        else{
            System.out.println("Pila Vacia!!!");
        }
        return 0l;
    }
    public boolean isEmpty(){
        if(this.top==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(this.top==n-1){
            return true;
        }
        return false;
    }
    public void mostrar(){
        for(int i=this.top;i>=0;i--){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Pila p= new Pila(3);
        p.push(1l);
        p.push(2l);
        p.push(3l);
        p.mostrar();
        System.out.println("");
        System.out.println(p.pop());
        System.out.println("");
        p.mostrar();
        System.out.println("");
        System.out.println(p.peek());
        System.out.println("");
        p.mostrar();
    }
    
}
