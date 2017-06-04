package com.efjava.demo1;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by user on 17-6-3.
 */
public class AppClient {

    public static void main(String[] args) {






        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp", COMP_PROVIDER);
        Services.registerProvider("armed", ARMED_PROVIDER);

        // Clients would execute these lines
        Service s1 = Services.newInstance();
        Service s2 = Services.newInstance("comp");
        Service s3 = Services.newInstance("armed");
        System.out.printf("%s, %s, %s%n", s1, s2, s3);

        //提供者 提供服务,服务者提供一个提供者注册容器,这样只需要将提供者绑定到容器即可,服务者仅是一个实例,而且提供者实现服务即可,不担心系统内部有什么其他的变化调用,提供了一个标准,而且还是单例(适配器模式)

    }

    private static Provider DEFAULT_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default service";
                }
            };
        }
    };


    private static Provider COMP_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Complementary service";
                }
            };
        }
    };

    private static Provider ARMED_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Armed service";
                }
            };
        }
    };




}
