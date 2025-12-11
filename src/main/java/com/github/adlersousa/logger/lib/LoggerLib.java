/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.github.adlersousa.logger.lib;

/**
 *
 * @author Adler
 */
public class LoggerLib {

   private static ILog logInstance;
    
    public static void setTipoLog(String tipo) {
        if ("JSON".equalsIgnoreCase(tipo) || "JSONL".equalsIgnoreCase(tipo)) {
            logInstance = new LogJSON();
        } else {
            logInstance = new LogCSV(); 
        }
    }
    
    public static ILog getInstance() {
        if (logInstance == null) {
            logInstance = new LogCSV(); 
        }
        return logInstance;
    }
}
