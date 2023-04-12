import java.io.;
import java.util.zip.;

public class Unpacker {
public static void main(String[] args) {
try {
FileInputStream fis = new FileInputStream("archive.zip");
ZipInputStream zis = new ZipInputStream(fis);
ZipEntry entry = zis.getNextEntry();
while (entry != null) {
String filename = entry.getName();
FileOutputStream fos = new FileOutputStream(filename);
byte[] buffer = new byte[1024];
int length;
while ((length = zis.read(buffer)) > 0) {
fos.write(buffer, 0, length);
}
fos.close();
entry = zis.getNextEntry();
}
zis.close();
fis.close();
System.out.println("Unpacking completed successfully");
} catch (Exception e) {
System.out.println("Error in unpacking: " + e.getMessage());
}
}
}

