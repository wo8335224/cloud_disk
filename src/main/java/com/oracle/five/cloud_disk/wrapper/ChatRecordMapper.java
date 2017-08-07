package com.oracle.five.cloud_disk.wrapper;

import com.oracle.five.cloud_disk.beans.ChatRecord;
import java.util.List;

public interface ChatRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAT_RECORD
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAT_RECORD
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int insert(ChatRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAT_RECORD
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    ChatRecord selectByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAT_RECORD
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    List<ChatRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHAT_RECORD
     *
     * @mbg.generated Sat Aug 05 14:04:49 CST 2017
     */
    int updateByPrimaryKey(ChatRecord record);
}