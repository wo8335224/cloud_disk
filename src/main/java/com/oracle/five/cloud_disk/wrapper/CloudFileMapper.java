package com.oracle.five.cloud_disk.wrapper;

import com.oracle.five.cloud_disk.beans.CloudFile;
import java.util.List;

public interface CloudFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int deleteByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int insert(CloudFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    CloudFile selectByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    List<CloudFile> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int updateByPrimaryKey(CloudFile record);
}