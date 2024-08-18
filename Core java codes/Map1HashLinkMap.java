


import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map1HashLinkMap {
    public static void main(String []args)
    {
        HashMap hm=new HashMap();
        hm.put(01, "virat");//Entry
        hm.put(02, "Rohit");
        hm.put(03, 23424);
        hm.put(03, 234546);
        hm.put("dpof", "virat");
        hm.put(null, null);
        hm.put(null, "gvetesr");
        hm.put("mifb", null);
        hm.put("mi", null);
        System.out.println(hm);



        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(01, "virat");//Entry
        lhm.put(02, "Rohit");
        lhm.put(03, "virat");
        lhm.put("kj", 23424);//here same key value may upgrade
        lhm.put(null, "lrfewrf");
        System.out.println(lhm);
    }
}
