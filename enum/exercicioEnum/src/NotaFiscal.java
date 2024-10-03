public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private NotaFiscalEnum status = NotaFiscalEnum.NAO_EMITIDA;

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

    public NotaFiscalEnum getStatus() {
        return status;
    }

    public void cancelar() {
        if ((status == NotaFiscalEnum.EMITIDA && getValor() >= 1_000)
                || status == NotaFiscalEnum.CANCELADA) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        status = NotaFiscalEnum.CANCELADA;
    }

    public void emitir() {
        if (status == NotaFiscalEnum.EMITIDA || status == NotaFiscalEnum.CANCELADA) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = NotaFiscalEnum.EMITIDA;
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), getStatus());
    }

}