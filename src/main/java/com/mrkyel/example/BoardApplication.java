package com.mrkyel.example;

import com.mrkyel.example.mapper.MysqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication implements CommandLineRunner {

    @Autowired
    private MysqlMapper mysqlMapper;

    public static void main (String[] args) { SpringApplication.run(BoardApplication.class, args);}

    @Override
    public void run (String... args) throws Exception {
        try {
            System.out.println("DB 커넥션 체크 :" + mysqlMapper.checkMySQLConnection());
        }catch (Exception e) {
            System.out.println("DB 연결 실패" );
            e.printStackTrace();
        }
    }
}
