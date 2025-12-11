/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.adlersousa.logger.lib;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Adler
 */
public class LogJSON implements ILog {

    private static final String ARQUIVO = "sistema.log"; // Mesmo arquivo 

    @Override
    public void escrever(String operacao, String nomeAlvo, String usuarioAutenticado, boolean sucesso, String mensagemFalha) {
        try (FileWriter fw = new FileWriter(ARQUIVO, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            LocalDateTime agora = LocalDateTime.now();
            String data = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String hora = agora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            String msg = mensagemFalha == null ? "" : mensagemFalha;
            String status = sucesso ? "SUCESSO" : "FALHA";
            
            String json = String.format(
                "{\"status\": \"%s\", \"operacao\": \"%s\", \"usuario_alvo\": \"%s\", \"data\": \"%s\", \"hora\": \"%s\", \"usuario_auth\": \"%s\", \"mensagem_erro\": \"%s\"}",
                status, operacao, nomeAlvo, data, hora, usuarioAutenticado, msg
            );
            
            pw.println(json);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
