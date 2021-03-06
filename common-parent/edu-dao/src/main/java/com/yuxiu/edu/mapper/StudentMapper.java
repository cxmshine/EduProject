package com.yuxiu.edu.mapper;

import com.yuxiu.edu.model.Student;
import com.yuxiu.edu.model.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    Student selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sat Mar 23 10:41:02 CST 2019
     */
    int updateByPrimaryKey(Student record);
}