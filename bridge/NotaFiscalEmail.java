package org.example.bridge;

public class NotaFiscalEmail extends NotaFiscal {
    public NotaFiscalEmail(Envio envio) {
        super(envio);
    }

    @Override
    public void emitir(String cliente, double valor) {
        System.out.println("Emitindo nota fiscal para " + cliente + ", valor: R$" + valor);
        envio.enviar();
    }
}