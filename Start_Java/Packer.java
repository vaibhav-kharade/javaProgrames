import java.io.;
import java.util.zip.;

public class Packer {
public static void main(String[] args) {
String[] filenames = { "file1.txt", "file2.txt", "file3.txt" };
try {
FileOutputStream fos = new FileOutputStream("archive.zip");
ZipOutputStream zos = new ZipOutputStream(fos);
for (String filename : filenames) {
FileInputStream fis = new FileInputStream(filename);
ZipEntry entry = new ZipEntry(filename);
zos.putNextEntry(entry);
byte[] buffer = new byte[1024];
int length;
while ((length = fis.read(buffer)) > 0) {
zos.write(buffer, 0, length);
}
fis.close();
}
zos.close();
fos.close();
System.out.println("Packing completed successfully");
} catch (Exception e) {
System.out.println("Error in packing: " + e.getMessage());
}
}
}