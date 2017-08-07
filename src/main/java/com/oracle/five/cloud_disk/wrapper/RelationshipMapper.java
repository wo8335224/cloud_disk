package com.oracle.five.cloud_disk.wrapper;

import com.oracle.five.cloud_disk.beans.Relationship;
import java.util.List;

public interface RelationshipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RELATIONSHIP
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int deleteByPrimaryKey(Integer relationshipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RELATIONSHIP
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int insert(Relationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RELATIONSHIP
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    Relationship selectByPrimaryKey(Integer relationshipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RELATIONSHIP
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    List<Relationship> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RELATIONSHIP
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int updateByPrimaryKey(Relationship record);
}