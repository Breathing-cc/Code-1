package about_files;

import java.io.File;

public class ListDir {
    public static void listDir(File dir){
        File[] files = dir.listFiles();
        for(File file : files){
            if(file.isDirectory()){
                listDir(file);
            }else{
                System.out.println(file.getAbsolutePath() + ";" + file.length());
            }
        }
    }

    public static void main(String[] args) {
        listDir(new File("F:\\github"));
    }
}
