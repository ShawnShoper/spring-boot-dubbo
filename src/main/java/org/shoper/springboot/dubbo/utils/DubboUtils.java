package org.shoper.springboot.dubbo.utils;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.alibaba.dubbo.config.spring.ServiceBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ShawnShoper on 16/7/21.
 */
public class DubboUtils {
    /**
     * 发布接口
     *
     * @param t
     * @param iface
     * @param <T>
     * @return
     */
    public static <T> ServiceBean<T> export(T t, Class<T> iface) {
        ServiceBean<T> serviceBean = new ServiceBean<T>();
        serviceBean.setRef(t);

        serviceBean.setInterface(iface);
        return serviceBean;
    }

    /**
     * 接口引用
     *
     * @param iface
     * @param <T>
     * @return
     */
    public static <T> ReferenceBean<T> ref(Class<T> iface) {
        ReferenceBean<T> referenceBean = new ReferenceBean<T>();
        referenceBean.setInterface(iface);
        referenceBean.setProtocol("dubbo");
        return referenceBean;
    }
}
