public class Foto extends Filme {
    String fotografo;
    int pessoas;
    String local;
    String data;

    public Foto(String fotografo, int pessoas, String local,String data){
        this.fotografo=fotografo;
        this.pessoas=pessoas;
        this.local=local;
        this.data=data;
    }
    public String getFotografo(){
        return fotografo;
    }
    public void setFotografo(String Fotografo){
        this.fotografo=fotografo;
    }
    public int getPessoas(){
        return pessoas;
    }
    public void setPessoas(int pessoas){
        this.pessoas=pessoas;
    }
    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local= local;
    }
    public String getData(){
        return data;
    }
    public void setData(){
        this.data=data;
    }
}
