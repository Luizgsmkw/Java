public class Computador{
    private String Marca;
    private String Processador;
    private int TempoUso;
    private int NumeroImobilizado;
    
    //método construtor 
    public Computador(String m, String P, int t, int n){
        Marca = m;
        Processador = P;
        TempoUso = t;
        NumeroImobilizado = n;
    }
    public String getMarca(){
        return Marca;
    }
    public String getProcessador(){
        return Processador;
        }
    public int getTempoUso(){
        return TempoUso;
    }
    public int getNumeroImobilizado(){
        return NumeroImobilizado;
    }
    public void setMarca(String newMarca){
        Marca = newMarca;
    }
    public void setProcessador(String newProcessador){
        Processador = newProcessador;
    }
    public void setTempoUso(int newTempoUso){
        TempoUso = newTempoUso;
    }
    public void setNumeroImobilizado(int newNumeroImobilizado){
        NumeroImobilizado = newNumeroImobilizado;
    }   
    public void exibeDados(){
        System.out.println("Marca: " + Marca);
        System.out.println("Processador: " + Processador);
        System.out.println("TempoUso: " + TempoUso);
        System.out.println("NumeroImobilizado: " + NumeroImobilizado);
    }
}



