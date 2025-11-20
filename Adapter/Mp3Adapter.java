package org.example.adapter;



public class Mp3Adapter {
    private Mp3Player mp3Player;

    public Mp3Adapter() {
        this.mp3Player = new Mp3Player();
    }

    public void playWavArquivo(String nomeArquivo) {
        String nomeMp3 = nomeArquivo.replace(".wav", ".mp3");
        mp3Player.playMp3(nomeMp3);
    }
}