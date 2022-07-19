package com.linecorp.hbase;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

public class HitBaseAdmin {
    private final Configuration config;
    public HitBaseAdmin(String quorum, String port) {
        Configuration tmp_config = HBaseConfiguration.create();
        tmp_config.set("hbase.zookeeper.quorum", quorum);
        tmp_config.set("hbase.zookeeper.property.clientPort", port);
        this.config = tmp_config;
    }

    public HBaseAdmin getHBaseAdmin() throws IOException {
        return  new org.apache.hadoop.hbase.client.HBaseAdmin(config);
    }
}

