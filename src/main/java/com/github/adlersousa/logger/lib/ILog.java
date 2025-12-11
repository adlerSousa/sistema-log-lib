/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.github.adlersousa.logger.lib;

/**
 *
 * @author Adler
 */
public interface ILog {
    void escrever(String operacao, String nomeAlvo, String usuarioAutenticado, boolean sucesso, String mensagemFalha);
}