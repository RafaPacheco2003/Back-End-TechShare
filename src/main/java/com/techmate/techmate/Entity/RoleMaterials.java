package com.techmate.techmate.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role_materials")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleMaterials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_materials_id")
    private int roleMaterialsId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "materials_id", nullable = false)
    private Materials materials;

    public RoleMaterials(Integer id, Role role, Materials materials) {
        this.roleMaterialsId = id;
        this.role = role;
        this.materials = materials;
    }

}