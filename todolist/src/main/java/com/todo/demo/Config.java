package com.todo.demo;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.cluster.ClusterInfo;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Collections;
import java.util.List;

@Configuration
public class Config extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("127.0.0.1");
    }

    @Override
    protected String getBucketName() {
        return "todolist";
    }

    @Override
    protected String getBucketPassword() {
        return null;
    }

    @Override
    protected String getUsername() {
        return super.getUsername();
    }

    @Override
    protected CouchbaseEnvironment getEnvironment() {
        DefaultCouchbaseEnvironment.builder().connectTimeout(15000);
        return super.getEnvironment();
    }
}
