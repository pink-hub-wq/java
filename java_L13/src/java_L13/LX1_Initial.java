package java_L13;

public class LX1_Initial {
	public void splitString(String str,String separator){
        String [] element = new String[100];
        int i = 0;
        int begin = 0;
        int end = -1;
        end = str.indexOf(separator);
        while (end != -1){
            element[i] = str.substring(begin,end);
            str = str.substring(end + 1);
            end = str.indexOf(separator);
            i++;
            element[i] = str;
        }
        for (int j = 0; j <= i; j++) {
            System.out.print(element[j] + "\t");
        }
        System.out.println();
    }
}
