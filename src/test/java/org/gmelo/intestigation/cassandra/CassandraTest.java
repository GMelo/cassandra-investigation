package org.gmelo.intestigation.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.gmelo.intestigation.util.GenerateRandomSampleModel;
import org.gmelo.investigation.model.Model;
import org.junit.Test;

/**
 * Created by gmelo on 12/04/17.
 */
public class CassandraTest {

    private String createTable = "CREATE TABLE test.sampleModel (\n" +
            "  id text PRIMARY KEY,\n" +
            "  field1 text,\n" +
            "  field2 text,\n" +
            "  timestamp timestamp,\n" +
            "  value double,\n" +
            "  anotherValue double,\n" +
            "  field3 text,\n" +
            ");";

    private String createKeySpace = "CREATE KEYSPACE test\n" +
            "WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};";

    private String deleteTable = "DROP TABLE IF EXISTS test.sampleModel";

    private String deleteKeySpace = "DROP KEYSPACE IF EXISTS test";

    @Test
    public void testConnection() {
        Cluster cluster;
        Session session;

        // Connect to the cluster and keyspace "demo"
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        session = cluster.newSession();
        session.execute(deleteTable);
        //
        session.execute(deleteKeySpace);
        //
        // Insert one record into the users table
        session.execute(createKeySpace);
        session.execute(createTable);
    }

    @Test
    public void testInsert() {
        Cluster cluster;
        Session session;

        // Connect to the cluster and keyspace "demo"
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        session = cluster.connect("test");
        Model model = GenerateRandomSampleModel.generateRandomSampleModel();
        System.out.println(model.getInsertStatement());
        session.execute(model.getInsertStatement());

    }


}
