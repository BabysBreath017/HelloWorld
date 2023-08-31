package com.mtdream.homework;

import java.util.*;

       /** 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
        *
        *  分别创建以下方法：
        *  (1) public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
        *  (2) public T get(String id)：从 map 中获取 id 对应的对象
        *  (3) public void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
        *  (4) public List<T> list()：返回 map 中存放的所有 T 对象
        *  (5) public void delete(String id)：删除指定 id 对象
        */
public class DAO <T>{//泛型类
    private Map<String, T>map = new HashMap<>();

    public T get(String id){ //从map中获取id对应的对象
        return map.get(id);
    }
    public void update(String id, T entity){ //
        map.put(id, entity);
    }
    // 要求：返回map中存放的所有T对象
    // 做法：遍历map「k-v」，将map的所有value（即entity），封装到ArrayList返回即可
    public List<T>list(){
        // 1.创建 ArrayList
        List<T> list = new ArrayList<>();

        // 2.用keySet方法来遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            // map.get(key)返回就是 User对象 -> ArrayList
            list.add(map.get(key));// 也可以直接使用本类的 get(String id),相当于list.add(get(key))
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
    public void save(String id, T entity){
        map.put(id, entity);
    }
}
