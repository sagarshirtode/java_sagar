import javax.lang.model.util.ElementScanner14;

public class string {
    public static void main(String[] args) {
        String fname = "sagar";
        String lname = "sagas";
        System.out.println("f:"+fname);
        System.out.println("l:"+lname.length());
        for(int i=0;i<lname.length();i++){
            System.out.println( i + ":" + lname.charAt(i));
        }

        if(fname.compareTo(lname) == 0){
            System.out.println("Equeal");
        }else{
            System.out.println("Not Equeal");
        }
        lname = "Shirtode";
        System.out.println("L name:" +lname);
    }
}
