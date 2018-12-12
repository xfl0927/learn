package org.xfl.IO;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args){
        createDirs();
    }

    public static void createDirs(){
        String url = "E:/data/file";
        File dirs = new File(url);
        if (!dirs.exists()){
            dirs.mkdirs();
            createFile(url,"/new.png");
        } else {
            createFile(url,"/exists.png");
        }
    }

    public static void createFile(String dir,String fileType){
        try {
            File file = new File(dir + fileType);
            file.createNewFile();
            System.out.println("filePathSeparator：" + File.pathSeparator);

            System.out.println("fileSeparator：" + File.separator);

            System.out.println("fileSeparatorChar：" + File.separatorChar);

            System.out.println("file文件名：" + file.getName());
            System.out.println("file父目录ming:" + file.getParent());
            System.out.println("fileAbsolutePath：" + file.getAbsolutePath());
            System.out.println("fileCanonicalPath：" + file.getCanonicalPath());
            System.out.println("filePath：" + file.getPath());
            System.out.println("fileCanExecute：" + file.canExecute());
            System.out.println("fileParentFile：" + file.getParentFile());
            System.out.println("fileTotalSpace:" + file.getTotalSpace()/(1024*1024*1024) + "G");
            System.out.println("fileUsableSpace：" + file.getUsableSpace()/(1024*1024*1024) + "G");
            System.out.println("fileFreeSpace：" + file.getFreeSpace()/(1024*1024*1024) + "G");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
