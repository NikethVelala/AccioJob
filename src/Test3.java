import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class Test3 {
    HashMap<String, Double> pricemapinkg = new LinkedHashMap<String, Double>();
    public void setPrice(String key, Double value) {
        pricemapinkg.put(key, value);
    }
    public void setPrice(String key, String value) {
        double str1 = Double.parseDouble(value.split("/")[0]);
        pricemapinkg.put(key, str1);
    }

    public Double getPrice(String key) {
        return pricemapinkg.get(key);
    }

    public Double getQuantityInKg(String quantity,String metric,String vegetablename) {
        quantity = quantity.trim();
        Double quantinInt = Double.parseDouble(quantity);
        metric =metric.trim().toLowerCase();
        Double totalprice = null ;
        if(metric.contentEquals("g")) {
            Double vegetabalepriceinkg = getPrice(vegetablename);
            totalprice = vegetabalepriceinkg * quantinInt/1000;

        }
        else if(metric.contentEquals("kg")) {
            Double vegetabalepriceinkg = getPrice(vegetablename);
            totalprice = vegetabalepriceinkg * quantinInt;
        }
        return totalprice;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test3 t = new Test3();
        double rete=0;
        int s=0;
        t.setPrice("onion", "20/kg");t.setPrice("tomato","30/kg");
        t.setPrice("apple", "200/kg");t.setPrice("kiwi", "50/kg");
        t.setPrice("pulses", "50/kg");t.setPrice("rice", "34.5/kg");
        for(int i=0;i<3;i++) {
            String vegname = sc.next();
            vegname = vegname.toLowerCase();
            String quantity = sc.nextLine().toLowerCase();
            while(s<quantity.length()){
                if(quantity.charAt(s)==' ') quantity=quantity.substring(0,s)+quantity.substring(s+1);
                else s++;
            }
            int ml=1,len = quantity.length();
            if(quantity.charAt(len-2)=='k') ml=2;
            rete+= t.getQuantityInKg(quantity.substring(0,len-ml),quantity.substring(len-ml) , vegname);
        }
        System.out.println("Total Cost: RS "+rete);
    }

}