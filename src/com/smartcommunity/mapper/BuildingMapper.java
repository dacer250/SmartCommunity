package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Building;
import com.smartcommunity.pojo.BuildingExample;

import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BuildingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int countByExample(BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int deleteByExample(BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int insert(Building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int insertSelective(Building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    List<Building> selectByExample(BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    Building selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int updateByExampleSelective(@Param("record") Building record, @Param("example") BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int updateByExample(@Param("record") Building record, @Param("example") BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int updateByPrimaryKeySelective(Building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Wed Jan 14 16:58:22 CST 2015
     */
    int updateByPrimaryKey(Building record);
    /** add */

    PageList<Building> selectByExample(BuildingExample example,edu.hust.smartcommunity.paginator.domain.PageBounds pageBounds);
    List<Building> selectNumberAndName();
}