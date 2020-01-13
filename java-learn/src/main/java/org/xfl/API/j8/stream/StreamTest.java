package org.xfl.API.j8.stream;

import com.alibaba.fastjson.JSON;
import org.xfl.OOP.BadEnviroment;
import org.xfl.OOP.GoodEnvironment;
import org.xfl.OOP.Jon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void  main(String args[]){
        //collection
        List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("count:" + count);
        List<String> filtered = strings.stream().filter(string -> string.length() == 3).filter(string -> string.charAt(0) == 'a').collect(Collectors.toList());
        System.out.println("filtered list:" + JSON.toJSONString(filtered));
        List<String> loopChange = strings.stream().map(string -> string + "cafebaby").distinct().collect(Collectors.toList());
        System.out.println("loopChange list:" + JSON.toJSONString(loopChange));

        Jon healthJon = new Jon(new GoodEnvironment(true,true,true),"smith",20);
        Jon illJon = new Jon(new BadEnviroment(false,false,false),"ill",18);
        Jon richJon = new Jon(new GoodEnvironment(true,false,false),"rich",19);
        List<Jon> jons = Arrays.asList(healthJon,illJon,richJon);
        /**
        for (Jon jon:jons){
            jon.setLearn(true);
        }
         **/
        List<Jon> resJon = jons.stream().filter(jon -> !jon.environment.isHealth).peek(jon -> jon.setLearn(true)).distinct().collect(Collectors.toList());

        System.out.println("jon list:" + JSON.toJSONString(resJon));
    }
}
