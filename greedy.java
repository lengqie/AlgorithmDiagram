package cn.devd.algorithmdiagram;

import java.util.*;

public class greedy {
    static Set<String> statesNeeds =new HashSet<>();
    static String[] str ={"mt", "wa", "or", "id", "nv", "ut", "ca", "az"};
    
    static Map<String, Set> stations =new HashMap<>();
    
    
    public static void main(String[] args) {
        Init();
        List<String> finalStations = new LinkedList<>();

        while (statesNeeds.size()!=0) {
            Set<String> states_covered = new HashSet<>();
            String best_stations = null;

            for (Map.Entry<String, Set> entry : stations.entrySet()) {
                Set<String> states_for_station = entry.getValue();
                states_for_station.retainAll(statesNeeds);  //交集 covered

                if (states_covered.size() < states_for_station.size()){
                    best_stations  = entry.getKey();
                    states_covered = states_for_station;
                }
            }
            statesNeeds.removeAll(states_covered);
            finalStations.add(best_stations);
        }
        System.out.println(finalStations);

    }

    private static void Init() {
        for (int i = 0; i < str.length; i++) {
            statesNeeds.add(str[i]);
        }
        //广播站
        Set<String> temp = new HashSet<>();
        temp.add("id");
        temp.add("nv");
        temp.add("ut");
        stations.put("kone", temp);

        Set<String> temp1 = new HashSet<>();
        temp1.add("wa");
        temp1.add("id");
        temp1.add("mt");
        stations.put("ktwo", temp1);

        Set<String> temp2 = new HashSet<>();
        temp2.add("or");
        temp2.add("nv");
        temp2.add("ca");
        stations.put("kthree", temp2);

        Set<String> temp3 = new HashSet<>();
        temp3.add("nv");
        temp3.add("ut");
        stations.put("kfour", temp3);

        Set<String> temp4 = new HashSet<>();
        temp4.add("ca");
        temp4.add("az");
        stations.put("kfive", temp4);
    }
}
