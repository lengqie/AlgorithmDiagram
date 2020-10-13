package cn.devd.algorithmdiagram;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static String[] names={"you", "alice", "bob", "claire","anuj","peggy","thom","jonny"};
    static String[][] graph ={
            {"you","alice"},
            {"you","bob"},
            {"you","claire"},
            {"bob","anuj"},
            {"bob","peggy"},
            {"alice","peggy"},
            {"claire","thom"},
            {"claire","jonny"},

    };
    public static void main(String[] args) {
        search();
    }
    private static void search(){
        Queue<String> queue =new LinkedList<>();
        Queue<String> searched =new LinkedList<>();

        for(int i =0;i<names.length;i++){
            queue.add(names[i]);
        }

        while (!queue.isEmpty()){
            String person =queue.poll();
            if(!searched.contains(person)){
                if(isPerson(person)){
                    System.out.println(person+"\t找到了！");
                    return;
                }
                for(int i =0;i<graph.length;i++){
                    if(graph[i][0].equals(person))
                        searched.add(graph[i][1]);
                }
                searched.add(person);
            }
        }
    }
    private static boolean isPerson(String name){
        return name.charAt(name.length() -1) =='m';
    }
}
