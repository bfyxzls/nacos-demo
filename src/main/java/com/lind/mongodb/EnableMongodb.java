package com.lind.mongodb;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 自定义注释，引用不同包里的配置默认项.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(MongodbSelector.class)
public @interface EnableMongodb {
}
