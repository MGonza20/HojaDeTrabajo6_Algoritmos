import com.sun.nio.sctp.Association;

import java.util.HashMap;
import java.util.Map;

public class HashMapp implements MAP {

    private HashMap<String , HashMap<String, Integer>> HM;

    //Luego completo el constructor
    public HashMapp(){
    }

    @Override
    public void add(String key, String value) {
        HM.getKey();
    }
        for(String i: HM.keySet()) {
            if(HM.get(i).equals(key)){
                data = i;
                System.out.println("key: " + i + " value: " + HM.get(i));
            }
        HM.put(key, value);
    }


    @Override
    public String showAllInfo() {
        String data;
        return null;
    }

    @Override
    public String showCategoryInfo(String producto) {
        String data = "";
        for (String i : HM.keySet()) {
            if(HM.get(i).equals(producto)){
                data = i;
                System.out.println("key: " + i + " value: " + HM.get(i));
            }
        }
        return data;
    }

}
