package com.oracle.five.cloud_disk.wrapper;

import com.oracle.five.cloud_disk.beans.Dialogue;
import java.util.List;

public interface DialogueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIALOGUE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int deleteByPrimaryKey(Integer dialogueId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIALOGUE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int insert(Dialogue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIALOGUE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    Dialogue selectByPrimaryKey(Integer dialogueId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIALOGUE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    List<Dialogue> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DIALOGUE
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int updateByPrimaryKey(Dialogue record);
}