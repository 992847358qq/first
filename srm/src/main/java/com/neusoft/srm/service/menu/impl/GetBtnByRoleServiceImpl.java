package com.neusoft.srm.service.menu.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.srm.mapper.menu.GetBtnByRoleMapper;
import com.neusoft.srm.model.menu.MenuButton;
import com.neusoft.srm.service.menu.GetBtnByRoleService;

@Service
public class GetBtnByRoleServiceImpl implements GetBtnByRoleService{
	@Autowired
	private GetBtnByRoleMapper getBtnByRoleMapper;
	/**
	 * @部门：上海软件研发中心
	 * @功能：查询当前角色操作菜单的按钮信息
	 * @描述：参数 roleCode 角色代码   menuCode  菜单代码
	 * @返回值：list集合，装载menuButton对象
	 * @author WGL
	 * @作成者：王高亮
	 * @作成时间：2018/12/16
	 */
	@Override
	public List<MenuButton> getMenuBtnByRoleCode(String postCode, String menuCode) {
		List<MenuButton> findMenuBtnByRole = getBtnByRoleMapper.findMenuBtnByRoleCode(postCode, menuCode);
		return findMenuBtnByRole;
	}
}
