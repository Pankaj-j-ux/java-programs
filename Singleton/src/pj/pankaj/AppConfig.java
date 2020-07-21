package pj.pankaj;

public class AppConfig {

    private AppConfig (){
    }
    private static AppConfig obj = null;

    public static AppConfig getInstance() {
        if (obj==null)
            obj= new AppConfig();
        return obj;
    }

    public void checker() {
        System.out.println("this is only for checking purpose");
    }

}
