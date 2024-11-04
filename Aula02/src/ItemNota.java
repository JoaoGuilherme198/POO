public class ItemNota {
    private float quantidade;
    private float valor;
    public Produto produto;
    public ItemNota(){
        this.produto = new Produto();
    }
    private NotaFiscal notaFiscal;
}
