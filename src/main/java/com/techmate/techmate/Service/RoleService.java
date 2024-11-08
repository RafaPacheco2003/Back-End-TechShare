package com.techmate.techmate.Service;

import java.util.*;

import com.techmate.techmate.DTO.RoleDTO;

public interface RoleService {
    
    RoleDTO createRole(RoleDTO roleDTO);
    RoleDTO getRoleById(int roleId);
    RoleDTO updateRole(int roleId, RoleDTO roleDTO);
    List<RoleDTO> getAllRole();
    
    void cleanupRoleAssociations(int roleId);

    


    String getRoleNameById(int roleId);
}
