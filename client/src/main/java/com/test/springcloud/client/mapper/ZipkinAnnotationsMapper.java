package com.test.springcloud.client.mapper;

import com.test.springcloud.client.entity.ZipkinAnnotations;
import java.util.List;

public interface ZipkinAnnotationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipkin_annotations
     *
     * @mbggenerated
     */
    int insert(ZipkinAnnotations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zipkin_annotations
     *
     * @mbggenerated
     */
    List<ZipkinAnnotations> selectAll();
}