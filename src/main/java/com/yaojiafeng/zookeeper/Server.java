package com.yaojiafeng.zookeeper;

import org.apache.zookeeper.server.quorum.QuorumPeerMain;

/**
 * Created by yaojiafeng on 2018/3/30 下午12:17.
 */
public class Server {
    public static void main(String[] args) {
        String cfg = Thread.currentThread().getContextClassLoader().getResource("zoo.cfg").getFile();
        args = new String[]{cfg};

        System.getProperties().setProperty("zookeeper.log.dir", ".");

        QuorumPeerMain.main(args);
    }
}
