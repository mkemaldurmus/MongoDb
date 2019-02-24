package Data;

import com.mongodb.*;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient=new MongoClient("localhost",27017);
        DB db=mongoClient.getDB("kemal");
        DBCollection dbCollection=db.getCollection("user");
        BasicDBObject basicDBObject=new BasicDBObject();
        basicDBObject.put("name","ben");
        basicDBObject.put("şehir ","bayburt");
        WriteResult writeResult= dbCollection.insert(basicDBObject);
        System.out.println((writeResult));
        DBCursor cursor=dbCollection.find(new BasicDBObject("name","ben"));
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
        BasicDBObject quary=new BasicDBObject();


    }
}