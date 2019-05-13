package com.ogic.springbootmybatisdemo.mapper;

import com.ogic.springbootmybatisdemo.bean.DepartmentBean;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    public DepartmentBean getDeptById(Integer id);

    @Delete("DELETE FROM department WHERE id = #{id}")
    public Integer deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO department(departmentName) VALUES(#{departmentName})")
    public Integer insertDept(DepartmentBean departmentBean);

    @Update("UPDATE department SET departmentName=#{departmentName} WHERE id = #{id}")
    public Integer updateDept(DepartmentBean departmentBean);
}
