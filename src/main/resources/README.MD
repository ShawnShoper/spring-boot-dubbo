spring:
    dubbo:
        application:
            name: demo
            owner:  shawnshoper
        registry:
            address:  zookeeper://192.168.100.45:2181
        protocol:
            host: 127.0.0.1
            name: dubbo
            port: 20880