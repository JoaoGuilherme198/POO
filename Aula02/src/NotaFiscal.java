import java.util.ArrayList;

public class NotaFiscal {
    public int numero;
    public String data;
    public float desconto;
    private Cliente cliente;
    private Entregador entregador;
    private Empresa empresa;
    public ArrayList<ItemNota> itens;
    
    public NotaFiscal() {
        this.cliente = new Cliente();
        this.entregador = new Entregador();
        this.empresa = new Empresa();
        this.itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<ItemNota> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemNota> itens) {
        this.itens = itens;
    }
}
