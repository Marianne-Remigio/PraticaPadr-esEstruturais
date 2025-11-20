package org.example.bridge;

public class Aplicativo {
    public static void main(String[] args) {
        
        NotaFiscal nota1 = new NotaFiscalEmail(new EnvioEmail());
        nota1.emitir("Maria José", 1200.00);

        NotaFiscal nota2 = new NotaFiscalImpressora(new EnvioImpressora());
        nota2.emitir("João José", 942.00);

        NotaFiscal nota3 = new NotaFiscalEmail(new EnvioImpressora());
        nota3.emitir("Pedro Silva", 750.00);
    }
}
