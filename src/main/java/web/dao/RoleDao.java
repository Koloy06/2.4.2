package web.dao;

import web.model.Role;

public interface RoleDao {

    Role findByRolename(String name);
}
