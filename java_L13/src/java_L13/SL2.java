package java_L13;

public class SL2 {
	public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("seiryo");
        sBuffer.insert(0,"hello");
        sBuffer.replace(5,6,",");
        sBuffer.delete(5,6);
        System.out.println(sBuffer);
        sBuffer.reverse();
        System.out.println(sBuffer);
        System.out.println(sBuffer.length());
        System.out.println(sBuffer.capacity());
        sBuffer.setLength(5);
        System.out.println(sBuffer);
    }
}
