package com.neusoft.srm.mapper.menu;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.neusoft.srm.model.menu.Menu;

@Mapper
public interface MenuMapper {
	/**
	 * @部门：上海软件研发中心
	 * @功能：查询所有菜单信息
	 * @描述：
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：返回所有菜单信息
	 * @作成时间：2018/12/16
	 */
	List<Map<String, String>> getAllMenu();
	/**
	 * @部门：上海软件研发中心
	 * @功能：新增菜单
	 * @描述：参数  menu 菜单对象信息
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：
	 * @作成时间：2018/12/16
	 */
	int insertMenu(@Param("menu") Menu menu);
	/**
	 * @部门：上海软件研发中心
	 * @功能：修改菜单
	 * @描述：参数 menu 菜单对象信息
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：
	 * @作成时间：2018/12/16
	 */
	int updateMenu(@Param("menu") Menu menu);
	/**
	 * @部门：上海软件研发中心
	 * @功能：逻辑删除菜单
	 * @描述：参数 menuCode 菜单代码    operatorCode 操作人代码
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：
	 * @作成时间：2018/12/16
	 */
	int deleteMenu(@Param("menuCode")String menuCode,@Param("operatorCode")String operatorCode);
	/**
	 * @部门：上海软件研发中心
	 * @功能：当type=1时，查找父菜单下的子菜单的最大的AuthCode,当新增菜单时，authCode+1
	 * @描述：参数 parentMenuCode 父菜单代码
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：返回父菜单下子菜单中最大的authCode值
	 * @作成时间：2018/12/16
	 */
	String findMaxAuthCodeByparentMenuCode(@Param("parentMenuCode")String parentMenuCode);
	/**
	 * @部门：上海软件研发中心
	 * @功能：当type=1时，查找父菜单下的子菜单的最大的SortNo,当新增菜单时，SortNo+1
	 * @描述：参数 parentMenuCode 父菜单代码
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：返回父菜单下子菜单中最大的sortNo值
	 * @作成时间：2018/12/16
	 */
	int findMaxSortNoByparentMenuCode(@Param("parentMenuCode")String parentMenuCode);
	/**
	 * @部门：上海软件研发中心
	 * @功能：当type=2时，查找目录最大的SortNo,当新增目录时，SortNo+1
	 * @描述：参数 type 菜单类型
	 * @author WGL
	 * @作成者：王高亮
	 * @返回值：
	 * @作成时间：2018/12/16
	 */
	int findMaxParentSortNo(int type);
}
