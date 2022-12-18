import com.linecorp.hbase.HitBaseAdmin;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        HitBaseAdmin hitbase_admin = new HitBaseAdmin("ubuntu01,ubuntu02,ubutnu03", "2181");
        HBaseAdmin admin = hitbase_admin.getAdmin();
        System.out.println(admin.getMaster());
    }
}
