package about_stream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("测试目录\\测试文件.txt");
        OutputStream os = new FileOutputStream(file);
        os.write(97);
        InputStream is = new FileInputStream(file);
        int b;
        while((b = is.read()) != -1){
            System.out.println(b);
        }
    }
}
