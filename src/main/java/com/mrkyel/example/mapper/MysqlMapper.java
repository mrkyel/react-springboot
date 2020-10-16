package com.mrkyel.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MysqlMapper {
    Integer checkMySQLConnection();
}
