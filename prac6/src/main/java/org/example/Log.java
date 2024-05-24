package org.example;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger;
    FileHandler filehandler;

    public Log(String logger_name, String file_name) throws SecurityException, IOException {
        File file = new File(file_name);
        filehandler = new FileHandler(file_name, true);
        logger = Logger.getLogger(logger_name);
        logger.addHandler(filehandler);
        logger.setLevel(Level.ALL); // Установим уровень логирования на ALL для захвата всех сообщений
        SimpleFormatter formatter = new SimpleFormatter();
        filehandler.setFormatter(formatter);
    }
}
