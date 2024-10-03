public class App {
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal(100, "Kit pratos zeus - kit E", 3_500);
        System.out.println(nf.getDescricaoCompleta());

        nf.emitir();
        System.out.println(nf.getDescricaoCompleta());

        nf.cancelar(); // IllegalStateException
        System.out.println(nf.getDescricaoCompleta());
    }
}
