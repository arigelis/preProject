package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // реализуйте алгоритм здесь
        jm.task.core.jdbc.util.Util util = new Util();
        util.getProperties();
        Main main = new Main();
        main.test();
//        Connection connection = jm.task.core.jdbc.util.Util.getConnection();
    }

    public void test(){
        List<User> a = new UserServiceImpl().getAllUsers();
        System.out.println("dasd");
    }
}
