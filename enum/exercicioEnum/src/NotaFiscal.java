public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscalEnum status = StatusNotaFiscalEnum.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscalEnum getStatus() {
        return status;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValor())) {
            status = StatusNotaFiscalEnum.CANCELADA;
        } else {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }
    }

    public void emitir() {
        if (getStatus().podeMudarParaEmitido(getValor())) {
            status = StatusNotaFiscalEnum.EMITIDA;
        } else {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), getStatus().getDescricao());
    }

}