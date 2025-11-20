package org.example.bridge;

public class NotaFiscalImpressora extends NotaFiscal {
    public NotaFiscalImpressora(Envio envio) {
        super(envio);
    }

    @Override
    public void emitir(String cliente, double valor) {
        System.out.println("Emitindo nota fiscal para " + cliente + ", valor: R$" + valor);
        envio.enviar();
    }
}