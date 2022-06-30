
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

import static org.apache.hadoop.hbase.util.Bytes.toBytes;

public class Main {

    public static void main(String[] args) throws IOException {
        Configuration config = HBaseConfiguration.create();
        config.set("hbase.zookeeper.quorum", "apache-hbase001-test-cdh2-jp2v-dev.lineinfra-dev.com,apache-hbase002-test-cdh2-jp2v-dev.lineinfra-dev.com,apache-hbase003-test-cdh2-jp2v-dev.lineinfra-dev.com");
        config.set("hbase.zookeeper.property.clientPort", "2181");
        // Instantiating HbaseAdmin class
        HBaseAdmin admin = new HBaseAdmin(config);

        // Instantiating table descriptor class
        HTableDescriptor tableDescriptor = new
                HTableDescriptor(TableName.valueOf("emp"));

        // Adding column families to table descriptor
        tableDescriptor.addFamily(new HColumnDescriptor("personal"));
        tableDescriptor.addFamily(new HColumnDescriptor("professional"));

        // Execute the table through admin
        admin.createTable(tableDescriptor);
        System.out.println(" Table created ");
    }
}
