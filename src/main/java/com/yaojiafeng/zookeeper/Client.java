package com.yaojiafeng.zookeeper;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeperMain;

import java.io.IOException;

/**
 * Created by yaojiafeng on 2018/3/30 下午1:05.
 */
public class Client {
    public static void main(String[] args) {
        try {
            args = new String[]{"-timeout 60000"};
            ZooKeeperMain.main(args);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
