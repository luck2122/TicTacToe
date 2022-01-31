package TicTacToe.configuration;

import TicTacToe.jframes.ErrorFrame;

import java.io.*;
import java.util.Scanner;

public class Config {

    private String spieler;
    private int win;
    private String infos = "";
    private final String dirName = "./Infos/";
    private final String fileName = "info.txt";
    private File file;

    public Config(String spieler, int win){
        this.spieler = spieler;
        this.win = win;
        checkForFile();
    }

    public Config(){
        checkForFile();
    }

    public void wirteWin() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(dirName + fileName);
        if(fos != null){
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream ps = new PrintStream(bos);
            ps.println(spieler + " Siege: " + win + ",\n");

            ps.close();
        }
    }

    public String readInfos() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(dirName + fileName);
        if(fis != null){
            try{
                BufferedInputStream bis = new BufferedInputStream(fis);
                Scanner scanner = new Scanner(bis);
                infos = scanner.nextLine();
                scanner.close();
            }catch (Exception e){
                new ErrorFrame();
            }

        }
        return infos;
    }

    private void checkForFile(){

        try{
            file = new File(dirName + fileName);
            if(file.createNewFile()){
                //File wurde erstellt
            }else{
                //File existiert bereits
            }

        }catch (IOException e){
            new ErrorFrame();
        }
    }
}
