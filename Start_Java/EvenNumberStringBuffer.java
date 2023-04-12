public class EvenNumberStringBuffer {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer();
for (int i = 2; i <= 100; i += 2) {
sb.append(i + " ");
}
System.out.println(sb.toString());
}
}