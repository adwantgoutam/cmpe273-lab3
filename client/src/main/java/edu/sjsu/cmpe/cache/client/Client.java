package edu.sjsu.cmpe.cache.client;
import java.util.ArrayList;
import com.google.common.hash.Hashing;
public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting Cache Client...");
        ArrayList<String> ch1 = new ArrayList<String>(); 
        ch1.add("http://localhost:3000");
        ch1.add("http://localhost:3001");
        ch1.add("http://localhost:3002");
        ConsistentHash<String> ch=new ConsistentHash<String>(Hashing.md5(),3,ch1);
        
        CacheServiceInterface cache1 = new DistributedCacheService(ch.get(1));
        cache1.put(1,"a");
        System.out.println("put("+1+")=> "+ "a");

        CacheServiceInterface cache2 = new DistributedCacheService(ch.get(2));
        cache2.put(2,"b");
        System.out.println("put("+2+")=> "+ "b");

        CacheServiceInterface cache3 = new DistributedCacheService(ch.get(3));
        cache3.put(3,"c");
        System.out.println("put("+3+")=> "+ "c");

        CacheServiceInterface cache4 = new DistributedCacheService(ch.get(4));
        cache4.put(4,"d");
        System.out.println("put("+4+")=> "+ "d");

        CacheServiceInterface cache5 = new DistributedCacheService(ch.get(5));
        cache5.put(5,"e");
        System.out.println("put("+5+")=> "+ "e");

        CacheServiceInterface cache6 = new DistributedCacheService(ch.get(6));
        cache6.put(6,"f");
        System.out.println("put("+6+")=> "+ "f");

        CacheServiceInterface cache7 = new DistributedCacheService(ch.get(7));
        cache7.put(7,"g");
        System.out.println("put("+7+")=> "+ "g");

        CacheServiceInterface cache8 = new DistributedCacheService(ch.get(8));
        cache8.put(8,"h");
        System.out.println("put("+8+")=> "+ "h");

        CacheServiceInterface cache9 = new DistributedCacheService(ch.get(9));
        cache9.put(9,"i");
        System.out.println("put("+9+")=> "+ "i");

        CacheServiceInterface cache10 = new DistributedCacheService(ch.get(10));
        cache10.put(10,"j");
        System.out.println("put("+10+")=> "+ "j");
     
        System.out.println("Retrieving");
        System.out.println("get("+1+")=> "+ cache1.get(1));
        System.out.println("get("+2+")=> "+ cache2.get(2));
        System.out.println("get("+3+")=> "+ cache3.get(3));
        System.out.println("get("+4+")=> "+ cache4.get(4));
        System.out.println("get("+5+")=> "+ cache5.get(5));
        System.out.println("get("+6+")=> "+ cache6.get(6));
        System.out.println("get("+7+")=> "+ cache7.get(7));
        System.out.println("get("+8+")=> "+ cache8.get(8));
        System.out.println("get("+9+")=> "+ cache9.get(9));
        System.out.println("get("+10+")=> "+ cache10.get(10));
        System.out.println("Existing Cache Client...");
    }

}