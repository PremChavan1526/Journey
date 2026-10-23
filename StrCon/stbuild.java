package StrCon;

public class stbuild {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        sb.append("Prem");
        sb.append("Chavan");

        System.out.println(sb);

        //insert

        sb.insert(4, "a");
        System.out.println(sb);
    }
    
}
