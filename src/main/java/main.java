import com.linecorp.hbase.HitBaseAdmin;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        HitBaseAdmin hitbase_admin = new HitBaseAdmin("apache-hbase001-test-cdh2-jp2v-dev.lineinfra-dev.com,apache-hbase002-test-cdh2-jp2v-dev.lineinfra-dev.com,apache-hbase003-test-cdh2-jp2v-dev.lineinfra-dev.com", "2181");
        HBaseAdmin admin = hitbase_admin.getAdmin();
        System.out.println(admin.getMaster());
    }
}
