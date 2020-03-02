package com.swz.gmall.pms.conf;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

@Configuration
public class ShardingJDBC {
    @Bean
    public DataSource createSource() throws IOException, SQLException {
        File conf = ResourceUtils.getFile("classpath:shardingJDBC.yaml");
        return MasterSlaveDataSourceFactory.createDataSource(conf);
    }
}
