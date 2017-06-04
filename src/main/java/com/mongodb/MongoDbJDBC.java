package com.mongodb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by zmm on 17-5-10.
 */
public class MongoDbJDBC {


    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost",27017);
        MongoDatabase test = client.getDatabase("db_test");
        System.out.println(test);
        MongoCollection<Document> collection = test.getCollection("testlist");
        System.out.println(collection);
        FindIterable<Document> findIterable = collection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }

    }
}



