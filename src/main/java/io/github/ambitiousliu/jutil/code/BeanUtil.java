package io.github.ambitiousliu.jutil.code;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BeanUtil {

    /**
     * 根据属性名拷贝
     * @param source 源对象
     * @param supplier 生产者，生产一个目标对象的函数
     * @param <T> 目标对象类型
     * @return 目标对象
     */
    public static <T> T copyObject(Object source, Supplier<T> supplier) {
        T target = supplier.get();
        BeanUtils.copyProperties(source, target);
        return target;
    }
    public static <T> T copyObject(Object source, T target) {
        BeanUtils.copyProperties(source, target);
        return target;
    }

    /**
     * 根据属性名拷贝对象列表
     * @param sourceList 源对象列表
     * @param supplier 生产者，生产其中一个元素的函数，过程中会多次调用该函数
     * @param <T> 目标对象类型
     * @return 目标对象列表
     */
    public static <T> List<T> copyObjectList(List<?> sourceList, Supplier<T> supplier) {
        return sourceList.stream().map(source -> copyObject(source, supplier)).collect(Collectors.toList());
    }
}
