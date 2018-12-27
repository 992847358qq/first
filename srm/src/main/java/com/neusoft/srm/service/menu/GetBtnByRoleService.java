package com.neusoft.srm.service.menu;

import java.util.List;
import com.neusoft.srm.model.menu.MenuButton;

public interface GetBtnByRoleService {
	/**
  	 * @部门：上海软件研发中心
  	 * @功能：查询当前角色权限能操作的按钮信息
  	 * @描述：参数 岗位代码 postCode  菜单代码  menuCode
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      List<MenuButton> getMenuBtnByRoleCode(String postCode,String menuCode);
}
